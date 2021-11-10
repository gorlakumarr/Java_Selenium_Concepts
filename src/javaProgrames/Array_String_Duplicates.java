package javaProgrames;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Array_String_Duplicates {
	public static void main(String[] args) {
		String names[] = { "Java", "Ruby", "Java", "C", "Python", "C" };

		// 1.Compare each element
		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {

				if (names[i].equals(names[j])) {
					System.out.println("Duplicate element is :" + names[i]);
				}
			}

		}
		System.out.println("________________________________________________");

		// 2.Using Hashset -- Stores only Unique Values
		Set<String> set = new HashSet<String>();

		for (String string : set) {
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

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String name : names) {
			Integer count = map.get(name);
			if (count == null) {
				map.put(name, 1);
			} else {
				map.put(name, ++count);
			}
		}

		// get the values from hashmap

		Set<Entry<String, Integer>> set1 = map.entrySet();

		for (Entry<String, Integer> entry : set1) {
			if (entry.getValue() > 1) {
				System.out.println("Duplicate Element is :" + entry.getKey());
			}
		}

	}

}
