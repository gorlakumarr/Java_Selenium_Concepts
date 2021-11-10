package javaConcepts;

public class StaticBlock4 {

	int age;

	static {
		StaticBlock4 obj1 = new StaticBlock4();
		obj1.age = 35;
	}

	public static int createObject() {
		StaticBlock4 obj2 = new StaticBlock4();
		obj2.age = 45;
//		System.out.println(obj2.age);
		return obj2.age;
	}

	private StaticBlock4() {
		age = 40;
	}

	public static void main(String[] args) {
		StaticBlock4 obj = new StaticBlock4();
		System.out.println(obj.age);
		createObject();

		StaticBlock5 obj1 = new StaticBlock5(); // Ans to 5th Question
	}
}
