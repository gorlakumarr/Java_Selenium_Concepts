package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class List_CompareArrayList {

	public static void main(String[] args) {

		// 1.Using sort and Equals:

		ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "F"));
		ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));
		Collections.sort(l1);
		Collections.sort(l2);

		System.out.println(l1.equals(l2));

		System.out.println();

		ArrayList<String> l3 = new ArrayList<String>(Arrays.asList("A", "C", "B", "D", "F"));
		Collections.sort(l3);
		System.out.println(l1.equals(l3));
		System.out.println();

		// 2.Compare Two List and Find out Additional Elements:

		ArrayList<String> l4 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "F"));
		ArrayList<String> l5 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));

		l4.removeAll(l5);
		System.out.println(l4);

		System.out.println();

		// 3.Find out missing Elements
		ArrayList<String> l6 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "F"));
		ArrayList<String> l7 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));

		l7.removeAll(l6);
		System.out.println(l7);

		System.out.println();

		// 4.Common Elements
		ArrayList<String> l8 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "F"));
		ArrayList<String> l9 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));

		l8.retainAll(l9);
		System.out.println(l8);

	}
}
