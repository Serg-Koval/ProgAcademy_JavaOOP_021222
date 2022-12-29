package students;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class Group {

	private String groupName;
	private final Student[] students;

	public Group(String groupName) {
		super();
		this.groupName = groupName;
		students = new Student[10];
	}

	public Group() {
		super();
		students = new Student[10];
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Student[] getStudents() {
		return students;
	}

	@Override
	public String toString() {
		sortStudentsByLastName();

		String groupList = "Group " + groupName + ", students:" + System.lineSeparator();

		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				groupList += "id " + students[i].getId() + ": " + students[i].getLastName() + " "
						+ students[i].getName() + System.lineSeparator();
			}
		}
		return groupList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(students);
		result = prime * result + Objects.hash(groupName);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Group other = (Group) obj;
		return Objects.equals(groupName, other.groupName) && Arrays.equals(students, other.students);
	}

	public void addStudent(Student student) throws GroupOverflowException {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = student;

				student.setGroupName(groupName);
				if (student.getId() == 0) {
					student.setId(1);
				}

				for (int j = 0; j < students.length; j++) {

					if (students[j] != null && j != i) {
						if (students[j].getId() == student.getId()) {
							j = -1;
							student.setId(student.getId() + 1);
							;
							continue;
						}
					}
				}
				return;
			}
		}
		throw new GroupOverflowException();
	}

	public Student searchStudentByLastName(String lastName) throws StudentNotFoundException {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				if (students[i].getLastName().equals(lastName)) {
					return students[i];
				}
			}
		}
		throw new StudentNotFoundException();
	}

	public boolean removeStudentByID(int id) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				if (students[i].getId() == id) {
					students[i] = null;
					return true;
				}
			}
		}
		return false;
	}

	public void sortStudentsByLastName() {
		Arrays.sort(students, Comparator.nullsLast(new StudentsLastNameComparator()));
	}

	public boolean duplicateStudentsComparator() {
		for (int i = 0; i < students.length; i++) {
			for (int j = 0; j < students.length; j++) {
				if (students[i] != null && students[j] != null & i != j && students[i].equals(students[j])) {
					System.out.println("The group " + groupName + " has dupicate students");
					return true;
				}
			}
		}
		System.out.println("The group " + groupName + " has NOT dupicate students");
		return false;
	}
}
