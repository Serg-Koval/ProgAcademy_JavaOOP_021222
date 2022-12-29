package multithreading;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		System.out.println("Enter the array size: ");
		int arraySize = scanner.nextInt();

		int[] array = new int[arraySize];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(1000);
		}

		// System.out.println(Arrays.toString(array));

		// one-thread calculation

		long oneStart;
		long oneEnd;
		oneStart = System.nanoTime();

		BigInteger oneThreadSum = BigInteger.ZERO;
		for (int i = 0; i < array.length; i++) {
			oneThreadSum = oneThreadSum.add(BigInteger.valueOf(array[i]));
		}

		System.out.println("The sum, calculated in one thread is: " + oneThreadSum);

		oneEnd = System.nanoTime();

		System.out.println((oneEnd - oneStart) + " ns");

		// multi-thread calculation

		long multiOne;
		long multiEnd;

		multiOne = System.nanoTime();

		BigInteger multiThreadSum = BigInteger.ZERO;

		CalculateSum calc1 = new CalculateSum(array, 0, arraySize / 5);
		CalculateSum calc2 = new CalculateSum(array, arraySize / 5, arraySize / 5 * 2);
		CalculateSum calc3 = new CalculateSum(array, arraySize / 5 * 2, arraySize / 5 * 3);
		CalculateSum calc4 = new CalculateSum(array, arraySize / 5 * 3, arraySize / 5 * 4);
		CalculateSum calc5 = new CalculateSum(array, arraySize / 5 * 4, arraySize);

		Thread thr1 = new Thread(calc1);
		Thread thr2 = new Thread(calc2);
		Thread thr3 = new Thread(calc3);
		Thread thr4 = new Thread(calc4);
		Thread thr5 = new Thread(calc5);

		thr1.start();
		thr2.start();
		thr3.start();
		thr4.start();
		thr5.start();

		try {
			thr1.join();
			thr2.join();
			thr3.join();
			thr4.join();
			thr5.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		multiThreadSum = multiThreadSum.add(calc1.getSum()).add(calc2.getSum()).add(calc3.getSum()).add(calc4.getSum())
				.add(calc5.getSum());
		System.out.println("The sum, calculated in multi thread is: " + multiThreadSum);

		multiEnd = System.nanoTime();

		System.out.println((multiEnd - multiOne) + " ns");
	}

}
