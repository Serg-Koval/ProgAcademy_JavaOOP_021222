package comparatortwo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(List.of(3, 6, 9, -2, -6, -8, 2));
		System.out.println(list);
		System.out.println();
		
		Comparator<Integer> comp1 = (a, b) -> Math.abs(a) - Math.abs(b);
		Comparator<Integer> comp2 = (a, b) -> a - b;
		
		list.sort(comp1.thenComparing(comp2.reversed()));
		System.out.println(list);
		System.out.println();
		
		System.out.println(list.get(0));
		System.out.println();
		
	}

}
