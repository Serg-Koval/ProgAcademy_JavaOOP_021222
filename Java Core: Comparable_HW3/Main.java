package comparablethree;

public class Main {

	public static void main(String[] args) {

		Cat a = new Cat("Umka", 12);
		Cat b = new Cat("Luska", 5);
		Cat c = new Cat("Kuzia", 2);
		Cat d = new Cat("Umka", 12);
		Cat e = new Cat("Barsic", 12);
		
		System.out.println(a.equals(d));
		System.out.println(a.compareTo(d));
		
		System.out.println(a.equals(b));
		System.out.println(a.compareTo(b));
		
		

	}

}
