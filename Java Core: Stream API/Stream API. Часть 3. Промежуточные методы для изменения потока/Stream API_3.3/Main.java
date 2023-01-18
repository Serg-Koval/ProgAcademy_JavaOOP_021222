package streamapithree;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
	
		File dir = new File("\\Java_other workspace\\StreamAPI_3_HW\\");
		
		List<File> listFiles =  Arrays.stream(dir.listFiles())
			.filter(Main::isExtentionTXT)
			.collect(Collectors.toList());
		
		for (File file : listFiles) {
			System.out.println(file);
		}
	}
	
	public static boolean isExtentionTXT (File file) {
		String path = file.getPath();
		String ext = path.substring(path.lastIndexOf('.') + 1);
		if(ext.equals("txt")) {
			return true;
		}
		return false;
	}

}
