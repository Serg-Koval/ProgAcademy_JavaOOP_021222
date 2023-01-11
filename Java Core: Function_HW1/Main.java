package functionone;

import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
	
	Integer[] intArray = {5,6,7,8,9,10,11};
		
	Predicate<Integer> pr = Main::isPrime;
	
	Function<Integer[], Integer> fn = a -> {
		Integer result = 0;
		for (int i = 0; i < a.length; i++) {
			if(pr.test(a[i])) {
				result += 1;
			}
		}
		return result;
	};
	
	int result = fn.apply(intArray);
	System.out.println(result);

	}
	
	public static boolean isPrime(Integer number) {
		for (int i = 2; i < number; i++) {
			if(number % i == 0) {
				return false;
			}
		}
		return true;
	}

}
