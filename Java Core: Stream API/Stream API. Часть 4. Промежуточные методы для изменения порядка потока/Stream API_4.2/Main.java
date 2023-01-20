package streamapitwo;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Student student1 = new Student("Alex", "Zakharov", Gender.MALE, 18);
		Student student2 = new Student("Dmytro", "Smoove", Gender.MALE, 20);
		Student student3 = new Student("Vadim", "Miller", Gender.MALE, 22);
		Student student4 = new Student("Yana", "Akimova", Gender.FEMALE, 21);

		Student[] studentsArr = { student1, student2, student3, student4 };
		
		Arrays.stream(studentsArr)
			.filter(a -> a.getAge() > 20)
			.sorted((a, b) -> a.getLastName().compareTo(b.getLastName()))
			.forEach(a -> System.out.println(a));

	}

}
