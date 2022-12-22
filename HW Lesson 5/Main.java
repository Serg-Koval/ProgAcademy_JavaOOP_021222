package hw;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		File testFile = new File("/Java_Start20221026_projects/OOP_Lesson5_HW/folderIn/111.txt");
		System.out.println(testFile.getPath().substring(testFile.getPath().lastIndexOf('.') + 1));

		File folderIn = new File("/Java_Start20221026_projects/OOP_Lesson5_HW/folderIn");
		File folderOut = new File("/Java_Start20221026_projects/OOP_Lesson5_HW/folderOut");
		String extension = "txt";

		try {
			System.out.println(
					"You have successfully copied " + FileService.copyFileByExtention(folderIn, folderOut, extension)
							+ " files with \"" + extension + "\" extension");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
