package lamdaConcept;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class D_BinaryOperatorInterfaceConcepts {
	public static void main(String[] args) {

		/**
		 * Represents An operation upon two operands of the same type,predicting a
		 * result of the same type as the operands.This is a specialization of
		 * BiFunction of the case where the operands and the result are all of the same
		 * Type.
		 * 
		 * 
		 * BinaryOperator extending BiFunction
		 */

		BinaryOperator<Integer> operator = (x1, x2) -> x1 + x2;
		System.out.println(operator.apply(10, 20));

		// Bi Function Interface
		BiFunction<Integer, Integer, Integer> operator1 = (x1, x2) -> x1 + x2;
		System.out.println(operator1.apply(30, 40));
	}
}
