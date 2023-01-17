package streamapithree;

import java.util.Objects;

public class Cat {
	private String name;
	private int weight;
	private String color;

	public Cat(String name, int weight, String color) {
		this.name = name;
		this.weight = weight;
		this.color = color;
	}

	public Cat() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(color, name, weight);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cat other = (Cat) obj;
		return Objects.equals(color, other.color) && Objects.equals(name, other.name) && weight == other.weight;
	}

	public String toString() {
		return "Cat [name=" + name + ", weight=" + weight + ", color=" + color + "]";
	}
}