package streamapitwo;

import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
		
		int sum = list.stream()
					.reduce((a,b) -> a + b)
					.get();
		
		System.out.println(sum);
	}

}
