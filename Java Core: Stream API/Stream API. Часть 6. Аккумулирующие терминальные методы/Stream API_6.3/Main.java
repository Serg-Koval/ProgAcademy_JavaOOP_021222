package streamapithree;

import java.util.List;
import java.util.Optional;

public class Main {

	public static void main(String[] args) {

		List<Integer> list = List.of(1, 22, 3, 4, 5, 6, 7, 8, 9, 10);

		Optional<Integer> max = list.stream()
			.reduce((a, b) -> a > b ? a : b);
		
		System.out.println(max.get());
		
	}

}
