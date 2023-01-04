package sample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
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
		return result.substring(0, result.length() - 1);
	}

	public static String getStringFromFileBufferedReader(File file) throws IOException {

		try (BufferedReader breader = new BufferedReader(new FileReader(file))) {

			String result = "";
			String temp = "";
			for (;;) {
				temp = breader.readLine();
				if (temp == null) {
					break;
				}
				result += temp + System.lineSeparator();
			}
			return result.substring(0, result.length() - 1);

		} catch (IOException e) {
			throw e;
		}
	}

}
