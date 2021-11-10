package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Map_ComareHashMap {
	public static void main(String[] args) {

		HashMap<Integer, String> hashMap1 = new HashMap<Integer, String>();
		hashMap1.put(1, "A");
		hashMap1.put(2, "B");
		hashMap1.put(3, "C");

		HashMap<Integer, String> hashMap2 = new HashMap<Integer, String>();
		hashMap2.put(3, "C");
		hashMap2.put(1, "A");
		hashMap2.put(2, "B");

		HashMap<Integer, String> hashMap3 = new HashMap<Integer, String>();
		hashMap3.put(3, "C");
		hashMap3.put(1, "A");
		hashMap3.put(2, "B");
		hashMap3.put(3, "D");

		// 1. On the basis of Key--Value Pairs
		System.out.println(hashMap1.equals(hashMap2));
		System.out.println(hashMap1.equals(hashMap3));

		System.out.println();

		// 2. Compare HashMaps for Same Keys
		System.out.println(hashMap1.keySet().equals(hashMap2.keySet()));
		System.out.println(hashMap1.keySet().equals(hashMap3.keySet()));

		// 3.Find out the extra Key
		HashMap<Integer, String> hashMap4 = new HashMap<Integer, String>();
		hashMap4.put(4, "C");
		hashMap4.put(1, "A");
		hashMap4.put(2, "B");
		hashMap4.put(3, "D");

		// Combine the keys from both the HashMaps:: Using HashSet
		HashSet<Integer> hashSet = new HashSet<>(hashMap1.keySet()); // 1,2,3
		hashSet.addAll(hashMap4.keySet());// 1,2,3 :://1,2,3,4
		hashSet.removeAll(hashMap1.keySet());// 4
		System.out.println(hashSet);

		// 4 Compare Map By Values

		HashMap<Integer, String> hashMap5 = new HashMap<Integer, String>();
		hashMap5.put(1, "A");
		hashMap5.put(2, "B");
		hashMap5.put(3, "C");

		HashMap<Integer, String> hashMap6 = new HashMap<Integer, String>();
		hashMap6.put(4, "A");
		hashMap6.put(5, "B");
		hashMap6.put(6, "C");

		HashMap<Integer, String> hashMap7 = new HashMap<Integer, String>();
		hashMap7.put(1, "A");
		hashMap7.put(2, "B");
		hashMap7.put(3, "C");
		hashMap7.put(4, "C");

		System.out.println();

		// Condition 1: Duplicates Not Allowed
		System.out.println(new ArrayList<>(hashMap5.values()).equals(new ArrayList<>(hashMap6.values())));
		System.out.println(new ArrayList<>(hashMap5.values()).equals(new ArrayList<>(hashMap7.values())));

		System.out.println();

		// Condition 2: Duplicates Are Allowed
		System.out.println(new HashSet<>(hashMap5.values()).equals(new HashSet<>(hashMap6.values())));
		System.out.println(new HashSet<>(hashMap5.values()).equals(new HashSet<>(hashMap7.values())));
	}
}
