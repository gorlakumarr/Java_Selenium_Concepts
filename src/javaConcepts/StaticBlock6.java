package javaConcepts;

public class StaticBlock6 {
	/*
	 * Can we initialize member variable within static block?
	 */
	String name;
	static int age;
	static {
		StaticBlock6 block5 = new StaticBlock6();
		block5.name = "Kumar";
		age = 25;

		System.out.println(block5.name);
		System.out.println(age);
	}

	public static void main(String[] args) {

	}
}
