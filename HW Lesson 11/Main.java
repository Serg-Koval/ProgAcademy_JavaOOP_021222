package hwnetwork;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		String site = "https://dou.ua/";
		File urlFile = new File("/Java_Start20221026_projects/OOP_Lesson11_HW/URLfile.txt");

		String code = "";
		try {
			code = NetworkService.getStringFromURL(site, "UTF-8");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			NetworkService.saveURLToFile(code, urlFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			NetworkService.checkURL(urlFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
