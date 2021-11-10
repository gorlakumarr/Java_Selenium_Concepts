package lamdaConcept;

import java.util.function.Function;

public class C_FunctionalInterfaceConcepts {
	public static void main(String[] args) {
		/**
		 * Interface Function <T,R> Type Parameters:
		 * 
		 * T- Type of input to the function of R -- The Type of the result of the
		 * function
		 * 
		 */

		Function<String, Integer> func = x -> x.length();
		System.out.println(func.apply("JDK 1.8"));

		// Chaining Function
		Function<Integer, Integer> func2 = x -> x * 2;
		System.out.println(func.andThen(func2).apply("This JDK8"));

		// Another example
		Function<Integer, String> function = num -> Integer.toString(num);
		System.out.println(function.apply(1234).length());
	}
}
