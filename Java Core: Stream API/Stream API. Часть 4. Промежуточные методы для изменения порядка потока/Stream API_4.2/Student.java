package streamapitwo;

import java.util.Objects;

public class Student extends Human implements Cloneable {
	private int id;
	private String groupName;

	public Student(String name, String lastName, Gender gender, int id, String groupName, int age) {
		super(name, lastName, gender, age);
		this.id = id;
		this.groupName = groupName;
	}

	public Student(String name, String lastName, Gender gender, int age) {
		super(name, lastName, gender, age);
	}

	public Student() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	@Override
	public String toString() {
		return super.toString() + ", Student [id=" + id + ", groupName=" + groupName + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(groupName, id);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(groupName, other.groupName) && id == other.id;
	}

	@Override
	public Student clone() throws CloneNotSupportedException {
		return (Student)super.clone();
	}

}
