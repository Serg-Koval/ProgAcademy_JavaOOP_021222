package sample;

import java.math.BigInteger;

public class GetFactorialTask implements Runnable {

	private BigInteger factorial = BigInteger.ONE;
	int number;

	public GetFactorialTask(int number) {
		super();
		this.number = number;
	}

	public BigInteger getFactorial() {
		return factorial;
	}

	@Override
	public void run() {
		
		for (int i = number; i > 0; i--) {
			factorial = factorial.multiply(BigInteger.valueOf(i));
		}

		if (number == 0) {
			factorial = BigInteger.ZERO;
		}

		System.out.println(
				"Thread " + Thread.currentThread().getName() + " with number " + number + " result is: " + factorial);
	}

}
