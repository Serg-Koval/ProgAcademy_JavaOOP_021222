package predicateone;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>(List.of("Anna", "Ira", "Katia", "Anna"));
		System.out.println("Original list:" + System.lineSeparator() + names);
		System.out.println();

		// лямбда
		Predicate<String> pr1 = a -> a.startsWith("A");

		names.removeIf(pr1);

		System.out.println(names);
		System.out.println();

		// передача метода
		names.removeIf(Main::isStartsWith);

		System.out.println(names);

	}

	public static boolean isStartsWith(String s) {
		return s.startsWith("A");
	}

}
