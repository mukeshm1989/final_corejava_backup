package corejava.test.dto;
import java.util.Objects;
public class Student {
	
	private int age;
	private String name;
	private String address;
	
	public int getAge() {
		return age;
	}
	public Student setAge(int age) {
		this.age = age;
		return this;
	}
	public String getName() {
		return name;
	}
	public Student setName(String name) {
		this.name = name;
		return this;
	}
	public String getAddress() {
		return address;
	}
	public Student setAddress(String address) {
		this.address = address;
		return this;
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, age, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(address, other.address) && age == other.age && Objects.equals(name, other.name);
	}
}
