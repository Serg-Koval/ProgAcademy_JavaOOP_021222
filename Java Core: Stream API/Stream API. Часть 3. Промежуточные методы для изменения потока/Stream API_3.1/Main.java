package streamapione;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;

public class Main {

	public static void main(String[] args) {
		
		File file = new File("\\Java_other workspace\\StreamAPI_3_HW\\URLfile.txt");
		
		try {
		Files.lines(file.toPath())
				.filter(Main::isActiveUrl)			
				.forEach(a -> System.out.println(a));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static boolean isActiveUrl(String spec) {
		try {
		URL url = new URL(spec);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();

		if (connection.getResponseCode() == 200) {
			return true;
		}
		} catch (IOException e) {
			e.printStackTrace();
		}
			return false;
	}

}
