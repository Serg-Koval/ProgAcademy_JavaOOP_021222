package three;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		int[] intArray = new int[10];
		Random random = new Random();
		
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = random.nextInt(10);
		}
		
		System.out.println(Arrays.toString(intArray));
		
		Map<Integer, Integer> map1 = new HashMap<>();
		
		for (int i : intArray) {
			if (map1.get(i) != null) {
				map1.put(i, map1.get(i) + 1);
			} else {
				map1.put(i, 1);
			}
		}

		System.out.println(map1);
	}

}
