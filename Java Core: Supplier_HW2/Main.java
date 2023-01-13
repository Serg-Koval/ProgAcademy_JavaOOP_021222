package suppliertwo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>(List.of("Hello", "world", "Java", "aaaa"));
		
		Supplier<String> ss = new StringSupplier(list);
		
		System.out.println(ss.get());
		System.out.println(ss.get());
		System.out.println(ss.get());
		System.out.println(ss.get());

	}

}

class StringSupplier implements Supplier<String> {
	private List<String> strList;
	private int index;

	public StringSupplier(List<String> strList) {
		super();
		this.strList = strList;
		this.index = 0;
	}

	@Override
	public String get() {

		Predicate<String> pr1 = a -> Character.isUpperCase(a.toCharArray()[0]);
		if(index >= strList.size()) {
			return null;
		}
		index += 1;
		if (pr1.test(strList.get(index-1))) {
			return strList.get(index-1);
		}
		return null;
		
	}

}
