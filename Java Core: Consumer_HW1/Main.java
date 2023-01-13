package consumerone;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

		System.out.println(list);
		System.out.println();

		Consumer<Integer> cons1 = a -> {
			if (a % 2 != 0) {
				System.out.println(a);
			}
		};
		
		list.forEach(cons1);

	}

}
