package unarythree;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class Main {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>(List.of("Hello", "Java", "Python", "Ruby", "Fortran"));

		UnaryOperator<List<String>> unOp = a -> {
			List<String> newList = new ArrayList<>();
			for (String string : a) {
				if (string.length() > 5) {
					newList.add(string);
				}
			}
			return newList;
		};
		
		List<String> newList = unOp.apply(list);
		
		System.out.println(newList);
	}

}
