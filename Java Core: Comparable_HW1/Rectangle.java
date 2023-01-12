package comparableone;

import java.util.Objects;

public class Rectangle implements Comparable<Rectangle> {

	private int width;
	private int height;

	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	public Rectangle() {
		super();
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(height, width);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
		return height == other.height && width == other.width;
	}

	@Override
	public int compareTo(Rectangle r) {

		if (r == null) {
			throw new NullPointerException();
		}
		if (this.height * this.width > r.height * r.width) {
			return 1;
		}
		if (this.height * this.width < r.height * r.width) {
			return -1;
		}
		return 0;
	}

}
