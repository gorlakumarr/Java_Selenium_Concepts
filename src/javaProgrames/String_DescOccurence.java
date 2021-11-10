package javaProgrames;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class String_DescOccurence {
	public static void main(String[] args) {
		descOccurence("banana");
	}

	public static void descOccurence(String str) {
		char words[] = str.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : words) {
			Integer count = map.get(c);
			if (count == null) {
				map.put(c, 1);
			} else {
				map.put(c, ++count);
			}
		}
		Set<Entry<Character, Integer>> set = map.entrySet();
		ArrayList<Entry<Character, Integer>> list = new ArrayList<Entry<Character, Integer>>(set);
		Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
			@Override
			public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
		});

		for (Entry<Character, Integer> entry : list) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
