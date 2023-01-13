package binarytwo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class Main {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>(List.of(1, 3, 5, 7, 9, 4));
		List<Integer> list2 = new ArrayList<>(List.of(2, 4, 6, 8, 10));
		
		BinaryOperator<List<Integer>> biOp1 = (a, b) -> {
			List<Integer> newList = new ArrayList<>();
			for (Integer element : a) {
				if(b.contains(element)) {
					newList.add(element);
				}
			}
			return newList;
		};

		List<Integer> newList = biOp1.apply(list1, list2);
		System.out.println(newList);
	}

}
