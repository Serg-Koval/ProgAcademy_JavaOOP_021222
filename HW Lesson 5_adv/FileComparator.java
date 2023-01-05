package sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class FileComparator {

	public static void compareTwoFiles(File file1, File file2) throws IOException {

		int bytes1 = 0;
		int bytes2 = 0;

		byte[] bytesArray1 = new byte[100_000_000];
		byte[] bytesArray2 = new byte[100_000_000];

		try (InputStream reader1 = new FileInputStream(file1); InputStream reader2 = new FileInputStream(file2)) {

			for (;;) {
				bytes1 = reader1.read(bytesArray1);
				bytes2 = reader2.read(bytesArray2);

				if (!Arrays.equals(bytesArray1, bytesArray2)) {
					System.out.println("The files are different");
					return;
				}

				if (bytes1 <= 0 && bytes2 <= 0) {
					System.out.println("The files are the same");
					return;
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
