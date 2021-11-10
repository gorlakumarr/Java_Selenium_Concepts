package collections;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class Map_TreeMap {

	/**
	 * Red Black Tree
	 * 
	 */
	public static void main(String[] args) {

		SortedMap<String, Integer> treeMap = new TreeMap<>();

		treeMap.put("Tom", 100);
		treeMap.put("Peter", 200);
		treeMap.put("Steve", 300);
		treeMap.put("Ruby", 400);
		treeMap.put("Naveen", 500);
		treeMap.put("Tom", 600);

		System.out.println(treeMap);

		treeMap.forEach((k, v) -> System.out.println(k + v));

		System.out.println(treeMap.firstKey());
		System.out.println(treeMap.lastKey());

		Set<String> head = treeMap.headMap("Ruby").keySet();
		System.out.println(head);

		Set<String> tail = treeMap.tailMap("Ruby").keySet();
		System.out.println(tail);

		SortedMap<String, Integer> userTreeMap = new TreeMap<>(Comparator.reverseOrder());

		userTreeMap.put("Tom", 1000);
		userTreeMap.put("Peter", 2000);
		userTreeMap.put("Albert", 3000);
		userTreeMap.put("Ruby", 4000);
		userTreeMap.put("Naveen", 5000);
		userTreeMap.put("Tom", 6000);

		System.out.println(userTreeMap);
	}
}
