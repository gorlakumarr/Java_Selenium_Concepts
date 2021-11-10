package collections;

public class ComparatorDemo {
	String name;
	int age;
	String school;

	public ComparatorDemo(String name, int age, String school) {
		super();
		this.name = name;
		this.age = age;
		this.school = school;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public String getSchool() {
		return this.school;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	@Override
	public String toString() {
		return "\nName :" + name + "\nAge : " + age + "\nschool :" + school;
	}
}
