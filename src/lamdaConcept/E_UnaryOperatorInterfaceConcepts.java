package lamdaConcept;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class E_UnaryOperatorInterfaceConcepts {
	public static void main(String[] args) {
		/**
		 * Represents an operation on a single operand that produces a result of the
		 * same type as its operand.This is a specialization of Function of the case
		 * where the operand and the result are all of the same Type.
		 * 
		 */

		UnaryOperator<Integer> operator = (x1) -> x1 + 2;
		System.out.println(operator.apply(10));

		List<String> arrayList1 = new ArrayList<String>();
		arrayList1.add("java");
		arrayList1.add("python");
		arrayList1.add("ruby");
		arrayList1.add("javaScript");

		System.out.println(arrayList1);

		arrayList1.replaceAll(ele -> "G_"+ele);
		System.out.println(arrayList1);
	}
}
