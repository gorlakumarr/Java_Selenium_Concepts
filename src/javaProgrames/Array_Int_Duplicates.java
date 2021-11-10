package javaProgrames;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class Array_Int_Duplicates {
	public static void main(String[] args) {
		int names[] = { 12, 9, 12, 9, 10, 9, 10, 11 };
		System.out.println("________________________________________________");

		// 1.Compare each element
		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {

				if (names[i] == names[j]) {
					System.out.println("Duplicate element is :" + names[i]);
				}
			}

		}
		System.out.println("________________________________________________");

		// 2.Using Hashset -- Stores only Unique Values
		Set<Integer> set = new HashSet<Integer>();

		for (Integer string : set) {
			if (set.add(string) == false) {
				System.out.println("Duplicate Element is :" + string);
			}
		}

		for (int i = 0; i < names.length; i++) {
			if (set.add(names[i]) == false) {
				System.out.println("Duplicate Element is :" + names[i]);
			}

		}

		System.out.println("________________________________________________");

		// 3.HashMap

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int name : names) {
			Integer count = map.get(name);
			if (count == null) {
				map.put(name, 1);
			} else {
				map.put(name, ++count);
			}
		}

		Set<Entry<Integer, Integer>> set1 = map.entrySet();

		for (Entry<Integer, Integer> entry : set1) {
			System.out.println("Element is :" + entry.getKey() + " and occurence is " + entry.getValue());
		}
		System.out.println("________________________________________________");

		// 4. Streams

		HashSet<Integer> hashSet = new HashSet<Integer>();

		Arrays.stream(names).filter(e -> !hashSet.add(e)).boxed().collect(Collectors.toSet());
		hashSet.forEach(e -> System.out.println("Duplicate Element :" + e));
	}
}
