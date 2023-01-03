package students;

import java.util.Comparator;

public class StudentsLastNameComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {

		String lastName1 = student1.getLastName().toLowerCase();
		String lastName2 = student2.getLastName().toLowerCase();

		if (lastName1.compareTo(lastName2) > 0) {
			return 1;
		}
		if (lastName1.compareTo(lastName2) < 0) {
			return -1;
		}

		return 0;
	}

}
