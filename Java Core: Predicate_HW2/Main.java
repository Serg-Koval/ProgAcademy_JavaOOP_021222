package predicatetwo;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>(
				List.of("Anna", "Ira", "Katia", "Anna", "Hanna", "Zina", "Natasha", "Tina"));
		
		System.out.println("Original list:" + System.lineSeparator() + names);

		Character[] firstLetters = new Character[] { 'h', 'a', 't' };

		for (Character character : firstLetters) {
			names.removeIf(a -> a.toLowerCase().startsWith(character.toString()));
		}

		System.out.println(names);
	}

}
