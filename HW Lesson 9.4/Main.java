package four;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Deque<String> company = new ArrayDeque<>();
		company.addLast("Sheldon");
		company.addLast("Leonard");
		company.addLast("Volovitc");
		company.addLast("Kutrapalli");
		company.addLast("Penni");
		
		System.out.println("Brave company BEFORE drinking nuclear cola..." + System.lineSeparator() + company + System.lineSeparator());
		
		System.out.println("How many cola glasses are in the machine?");
		
		int numberOfGlasses = 0;
		try (Scanner scanner = new Scanner(System.in)) {
			numberOfGlasses = scanner.nextInt();
		}
		System.out.println();
		
		doubleColaDrinking(company, numberOfGlasses);
		
		System.out.println("Brave company AFTER drinking nuclear cola..." + System.lineSeparator() + company + System.lineSeparator());
		
	}

	public static Deque<String> doubleColaDrinking(Deque<String> deque, int number) {
		for (int i = 0; i < number; i++) {
			String person = deque.pollFirst();
			deque.addLast(person);
			deque.addLast(person);
		}
		return deque;
	}
	
}
