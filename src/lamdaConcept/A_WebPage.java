package lamdaConcept;

/**
 * 
 * in JDK 1.8 :: Having Only one Abstract Method
 * 
 * 
 * 6 Functional Interfaces were introduced in Java JDK1.8
 * 
 * UnaryOperator,BinaryOperator,Function,Predicate,Supplier,Consumer
 *
 */
@FunctionalInterface
public interface A_WebPage {
	public void header(String value, int age);

	public static void test() {

	}

	default void test1() {

	}
	// public void headerSpace(String value);
}
