package hw;

import java.util.Arrays;

public class ArrayStack {
	private Object[] objectsContainer;
	private int size;
	private int capacity;
	private final int DEFAULT_CAPACITY = 24;
	private final int MAX_STACK_SIZE = Integer.MAX_VALUE - 1;

	public ArrayStack() {
		objectsContainer = new Object[DEFAULT_CAPACITY];
		capacity = objectsContainer.length;
		size = 0;
	}

	public void push(Object obj) {
		if (size >= capacity) {
			boolean ifResize = upResize();
			if (!ifResize) {
				throw new RuntimeException("Cannot add element");
			}
		}
		objectsContainer[size] = obj;
		size += 1;
	}

	public Object pop() {
		if (size == 0) {
			return null;
		}
		size -= 1;
		Object element = objectsContainer[size];
		objectsContainer[size] = null;
		return element;

	}

	public Object peek() {
		if (size == 0) {
			return null;
		}
		return objectsContainer[size - 1];
	}

	public boolean upResize() {
		if (capacity >= MAX_STACK_SIZE) {
			return false;
		}

		long newCapacityL = (capacity * 3L) / 2L + 1L;

		int newCapacity = MAX_STACK_SIZE;
		if (newCapacityL < MAX_STACK_SIZE) {
			newCapacity = (int) newCapacityL;
		}

		objectsContainer = Arrays.copyOf(objectsContainer, newCapacity);
		capacity = newCapacity;
		return true;

	}
}
