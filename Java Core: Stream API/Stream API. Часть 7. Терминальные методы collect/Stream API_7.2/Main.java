package streamapitwo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		List<String> list = List.of("aaa", "bbb", "bab", "ddd", "o", "boob");

		Map<String, Integer> map = list.stream()
					.filter(Main::isVowels)
					.collect(HashMap::new, Main::addToMap, (a, b) -> a.putAll(b));

		System.out.println(map);
	}

	public static boolean isVowels(String s) {
		char[] chars = s.toLowerCase().toCharArray();
		char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'y' };

		for (char element : chars) {
			for (char vowel : vowels) {
				if (element == vowel) {
					return true;
				}
			}
		}
		return false;
	}

	public static int countVowels(String s) {
		char[] chars = s.toCharArray();
		char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'y' };
		int counter = 0;
		for (char element : chars) {
			for (char vowel : vowels) {
				if (element == vowel) {
					counter += 1;
				}
			}
		}
		return counter;
	}

	public static void addToMap(Map<String, Integer> map, String s) {
		map.put(s, countVowels(s));
	}

}
