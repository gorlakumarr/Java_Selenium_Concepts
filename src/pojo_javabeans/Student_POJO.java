package pojo_javabeans;

//POJO Class
public class Student_POJO {
	String name;
	private int marks;
	public int rollNo;

	public Student_POJO(String name, int marks, int rollNo) {
		this.name = name;
		this.marks = marks;
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
}