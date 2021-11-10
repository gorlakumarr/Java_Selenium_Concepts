package javaConcepts;

public class StaticBlock2 {
	// Static Block and Static Method will be called once u load the class
	static {
		System.out.println("Static Block");
	}

	// Static method will not be called automaticlly.we have call this method in
	// main method by direct calling or by using class.method name
	public static void test() {
		System.out.println("Static Method");
	}

	public static void test1() {
		System.out.println("Static test Method");
		// Static method will be called from another static methods as well
		test();
	}

	// Main Method will be called by jvm
	public static void main(String[] args) {
		System.out.println("Main Method");
		// 1
		test();
		// 2
		StaticBlock2.test();
	}
}
