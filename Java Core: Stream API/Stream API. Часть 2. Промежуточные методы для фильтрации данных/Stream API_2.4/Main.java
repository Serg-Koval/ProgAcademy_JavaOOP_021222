package streamapifour;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		File file = new File("C:\\Java_other workspace\\StreamAPI_2_HW\\pom.txt");
		List<String> list = null;
		
		try {
			list = Files.lines(file.toPath())
				.map(a -> a.strip())
				.filter(a -> a.startsWith("<groupId>"))
				.map(a -> a.replace("<groupId>", ""))
				.map(a -> a.replace("</groupId>", ""))
				.collect(Collectors.toList());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(list);
	}

}
