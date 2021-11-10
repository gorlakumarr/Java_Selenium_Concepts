package javaConcepts;

public class InstanceOf {
	/**
	 * The java instanceof operator is used to test whether the object is an
	 * instance of the specified type (class or subclass or interface).
	 */
	public static void main(String[] args) {

//		An object of subclass type is also a type of parent class. 
//		For example, if Child extends Parent
//		then object of Child can be referred by either Child or Parent class.
		Parent child = new Parent();
		System.out.println(child instanceof Child);

		// variable that have null value
		Child d = null;
		System.out.println(d instanceof Child);// false

		// Downcasting with java instanceof operator
		// Child parent = new Parent(); // Compilation Error
		// Child parent = (Child) new Parent();
		// Compiles successfully but ClassCastException is thrown at runtime
	}
}
