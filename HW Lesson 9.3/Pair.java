package three;

public class Pair {
	
	private char letter;
	private int counter;
	
	public Pair(char letter, int counter) {
		super();
		this.letter = letter;
		this.counter = counter;
	}

	public char getLetter() {
		return letter;
	}

	public void setLetter(char letter) {
		this.letter = letter;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	@Override
	public java.lang.String toString() {
		return "letter \"" + letter + "\" - " + counter;
	}

	
	
}
