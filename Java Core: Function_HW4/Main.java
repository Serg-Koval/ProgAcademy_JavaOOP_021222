package functionfour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class Main {

	public static void main(String[] args) {

		String str1 = "Hello Java Hello Hello";
		String str2 = "Hello Python Java";

		BiFunction<String, String, String[]> fn = Main::findDuplicateWords;

		System.out.println(Arrays.toString(fn.apply(str1, str2)));

	}

	public static String[] findDuplicateWords(String text1, String text2) {
		String[] tempArr1 = text1.split(" ");
		String[] tempArr2 = text2.split(" ");
		
		List<String> listOfStrings = new ArrayList<>();

		for (int i = 0; i < tempArr1.length; i++) {
			for (int j = 0; j < tempArr2.length; j++) {
				if (tempArr1[i].equals(tempArr2[j])) {
					if(!listOfStrings.contains(tempArr1[i])) {
					listOfStrings.add(tempArr1[i]);
					}
				}
			}
		}
		
		return listOfStrings.toArray(new String[listOfStrings.size()]);
	}

}
