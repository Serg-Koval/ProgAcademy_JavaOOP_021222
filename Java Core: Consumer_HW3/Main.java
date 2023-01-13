package consumerthree;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.function.BiConsumer;

public class Main {

	public static void main(String[] args) {

		String text = "new text";

		File file = new File("\\Java_other workspace\\5_Consumer_HW\\1.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

		BiConsumer<String, File> cons1 = (a, b) -> {
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(b, true));) {
				bw.write(a + System.lineSeparator());
			} catch (IOException e) {
				e.printStackTrace();
			}

		};
		
		cons1.accept(text, file);

	}

}
