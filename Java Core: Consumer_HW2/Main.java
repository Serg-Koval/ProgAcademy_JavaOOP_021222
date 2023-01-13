package consumertwo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) {

		List<String> listTemp = new ArrayList<>();

		String str1 = "Java1";
		String str2 = "Java";
		String str3 = "22Java";

		Consumer<String> cons1 = a -> {
			for (var c : a.toCharArray()) {
				if (Character.isDigit(c)) {
					listTemp.add(a);
					return;
				}
			}
		};

		cons1.accept(str1);
		cons1.accept(str2);
		cons1.accept(str3);
		
		System.out.println(listTemp);

	}

}
