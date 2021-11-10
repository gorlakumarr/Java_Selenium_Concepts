package javaConcepts;

public class NullArguments {
	/**
	 * Pass Null Arguments with Method Overloading with String and Object Types
	 */

	public static void main(String[] args) {
		sample(null);
	}

	public static void sample(Object o) {
		System.out.println("Object Argument");
	}

	public static void sample(String o) {
		System.out.println("String Argument");// This will run
	}

	/*
	 * The method sample(Object) is ambiguous for the type NullArguments
	 */
	// public static void sample(StringBuffer o) {
	// System.out.println("StringBuffer Argument");
	// }
}
