package sample;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		File file1 = new File("/Java_Start20221026_projects/OOP_Lesson5_HW_adv/test1.txt");
		File file2 = new File("/Java_Start20221026_projects/OOP_Lesson5_HW_adv/test2.txt");
		File file3 = new File("/Java_Start20221026_projects/OOP_Lesson5_HW_adv/test3.txt");
		
		try {
			FileComparator.compareTwoFiles(file1, file2);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			FileComparator.compareTwoFiles(file1, file3);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
