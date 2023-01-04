package sample;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		Map<String, String> wordPairs = new HashMap<>();
		
		wordPairs.put("one", "один");
		wordPairs.put("two", "два");
		wordPairs.put("three", "три");
		wordPairs.put("four", "чотири");
		wordPairs.put("five", "п'ять");
		wordPairs.put("six", "шість");
		wordPairs.put("seven", "сім");
		wordPairs.put("eight", "вісім");
		wordPairs.put("nine", "дев'ять");
		wordPairs.put("ten", "десять");
		
		System.out.println(wordPairs);
		System.out.println();
		
		File file = new File("/Java_Start20221026_projects/OOP_Lesson10_HW_translator/English.in");
		
		String text = FileService.getStringFromFileScanner(file);

		System.out.println(text);
		System.out.println();
		
		String[] wordsArray = text.split(" ");
		System.out.println(Arrays.toString(wordsArray));
		
		
	}
	
}
