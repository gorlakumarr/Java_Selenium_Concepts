package collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map_LinkedHashMap {
	public static void main(String[] args) {
		/**
		 * LinkedHashMap extends HashMap implements Map
		 * 
		 * 1.Maintain Insertion Order :: Stores the value in 16 NODE'S (Doubly Linked
		 * List)
		 * 
		 * Structure:
		 * 
		 * Head Node --> Before Node Link :: Key :: Value :: After Node Link --> Tail Node
		 * 
		 * 2.Not Thread Safe
		 * 
		 * 3.One Null Key and Multiple Null Values Are Allowed
		 * 
		 * 4.Key Value Pairs
		 * 
		 * 
		 */

		Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("K1", 1);
		linkedHashMap.put("K2", 3);
		linkedHashMap.put("K3", 2);
		linkedHashMap.put("K3", 3);
		linkedHashMap.put(null, null);
		linkedHashMap.put(null, null);

		System.out.println(linkedHashMap);
	}
}
