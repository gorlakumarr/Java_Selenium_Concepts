package collections;

public class ComparableDemo implements Comparable<ComparableDemo> {
	String name;
	int age;
	String school;

	public ComparableDemo(String name, int age, String school) {
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

	@Override
	public int compareTo(ComparableDemo o) {
		if (this.getAge() > o.getAge())
			return 1;
		return -1;
	}
}
