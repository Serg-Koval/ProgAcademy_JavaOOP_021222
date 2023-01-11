package functiontwo;

import java.util.function.Function;

public class Main {

	public static void main(String[] args) {
		
		String text = "aaaaaaaaabaaaaaaaz";
		Function<String, Integer> fn = Main::fingConsonantsInString;
		
		Integer consonants = fn.apply(text);
		System.out.println(consonants);

	}

	public static Integer fingConsonantsInString(String text) {
		char[] consonants = { 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w',
				'y', 'z' };
		char[] letters = text.toCharArray();
		Integer counter = 0;

		for (int i = 0; i < consonants.length; i++) {
			for (int j = 0; j < letters.length; j++) {
				if (consonants[i] == letters[j]) {
					counter += 1;
					continue;
				}
			}
		}
		return counter;
	}

}
