package comparatorfive;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileService {

	public static String readToString(File file) throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String result = "";
			String temp = "";
			for (;;) {
				temp = br.readLine();
				if (temp == null) {
					break;
				}
				result += temp + System.lineSeparator();
			}
			return result;
		}
	}

	public static char[] stringToCharArray(String text) {
		return text.toCharArray();
	}

	public static Integer countPunctMarks(char[] textChars, char[] marks) {
		Integer counter = 0;
		for (int i = 0; i < textChars.length; i++) {
			for (int j = 0; j < marks.length; j++) {
				if (textChars[i] == marks[j]) {
					counter += 1;
				}
			}
		}
		return counter;
	}

	public static Integer fileToInt(File file) throws IOException {
		String temp = readToString(file);
		char[] textChars = stringToCharArray(temp);
		char[] punctMarks = new char[] {',', '.', '-', '?', '!', ' '};
		return countPunctMarks(textChars, punctMarks);
	}

}
