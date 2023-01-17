package streamapitwo;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		String text = "JчAммV/A Pythonзз";
		
		Arrays.stream(text.split(""))
			.filter(Main::isEng)
			.forEach(a -> System.out.print(a));
				
	}

	public static boolean isEng(String s) {
		char c = s.toLowerCase().charAt(0);
		if(c >= 'a' && c <= 'z' || c <= ' ') {
			return true;
		}
		return false;
	}

}
