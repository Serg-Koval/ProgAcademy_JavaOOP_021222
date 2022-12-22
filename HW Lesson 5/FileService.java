package hw;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileService {

	public static long copyFile(File fileIn, File fileOut) throws IOException {
		try (InputStream is = new FileInputStream(fileIn); OutputStream os = new FileOutputStream(fileOut)) {
			return is.transferTo(os);
		}
	}

	public static int copyFileByExtention(File folderIn, File folderOut, String extention) throws IOException {
		int counter = 0;
		File[] files = folderIn.listFiles();

		for (int i = 0; i < files.length; i++) {
			if (files[i].isFile()
					&& files[i].getPath().substring(files[i].getPath().lastIndexOf('.') + 1).equals(extention)) {
				File fileOut = new File(folderOut, files[i].getName());
				copyFile(files[i], fileOut);
				counter += 1;
			}
		}
		return counter;
	}
}
