package streamapithree;

import java.io.File;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		File dir = new File("/Java_other workspace/.metadata");

		System.out.println(Arrays.stream(dir.listFiles())
					.filter(a -> a.isFile())
					.max((a, b) -> (int) (a.length() - b.length()))
					.get()
					.getAbsolutePath());
	}
}
