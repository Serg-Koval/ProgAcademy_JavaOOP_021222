package students;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Group {

	private String groupName;
	private ArrayList<Student> students;
	private final int GROUPSIZE = 10;

	public Group(String groupName, ArrayList<Student> students) {
		super();
		this.groupName = groupName;
		this.students = students;
	}
	
	public Group(String groupName) {
		super();
		this.groupName = groupName;
		students = new ArrayList<Student>();
	}

	public Group() {
		super();
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		sortStudentsByLastName();

		String groupList = "Group " + groupName + ", students:" + System.lineSeparator();

		for (Student student : students) {
			groupList += "id " + student.getId() + ": " + student.getLastName() + " " + student.getName()
					+ System.lineSeparator();
		}

		return groupList;
	}

	@Override
	public int hashCode() {

		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {

		return super.equals(obj);
	}

	public void addStudent(Student student) throws GroupOverflowException {

		if (students.size() >= GROUPSIZE) {
			throw new GroupOverflowException();
		}

		students.add(student);
		student.setGroupName(groupName);
		student.setId(1);

		for (int i = 0; i < students.size() - 1; i++) {
			if (students.get(i).getId() == student.getId()) {
				student.setId(student.getId() + 1);
				i = -1;
			}
		}
	}

	public Student searchStudentByLastName(String lastName) throws StudentNotFoundException {

		for (Student student : students) {
			if (student.getLastName().equals(lastName)) {
				return student;
			}
		}

		throw new StudentNotFoundException();
	}

	public boolean removeStudentByID(int id) {

		for (Student student : students) {
			if (student.getId() == id) {
				students.remove(student);
				return true;
			}
		}

		return false;
	}

	public void sortStudentsByLastName() {
		students.sort(new StudentsLastNameComparator());
	}

	public boolean duplicateStudentsComparator() {

		for (int i = 0; i < students.size(); i++) {
			for (int j = 0; j < students.size(); j++) {
				if (i != j && students.get(i).equals(students.get(j))) {
					System.out.println("The group " + groupName + " has dupicate students");
					return true;
				}
			}
		}

		System.out.println("The group " + groupName + " has NOT dupicate students");
		return false;

	}
}
