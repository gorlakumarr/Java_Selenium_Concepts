package lamdaConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class F_PedicateInterfaceConcepts {
	public static void main(String[] args) {

		/**
		 * Represents an operation on a single operand that produces a result of the
		 * same type as its operand.This is a specialization of Function of the case
		 * where the operand and the result are all of the same Type.
		 * 
		 */

		Predicate<Integer> predicate = x -> x >= 5;

		List<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(1, 3, 5, 7, 9));
		List<Integer> l = arrayList.stream().filter(predicate).sorted().collect(Collectors.toList());
		System.out.println(l);

		// Predicate with && Operator we can use OR Operator
		List<Integer> l2 = arrayList.stream().filter(x -> x > 5 && x < 9).collect(Collectors.toList());
		System.out.println(l2);

		// Predicate with NEGATE
		List<String> arrayList1 = new ArrayList<String>();
		arrayList1.add("Naveen");
		arrayList1.add("Navee");
		arrayList1.add("Nave");
		arrayList1.add("Java");
		arrayList1.add("Jav");
		arrayList1.add("Ja");
		arrayList1.add("J");

		Predicate<String> predicate1 = x -> x.startsWith("J");
		List<String> l3 = arrayList1.stream().filter(predicate1.negate()).collect(Collectors.toList());
		System.out.println(l3);

		// Another example
		Predicate<String> predicate2 = s -> s.length() < 10;
		System.out.println(predicate2.test("Apples") + " Apples is less than 10");
	}
}
