package collections;

import java.util.HashMap;

public class Map_HashMapConcepts {

	public static void main(String[] args) {
		/*
		 * Extends : AbstractMap<K,V>
		 *
		 * Implements : Map<K,V> ,Clonable, Serializable
		 * 
		 * It Doesn't Maintain Any Order
		 * 
		 * No Order
		 * 
		 * Key Values Pair <K,V>
		 * 
		 * Multiple Null Values
		 * 
		 * One Null Key
		 * 
		 * No Duplicates
		 * 
		 * HashMap: Is not ThreadSafe : Not Synchronized
		 */

//		AbstractMap<String, String> abstractMap = new HashMap<String, String>();

		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("India", "Delhi");
		hashMap.put("UK", "London");
		hashMap.put("UK", "London");
		hashMap.put("Japan", "Tokyo");
		hashMap.put(null, "Berlin");
		hashMap.put(null, "LA");
		hashMap.put("US", "DC");
		hashMap.put("US", null);
		hashMap.put("US", "CA"); // Give Latest Value

		System.out.println(hashMap);

		System.out.println(hashMap.get("US"));

		System.out.println();

//		Iterator<String> it = hashMap.keySet().iterator();
//		while (it.hasNext()) {
//			String key = it.next();
//			String value = hashMap.get(it.next());
//			System.out.println("Key " + key + " Value " + value);
//		}
//
//		System.out.println();
//		Iterator<Entry<String, String>> ite = hashMap.entrySet().iterator();
//		while (ite.hasNext()) {
//			System.out.println(ite.next());
//			System.out.println("Key " + ite.next().getKey() + " Value" + ite.next().getValue());
//		}

		hashMap.forEach((key, value) -> System.out.println(key + ":" + value));
		System.out.println();
		hashMap.forEach((k, v) -> System.out.println("Key " + k + ": Value " + v));
	}
}
