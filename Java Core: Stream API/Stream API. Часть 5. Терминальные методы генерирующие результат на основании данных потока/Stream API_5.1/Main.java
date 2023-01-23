package streamapione;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		File listDir = new File("C:/Java_other workspace/222.txt");

		List<File> listFiles = readToFile(listDir);
		
		Optional<File> optFile = listFiles.stream()
			.filter(Main::isThreeFiles)
			.findFirst();
		
		System.out.println(optFile.get());
	}
	
	public static List<File> readToFile(File dir) {
		List<File> listFiles = new ArrayList<>();
		try(Scanner scanner = new Scanner(dir)) {
			for(;scanner.hasNextLine();) {
				String path = scanner.nextLine();
				File temp = new File(path);
				listFiles.add(temp);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return listFiles;
	}
	
	public static boolean isThreeFiles(File file) {
		int counter = 0;
		int check = 3;
		if(file.isDirectory()) {
			File[] listFiles = file.listFiles();
			for (File element : listFiles) {
				if(element.getName().endsWith(".txt")) {
					counter += 1;
				}
			}
		}
		
		return counter > check;
	}

}
