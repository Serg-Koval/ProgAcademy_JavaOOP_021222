package comparatorone;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {

		Cat cat1 = new Cat("Umka", 12);
		Cat cat2 = new Cat("Luska", 5);
		Cat cat3 = new Cat("Barsic", 5);
		Cat cat4 = new Cat("Timka", 5);
		Cat cat5 = new Cat("Kuzia", 2);
		Cat[] cats = new Cat[] { cat1, cat2, cat3, cat4, cat5 };

		System.out.println(Arrays.toString(cats));
		System.out.println();

		Comparator<Cat> compCats = (a, b) -> Integer.compare(a.getName().length(), b.getName().length());

		Arrays.sort(cats, compCats);

		System.out.println(Arrays.toString(cats));

	}

}
