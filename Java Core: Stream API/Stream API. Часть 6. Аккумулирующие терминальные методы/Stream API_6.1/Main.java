package streamapione;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Main {

	public static void main(String[] args) {

		String text = "one two three four five seven";
		String[] textArr = text.split(" ");
		
		BiFunction<Integer, String, Integer> biF = (a, b) -> a + b.length();
		BinaryOperator<Integer> biOp = (a, b) -> a + b;
		
		int totalLength = Arrays.stream(textArr)
			.filter(a -> a.length() > 4)
			.reduce(0, biF, biOp);
		
		System.out.println(totalLength);

	}

}
