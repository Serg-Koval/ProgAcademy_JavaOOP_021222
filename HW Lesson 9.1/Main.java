package one;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		List<Integer> myList = new ArrayList<>();

		listActivities(myList);

	}

	public static void listActivities(List<Integer> list) {
		Random random = new Random();

		for (int i = 0; i < 10; i++) {
			list.add(random.nextInt(100));
		}
		System.out.println(list);

		list.remove(0);
		list.remove(0);
		list.remove(list.size() - 1);

		System.out.println(list);
	}

}
