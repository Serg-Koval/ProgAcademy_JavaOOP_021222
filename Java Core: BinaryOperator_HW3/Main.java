package binarythree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BinaryOperator;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<>(List.of(5,0,3,-4));
		List<Integer> list2 = new ArrayList<>(List.of(10,-2,5));
		
		BinaryOperator<List<Integer>> biOp = (a, b) -> {
			if(Collections.min(list1) < Collections.min(list2)) {
				return list1;
			} else {
				return list2;
			}
		};
		
		List<Integer> list3 = biOp.apply(list1, list2);
		System.out.println(list3);
		
	}

}
