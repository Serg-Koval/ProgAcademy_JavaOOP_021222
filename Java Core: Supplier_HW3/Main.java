package supplierthree;

import java.util.function.IntSupplier;

public class Main {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 2, 3 };
		
		IntSupplier intS = new IntegerSupplier(arr, 0);
		
		System.out.println(intS.getAsInt());
		System.out.println(intS.getAsInt());
		System.out.println(intS.getAsInt());
		System.out.println(intS.getAsInt());

	}

}

class IntegerSupplier implements IntSupplier {
	private int[] array;
	private int index;

	public IntegerSupplier(int[] array, int index) {
		super();
		this.array = array;
		this.index = index;
	}

	@Override
	public int getAsInt() {
		if(index >= array.length) {
			return 0;
		}
		
		index += 1;
		return array[index - 1];
		
		
	}

}
