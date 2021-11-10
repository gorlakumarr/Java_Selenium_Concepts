package lambda_javabrains;

import java.util.function.BiConsumer;

public class ExceptionHandlingLambda {
	public static void main(String[] args) {
		int[] someNumber = { 1, 2, 3, 4 };
		int key = 0;

		process(someNumber, key, wrapperLambda((v, k) -> System.out.println(v / k)));

		/*
		 * process(someNumber, key, (v, k) -> { try { System.out.println(v / k); } catch
		 * (ArithmeticException e) { } });
		 */
	}

	private static void process(int[] someNumber, int key, BiConsumer<Integer, Integer> biConsumer) {
		for (int i : someNumber) {
			biConsumer.accept(i, key);
		}
	}

	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> biConsumer) {
		return (v, k) -> {
			try {
				biConsumer.accept(v, k);
			} catch (ArithmeticException e) {
				System.err.println("Exception Caught in Wrapper Lambda");
			}
		};
	};
}
