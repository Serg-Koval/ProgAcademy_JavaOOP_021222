package comparatorfour;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(List.of(-7, 3, 7, 11, -8, 4, 6, 12, 8, 10, 23));
		List<Integer> list2 = new ArrayList<>(List.of(-10, -8, 4, 8));

		Predicate<Integer> pr = Main::isPrimeNumber;

		Comparator<Integer> comp1 = (a, b) -> {
			if (pr.test(a) && pr.test(b)) {
				return a - b;
			}
			if (!pr.test(a) && pr.test(b)) {
				return -1;
			}
			if (pr.test(a) && !pr.test(b)) {
				return 1;
			}
			return 0;
		};

		Comparator<Integer> comp2 = (a, b) -> b - a;
		Comparator<Integer> comp3 = comp1.thenComparing(comp2);

		System.out.println(Collections.max(list, comp3));
		System.out.println(Collections.max(list2, comp3));

	}

	public static boolean isPrimeNumber(Integer number) {
		for (int i = 2; i < Math.abs(number) / 2 + 1; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

}
