package streamapione;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		List<Goods> list = List.of(new Goods("Apple", 50), 
				new Goods("Orange", 70), 
				new Goods("Pear", 65),
				new Goods("Cherry", 75));						
		
		Set<String> goodsName = list.stream()
									.filter(a -> a.getPrice() > 50)
									.collect(HashSet::new,
											(a, b) -> a.add(b.getName()),
											(a, b) -> a.addAll(b));

		System.out.println(goodsName);

	}

}
