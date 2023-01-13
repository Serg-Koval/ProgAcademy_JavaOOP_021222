package binaryone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;

public class Main {

	public static void main(String[] args) {

		String text1 = " Text text texxxt";
		String text2 = " Tex text texxt";

		BinaryOperator<String> biOp = Main::getMaxWord;

		System.out.println(biOp.apply(text1, text2));

	}

	public static String getMaxWord(String text1, String text2) {
		List<String> list = new ArrayList<>();

		for (String string : text1.split(" ")) {
			list.add(string);
		}
		for (String string : text2.split(" ")) {
			list.add(string);
		}
		Comparator<String> comp = (a, b) -> a.length() - b.length();
		return Collections.max(list, comp);
	}

}
