package streamapitwo;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		File file = new File("C:\\Users\\AsusWallet\\Desktop\\Films");
		
		File[] listFiles = file.listFiles();
		
		Function<File, String> keyMapper = a -> {
			long fileSize = a.length();
			if(fileSize < 8388608) {
				return "< 1 Mb";
			}
			if (fileSize < 419430400) {
				return "< 50 Mb";
			}
			return ">= 50 Mb";
		};
		
		Function<File, List<File>> valueMapper = a -> List.of(a);
		
		BinaryOperator<List<File>> mergeFunction = (a, b) -> {
			List<File> result = new ArrayList<>(a);
			result.addAll(b);
			return result;
		};
		
		Supplier<Map<String, List<File>>> supplier = HashMap::new;
		
		Map<String, List<File>> map = Arrays.stream(listFiles)
										.collect(Collectors.toMap(keyMapper, valueMapper, mergeFunction, supplier));
		
		map.forEach((type, fileList) -> {
			System.out.println(type);
			for (File element : fileList) {
				System.out.println("\t" + element.getName());
			}
		}
		);
}
}