package streamapithree;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Integer> intList = new ArrayList<>(List.of(1, 2, 15, 8, 88, 77, 65, 90, 101));

		intList.stream()
			.filter(a -> a > 10)
			.sorted((a, b) -> a % 10 - b % 10)
			.forEach(a -> System.out.println(a));
			
	}

}
