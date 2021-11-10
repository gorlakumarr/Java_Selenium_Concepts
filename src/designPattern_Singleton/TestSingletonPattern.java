package designPattern_Singleton;

public class TestSingletonPattern {
	/*
	 * 1.Static member: It gets memory only once because of static, it contains the
	 * instance of the Singleton class.
	 * 
	 * 2.Private constructor: It will prevent to instantiate the Singleton class
	 * from outside the class.
	 * 
	 * 3.Static factory method: This provides the global point of access to the
	 * Singleton object and returns the instance to the caller.
	 */

	private static TestSingletonPattern singleton_instance = null;

	private TestSingletonPattern() {
		// Hinder others class create object of this
	}

	public static TestSingletonPattern getInstance() {
		if (singleton_instance == null) {
			singleton_instance = new TestSingletonPattern();
		}
		return singleton_instance;
	}

	public static void main(String[] args) {

		TestSingletonPattern obj1 = TestSingletonPattern.getInstance();
		TestSingletonPattern obj2 = TestSingletonPattern.getInstance();

		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}
}