package supplierone;

import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {

		Supplier<String> supplierxxx = new StringSupplier("Hello Java Python Fortran", 0);

		String text = "";
		for (; (text = supplierxxx.get()) != null;) {
			System.out.println(text);
		}

	}
}

class StringSupplier implements Supplier<String> {
	private String text;
	private int counter;

	public StringSupplier(String text, int counter) {
		super();
		this.text = text;
		this.counter = counter;
	}

	@Override
	public String get() {
		String[] strArr = text.split(" ");

		if (counter >= strArr.length) {
			return null;
		}
		counter += 1;
		return strArr[counter - 1];

	}

}
