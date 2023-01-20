package streamapione;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		String text = "The xxx lamp must be replenish'd, but even then it will not burn so long as I must watch";
		
		Arrays.stream(text.split(" "))
			.filter(Main::isVowelsInString)
			.sorted(Main::vowelsCompare)
			.forEach(a -> System.out.println(a));
	
	}

	public static boolean isVowelsInString(String s) {
		char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};
		char[] chars = s.toLowerCase().toCharArray();
		
		for (char letter : chars) {
			for (char vowel : vowels) {
				if(letter == vowel) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static int countVowels(String s) {
		char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'y' };
		int counter = 0;

		char[] chars = s.toLowerCase().toCharArray();

		for (char letter : chars) {
			for (char vowel : vowels) {
				if (letter == vowel) {
					counter += 1;
				}
			}
		}
		return counter;
	}
	
	public static int vowelsCompare (String s1, String s2) {
		return countVowels(s1) - countVowels(s2);
	}
}
