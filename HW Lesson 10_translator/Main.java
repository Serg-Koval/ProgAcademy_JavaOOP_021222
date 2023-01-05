package sample;

import java.io.File;
import java.io.IOException;
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

		File fileIN = new File("/Java_Start20221026_projects/OOP_Lesson10_HW_translator/English.in");
		File fileOUT = new File("/Java_Start20221026_projects/OOP_Lesson10_HW_translator/Ukrainian.out");
		try {
			fileOUT.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String text = FileService.getStringFromFileScanner(fileIN);

		System.out.println(text);
		System.out.println();

		String[] wordsArray = text.split(" ");
		System.out.println(Arrays.toString(wordsArray));

		Vocabulary voc1 = new Vocabulary(wordPairs);
		String textTranslated = voc1.translate(wordsArray);
		System.out.println(textTranslated);
		System.out.println();
		
		FileService.saveStringToFile(textTranslated, fileOUT);

		voc1.addNewWordToVocabulary();
		File fileOUT1 = new File("/Java_Start20221026_projects/OOP_Lesson10_HW_translator/Ukrainian1.out");
		try {
			fileOUT1.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		String textTranslated1 = voc1.translate(wordsArray);
		FileService.saveStringToFile(textTranslated1, fileOUT1);
		
		voc1.saveVocabularyToDisk();
		
	}

}
