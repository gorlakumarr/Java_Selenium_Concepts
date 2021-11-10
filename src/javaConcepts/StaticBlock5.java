package javaConcepts;

public class StaticBlock5 {
	static int age = 20;
	static {
		System.out.println("Static Block 1");
	}
	static {
		System.out.println("Static Block 2");
	}
	static {
		System.out.println("Static Block 3");
	}
}
