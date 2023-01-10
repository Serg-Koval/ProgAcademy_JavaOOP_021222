package predicatefour;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiPredicate;

public class Main {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new ConcurrentHashMap<>();
		map.put(5, "Hello");
		map.put(4, "Helloo");
		map.put(6, "Hello");
		map.put(7, "Hellooo");
		
		System.out.println(map);

		BiPredicate<Integer, String> biP = (a, b) -> a != b.length();
		
		removeMapElement(map, biP);
		
		System.out.println(map);
	}
	
	public static void removeMapElement(Map<Integer, String> map, BiPredicate<Integer, String> pr) {
		Set<Map.Entry<Integer, String>> set = map.entrySet();
		
		for (Map.Entry<Integer, String> entry: set) {
			if(pr.test(entry.getKey(), entry.getValue())) {
				map.remove(entry.getKey());
			}
		}
	}

}
