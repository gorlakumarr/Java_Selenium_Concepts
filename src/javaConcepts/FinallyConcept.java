package javaConcepts;

public class FinallyConcept {
	/**
	 * Is a block which is associated with try to maintain cleanup code meant for
	 * try block
	 */

	public static void main(String[] args) {
		// testOne();
		testTwo();
		// division();
	}

	public static void testOne() {
		try {
			System.out.println("Inside Test One Method");
			throw new RuntimeException("Test Exception");
		} catch (Exception e) {
			System.out.println("Inside Catch Block");
		} finally {
			System.out.println("Inside The Finally Block");
		}
	}

	public static void testTwo() {
		try {
			System.out.println("Inside Test Two Method");
			// throw new RuntimeException();
		} finally {
			System.out.println("Inside The Finally Block test two");
		}
	}

	public static void division() {
		int i = 10;
		try {
			System.out.println("Inside Try Block");
			int k = i / 0;
		} catch (NullPointerException e) {
			System.out.println("Inside Catch Block");
			System.out.println("Divide By Zero Error");
		} finally {
			System.out.println("Finally Block Division");
		}
	}
}