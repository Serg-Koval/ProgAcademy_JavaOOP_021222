package students;

import java.util.Scanner;

public class GetStudentsData {
	
	private static Scanner scanner = new Scanner(System.in);

	public static void inputFirstName(Human student) {
		System.out.println("Please enter the first name: ");
		student.setName(scanner.nextLine());
	}

	public static void inputLastName(Human student) {
		System.out.println("Please enter the last name: ");
		student.setLastName(scanner.nextLine());
	}

	public static void inputGender(Human student) {
		System.out.println("Please enter the gender: m/f");
		for (;;) {
			String gender = scanner.nextLine();
			if(gender.toLowerCase().equals("m")) {
				student.setGender(Gender.MALE);
				return;
			}
			if(gender.toLowerCase().equals("f")) {
				student.setGender(Gender.FEMALE);
				return;
			}
			System.out.println("Try again, you should enter m/l");
		}
	}

	public static Student createStudent() {
		Student student = new Student();
		System.out.println("Please fill the necessary data fileds for the new student: ");
		inputFirstName(student);
		inputLastName(student);
		inputGender(student);
		return student;
	}

}
