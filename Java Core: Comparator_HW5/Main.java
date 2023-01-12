package comparatorfive;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Main {

	public static void main(String[] args) {

		File file1 = new File("\\Java_other workspace\\3_Comparator_HW\\111.txt");
		File file2 = new File("\\Java_other workspace\\3_Comparator_HW\\222.txt");
		File file3 = new File("\\Java_other workspace\\3_Comparator_HW\\333.txt");

		List<File> fileList = new ArrayList<>(List.of(file1, file2, file3));

		Function<File, Integer> fn = t -> {
			try {
				return FileService.fileToInt(t);
			} catch (IOException e) {
				e.printStackTrace();
			}
			return null;
		};

		Comparator<File> comp = (a, b) -> fn.apply(a) - fn.apply(b);

		fileList.sort(comp);

		for (File file : fileList) {
			try {
				System.out.println(file + " - " + FileService.fileToInt(file));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
