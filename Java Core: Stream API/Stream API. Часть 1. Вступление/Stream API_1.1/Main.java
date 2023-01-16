package streamapione;

import java.util.List;
import java.util.Optional;

public class Main {

	public static void main(String[] args) {

		Cat cat1 = new Cat("Luska", 5, "White");
		Cat cat2 = new Cat("Umka", 7, "Black");
		Cat cat3 = new Cat("Barsic", 2, "Red");
		Cat cat4 = new Cat("Luska", 3, "Grey");
		List<Cat> list = List.of(cat1, cat2, cat3, cat4);
		
		System.out.println(list.stream()
			.max((a,b) -> a.getName().length() - b.getName().length())
					.get()
					.getName());

	}

}
