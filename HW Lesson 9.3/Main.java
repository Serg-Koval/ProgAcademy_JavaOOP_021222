package three;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		File file = new File("/Java_Start20221026_projects/OOP_Lesson9_HW_base/romeo.txt");
		String poem = getInfo(file);

		// charArray
		char[] lettersChar = poem.toCharArray();				

		List<Pair> lettersPairs1 = new ArrayList<>();
		makeLettersPairs(lettersPairs1);

		fillLettersPairs(lettersChar, lettersPairs1);
		System.out.println("Unsorted: " + System.lineSeparator() + lettersPairs1);
		System.out.println();

		lettersPairs1.sort(new PairsComparator());
		System.out.println("Sorted: " + System.lineSeparator() + lettersPairs1);
		System.out.println();
		
		// Iterator
		StringIterator iterator = new StringIterator(poem);
		
		List<Pair> lettersPairs2 = new ArrayList<>();
		makeLettersPairs(lettersPairs2);
		
		List<Character> lettersFromText = new ArrayList<>();
		for (; iterator.hasNext();) {
			lettersFromText.add(iterator.next());
		}
		
		
		fillLettersParisWithIterator(lettersFromText, lettersPairs2);
		System.out.println("Unsorted (iterator): " + System.lineSeparator() + lettersPairs2);
		System.out.println();
		
		lettersPairs2.sort(new PairsComparator());
		System.out.println("Sorted (iterator) " + System.lineSeparator() + lettersPairs1);
		System.out.println();
		
	}

	public static String getInfo(File file) {
		String text = "";

		try (Scanner scanner = new Scanner(file)) {
			for (; scanner.hasNextLine();) {
				text += scanner.nextLine() + System.lineSeparator();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return text;
	}

	public static void makeLettersPairs(List<Pair> lettersPairs) {

		for (int i = 0; i < 26; i++) {
			lettersPairs.add(new Pair((char) ('a' + i), 0));
		}
	}

	public static void fillLettersPairs(char[] letters, List<Pair> lettersPairs) {
		for (int i = 0; i < letters.length; i++) {
			for (Pair pair : lettersPairs) {
				if (letters[i] == pair.getLetter()) {
					pair.setCounter(pair.getCounter() + 1);
				}
			}
		}
	}

	public static void fillLettersParisWithIterator(List<Character> lettersFromText, List<Pair> lettersPairs) {
		for (Character c : lettersFromText) {
			for (Pair pair : lettersPairs) {
				if (c.equals(pair.getLetter())) {
					pair.setCounter(pair.getCounter() + 1);
				}
			}
		}
	}
}
