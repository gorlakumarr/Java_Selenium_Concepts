package javaConcepts;

public class TestNum {
	public static void main(String[] args) {
		/**
		 * Comapare Two Integers (Integer Cache)
		 */

		Integer num1 = 128;
		Integer num2 = 128;
		// -128 to 127
		if (num1 == num2) {
			System.out.println("both are equal");
		} else {
			System.out.println("both are not equal");
		}

		if (num1.equals(num2)) {
			System.out.println("both are equal");
		} else {
			System.out.println("both are not equal");
		}
	}

}
