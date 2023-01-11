package functionfive;

import java.util.Calendar;
import java.util.function.ToIntFunction;

public class Main {

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		
		ToIntFunction<Calendar> fn = Main::yearToInt;
		
		int year = fn.applyAsInt(now);
		System.out.println(year);

	}

	public static int yearToInt (Calendar calendar) {
		return calendar.get(Calendar.YEAR);
	}
}
