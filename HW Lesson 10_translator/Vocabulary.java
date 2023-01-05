package sample;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Vocabulary {

	private Map<String, String> vocabularyMap;

	public Vocabulary(Map<String, String> vocabulary) {
		super();
		this.vocabularyMap = vocabulary;
	}

	public Vocabulary() {
		super();
	}

	public Map<String, String> getVocabulary() {
		return vocabularyMap;
	}

	public void setVocabulary(Map<String, String> vocabulary) {
		this.vocabularyMap = vocabulary;
	}

	public String translate(String[] stringArray) {
		String textTranslated = "";
		for (int i = 0; i < stringArray.length; i++) {
			if (vocabularyMap.containsKey(stringArray[i].toLowerCase())) {
				textTranslated += vocabularyMap.get(stringArray[i].toLowerCase()) + " ";
			} else {
				textTranslated += "UNKNOWN WORD ";
			}
		}
		return textTranslated;
	}

	public void addNewWordToVocabulary() {
		System.out.println("Enter new word to add and it's translation:");
		String eng = "";
		String ukr = "";
		try (Scanner scanner = new Scanner(System.in)) {
			eng = scanner.nextLine();
			ukr = scanner.nextLine();
		}

		if (vocabularyMap.containsKey(eng)) {
			System.out.println("This word is already in the vocabulary");
		} else {

			vocabularyMap.put(eng, ukr);
		}
	}

	public void saveVocabularyToDisk() {
		File dictionary = new File("\\Java_Start20221026_projects\\OOP_Lesson10_HW_translator\\Dictionary.txt");

		Set<String> keys = vocabularyMap.keySet();

		try (Writer writer = new PrintWriter(dictionary)) {
			for (String string : keys) {
				writer.write(string + " " + vocabularyMap.get(string) + System.lineSeparator());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
