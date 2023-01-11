package functionthree;

import java.util.function.Function;

public class Main {

	public static void main(String[] args) {

		String text = "aa";
				
		Function<String, char[]> fn1 = a -> a.toCharArray();
		Function<char[], Integer> fn2 = Main::calculateCharCodes;
		Function<String, Integer> fn3 = fn1.andThen(fn2);
		
		Integer sumOfCharCodes = fn3.apply(text);
		System.out.println(sumOfCharCodes);

	}

	public static Integer calculateCharCodes (char[] symbols) {
		Integer sumCodes = 0;
		for (int i = 0; i < symbols.length; i++) {
			sumCodes += symbols[i];
		}
		return sumCodes;
	}
	
}
