package sample;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;

public class FileService {

	public static String getStringFromFileScanner(File file) {
		String result = "";

		try (Scanner scanner = new Scanner(file)) {

			for (; scanner.hasNextLine();) {
				result += scanner.nextLine() + System.lineSeparator();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result.substring(0, result.length() - System.lineSeparator().toString().length());
	}

	public static void saveStringToFile(String text, File File) {
		try (Writer writer = new PrintWriter(File)) {
			writer.write(text);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
