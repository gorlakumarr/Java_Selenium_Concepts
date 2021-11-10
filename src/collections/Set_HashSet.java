package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_HashSet {
	/**
	 * Stores Unique Values
	 * 
	 * Provide Mathematical Operations
	 * 
	 * 4 Constructors are thre in HashSet
	 */
	public static void main(String[] args) {

		/*
		 * 
		 * Collection ^ (Extends) Set ^ (Extends) SortedSet : AbstractSet
		 * 
		 * (Only Class HashSet which implements Sorted Set. LinkedHashset extends
		 * HashSet Class)
		 * 
		 */

		Set<String> hs = new HashSet<String>();
		hs.add("Alpha");
		hs.add("Beta");
		hs.add("Testing");
		hs.add("Beta");
		hs.add(null);
		hs.add(null);

		System.out.println(hs);

		System.out.println(hs.contains("Testing"));

		System.out.println();

		for (String string : hs) {
			System.out.println(string);
		}

		hs.remove(null);
		System.out.println(hs);

		Iterator<String> it = hs.iterator();
		System.out.println();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// Mathematical Operations
		Set<Integer> first = new HashSet<Integer>();
		first.addAll(Arrays.asList(1, 3, 5, 7, 9, 11));

		Set<Integer> second = new HashSet<Integer>();
		second.addAll(Arrays.asList(2, 4, 5, 6, 8, 10, 12));

		Set<Integer> union = new HashSet<Integer>(first);
		union.addAll(second);
		System.out.println(union);

		Set<Integer> interSection = new HashSet<Integer>(first);
		interSection.retainAll(second);
		System.out.println(interSection);

		// Difference
		Set<Integer> dif = new HashSet<Integer>(first);
		dif.removeAll(second);
		System.out.println(dif);
	}
}
