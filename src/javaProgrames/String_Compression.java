package javaProgrames;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class String_Compression {
	public static void main(String[] args) {
		String str = "Sandeep";
		// s1a1n1d1e2p1
		compression(str.toLowerCase());
	}

	public static void compression(String str) {
		char words[] = str.toCharArray();
		HashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (char c : words) {
			Integer count = map.get(c);
			if (count == null) {
				map.put(c, 1);
			} else {
				map.put(c, ++count);
			}
		}
		String compressedStr = "";
		Set<Entry<Character, Integer>> set = map.entrySet();
		for (Entry<Character, Integer> entry : set) {
			compressedStr = compressedStr + entry.getKey() + entry.getValue();
		}
		System.out.println(compressedStr);

		// Another way
		StringBuilder b = new StringBuilder();
		Set<Entry<Character, Integer>> set1 = map.entrySet();
		for (Entry<Character, Integer> entry : set1) {
			b.append(entry.getKey());
			b.append(entry.getValue());
		}
		System.out.println(b.toString());

	}
}
