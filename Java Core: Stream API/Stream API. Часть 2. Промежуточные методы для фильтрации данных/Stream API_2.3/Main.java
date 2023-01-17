package streamapithree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		Cat cat1 = new Cat("Luska", 5, "White");
		Cat cat2 = new Cat("UmkA", 7, "Black");
		Cat cat3 = new Cat("Barsic", 2, "Red");
		Cat cat4 = new Cat("Kuzia", 3, "Grey");
		
		List<Cat> listCats = new ArrayList<>(List.of(cat1, cat2, cat3, cat4));
		
		List<Cat> listCats1 = listCats.stream()
				.filter(a -> a.getWeight() >= 3)
				.sorted((a, b) -> a.getName().compareTo(b.getName()))
				.collect(Collectors.toList());

		System.out.println(listCats1);
	}

}
