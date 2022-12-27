package multithreading;

import java.math.BigInteger;

public class CalculateSum implements Runnable {

	int[] array;
	int begin;
	int end;
	BigInteger sum = BigInteger.ZERO;

	public CalculateSum(int[] array, int begin, int end) {
		super();
		this.array = array;
		this.begin = begin;
		this.end = end;
	}

	public BigInteger getSum() {
		return sum;
	}

	@Override
	public void run() {
		for (int i = begin; i < end; i++) {
			sum = sum.add(BigInteger.valueOf(array[i]));
		}
	}

}
