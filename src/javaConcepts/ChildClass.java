package javaConcepts;

public class ChildClass extends PrentClass {
	/**
	 * If Parent Class mentioned Final then we will be gettig :The type
	 * ChildClasscannot subclass the final class PrentClass
	 */
	public void start() {
		/**
		 * Cannot override the final method from PrentClass
		 */
		System.out.println("Child Classs Start Method");
	}
}
