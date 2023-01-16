package comparablethree;

import java.util.Objects;

public class Cat implements Comparable<Cat> {
	private String name;
	private int age;

	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Cat() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + "]";
	}

	// сравниваю котов по длинне имени

	@Override
	public int compareTo(Cat o) {
		if (o == null) {
			throw new NullPointerException();
		}
		if (this.name.length() > o.name.length()) {
			return 1;
		}
		if (this.name.length() < o.name.length()) {
			return -1;
		}
		return this.age - o.age;

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Cat other = (Cat) obj;
		return this.getName().length() == other.getName().length() && this.age == other.age;
	}

}