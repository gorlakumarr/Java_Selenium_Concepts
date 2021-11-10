package collections;

import java.util.Hashtable;

public class Map_HashTableInternalWorking {
	public static void main(String[] args) {
		/**
		 * JDK 1.1
		 * 
		 * Key Value Pairs
		 * 
		 * Synchronized
		 * 
		 * It Doesn't allow any Null Key And Null Values
		 * 
		 * Initial Capacity of HashTable =11 and Load Factor=0.75
		 * 
		 */
		Hashtable<String, Integer> htable = new Hashtable<String, Integer>();
		htable.put("Naveen", 100);
		htable.put("Tom", 200);
		htable.put("Lisa", 300);
		htable.put("Lisa", 500);
		htable.put("Peter", 400);
		htable.put("Nave", 600);
		/*
		 * htable.put(null, 600); htable.put("Jen", null);
		 */
		// Null Pointer Exception

		System.out.println(htable);
		System.out.println(htable.get("Lisa"));
		// System.out.println(htable.get(null));

	}
}
