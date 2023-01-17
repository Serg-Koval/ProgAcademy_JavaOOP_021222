package streamapione;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		String text = "Aaaaa aaaaaa aaaaaaa bbb ccc dddddddd";
				
		int length = 5;
		
		Arrays.stream(text.split(" "))
				.filter(a -> a.length() <= length)
				.forEach(a -> System.out.print(a +" "));
		

	}

}
