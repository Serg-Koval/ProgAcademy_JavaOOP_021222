package three;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class StringIterator implements Iterator<Character> {
	private String text;
	private int start = 0;

	public StringIterator(String text) {
		super();
		this.text = text;
	}

	@Override
	public boolean hasNext() {
		return start < text.length();
	}

	@Override
	public Character next() {
		if (hasNext()) {
			return text.charAt(start++);

		}
		throw new NoSuchElementException();
	}

}
