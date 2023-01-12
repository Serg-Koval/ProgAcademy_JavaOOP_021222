package comparableone;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Rectangle r1 = new Rectangle(2, 2);
		Rectangle r2 = new Rectangle(2, 3);
		Rectangle r3 = new Rectangle(3, 2);
		Rectangle r4 = new Rectangle(1, 1);

		Rectangle[] rArray = new Rectangle[] { r1, r2, r3, r4 };
		
		for (Rectangle rectangle : rArray) {
			System.out.println(rectangle);
		}
		System.out.println();

		Arrays.sort(rArray);
		for (Rectangle rectangle : rArray) {
			System.out.println(rectangle);
		}

	}

}
