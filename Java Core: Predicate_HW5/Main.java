package predicatefive;

import java.util.Scanner;
import java.util.function.IntPredicate;

public class Main {

	public static void main(String[] args) {

		int number = 0;
		try (Scanner scanner = new Scanner(System.in)) {
			number = scanner.nextInt();
		}
		
		int sum = getSumOfIntDigits(number);

		IntPredicate intPr = i -> i % 2 == 0;

		System.out.println(intPr.test(sum));

	}

	public static int getSumOfIntDigits(int i) {
		int sum = 0;
		int temp = i;
		for (; temp != 0;) {
			sum += temp % 10;
			temp /= 10;
		}
		return sum;
	}

}
