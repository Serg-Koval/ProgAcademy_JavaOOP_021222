package comparatorthree;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>(List.of(62, 2001, 306, 55, 20002, 101));

		Function<Integer, Integer> fn = a -> Integer.valueOf(a.toString().charAt(0)) 
				+ Integer.valueOf(a.toString().charAt(a.toString().length() - 1));
		
		Comparator<Integer> comp = (a,b) -> fn.apply(a) - fn.apply(b);
		
		list.sort(comp);
		
		System.out.println(list);
		

	}

}
