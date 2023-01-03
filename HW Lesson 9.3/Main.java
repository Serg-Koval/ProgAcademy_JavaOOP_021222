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
		char[] lettersChar = poem.toCharArray();

		List<Pair> lettersPairs = new ArrayList<>();
		makeLettersPairs(lettersPairs);
		
		fillLettersPairs(lettersChar, lettersPairs);
		System.out.println("Unsorted: " + System.lineSeparator() + lettersPairs);
		System.out.println();
		
		lettersPairs.sort(new PairsComparator());
		System.out.println("Sorted: " + System.lineSeparator() + lettersPairs);
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

	public static List<Pair> makeLettersPairs(List<Pair> lettersPairs) {
		for (int i = 0; i < 26; i++) {
			lettersPairs.add(new Pair((char) ('a' + i), 0));
		}
		return lettersPairs;
	}
	
	public static List<Pair> fillLettersPairs (char[] letters, List<Pair> lettersPairs) {
		for (int i = 0; i < letters.length; i++) {
			for (Pair pair : lettersPairs) {
				if (letters[i] == pair.getLetter()) {
					pair.setCounter(pair.getCounter() + 1);
				}
			}
		}
		return lettersPairs;
	}
}
