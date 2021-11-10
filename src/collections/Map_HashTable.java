package collections;

import java.util.Hashtable;

public class Map_HashTable {

	/**
	 * >Legacy Map
	 * 
	 * >Synchronized
	 * 
	 * >Doesn't allow Null Key and Values
	 * 
	 * >Initial Capacity is 11
	 * 
	 * >Load Factor : 0.75
	 * 
	 * 0 1 2 3 4 5 6 7 8 9 10
	 * 
	 */

	public static void main(String[] args) {

		Hashtable<String, Integer> hashtable = new Hashtable<>();

		hashtable.put("Tom", 100);
		hashtable.put("Peter", 200);
		hashtable.put("Steve", 300);
		hashtable.put("Ruby", 400);
		hashtable.put("Naveen", 500);
		hashtable.put("Tom", 600);
//		hashtable.put("Tom", null);
//		hashtable.put(null, null);//Exception in thread "main" java.lang.NullPointerException

		System.out.println(hashtable);

		System.out.println(hashtable.get("Tom"));
	}
}
