package pojo_javabeans;

public class POJOMainClass {
//POJO
	public static void main(String[] args) {

		Student_POJO student = new Student_POJO("Kumar", 1, 10);

		student.name = "GK";
		
		student.setMarks(100);

		System.out.println(student.getName());
		System.out.println(student.getMarks());
		System.out.println(student.getRollNo());
	}
}