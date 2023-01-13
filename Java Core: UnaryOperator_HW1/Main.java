package unaryone;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class Main {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

		UnaryOperator<Integer> unOp = a -> {
			if (a % 2 != 0) {
				a = 0;
			}
			return a;
		};
		
		list.replaceAll(unOp);
		
		System.out.println(list);
	}

}
