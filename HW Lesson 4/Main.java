package students;

public class Main {

	public static void main(String[] args) {

		Group group1 = new Group("botanic");
		Group group2 = new Group("programming");

		Student student1 = new Student("Alex", "Zakharov", Gender.MALE);
		Student student2 = new Student("Dmytro", "Smoove", Gender.MALE);
		Student student3 = new Student("Vadim", "Miller", Gender.MALE);
		Student student4 = new Student("Yana", "Akimova", Gender.FEMALE);
		Student student5 = GetStudentsData.createStudent();

		try {
			group1.addStudent(student1);
			group1.addStudent(student2);
			group1.addStudent(student3);
			group1.addStudent(student4);
			group1.addStudent(student5);

		} catch (GroupOverflowException e) {
			e.printStackTrace();
		}
		System.out.println();
		
		System.out.println(group1);

		try {
			System.out.println(group1.searchStudentByLastName("Smoove"));
		} catch (StudentNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println();

		try {
			System.out.println(group1.searchStudentByLastName("Koval"));
		} catch (StudentNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println();

		System.out.println(group1.removeStudentByID(3));
		System.out.println();

		System.out.println(group1);
		System.out.println();

		try {
			group1.addStudent(student3);
		} catch (GroupOverflowException e) {
			e.printStackTrace();
		}

		System.out.println(group1);
		
		CSVStringConverter csvConverter = new CSVStringConverter();
		String studentData = csvConverter.toStringRepresentation(student1);
		System.out.println(studentData);
		
		Student student6 = csvConverter.fromStringRepresentation(studentData);
		System.out.println(student6.toString());

	}

}
