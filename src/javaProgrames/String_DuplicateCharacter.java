package javaProgrames;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class String_DuplicateCharacter {
	public static void main(String[] args) {
		String str = "I am Kumar Gorla";
		printDuplicateCharacters(str);
	}

	public static void printDuplicateCharacters(String str) {
		if (str.equalsIgnoreCase(null)) {
			System.out.println("NULL String");
			return;
		} else if (str.isEmpty()) {
			System.out.println("Empty String");
			return;
		} else if (str.length() == 1) {
			System.out.println("Single Char String");
			return;
		} else {
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
			for (Entry<Character, Integer> entry : set) {
				if (entry.getValue() > 1) {
					System.out.println("Duplicate Character is " + entry.getKey() + " and no of occurences is "
							+ entry.getValue());

				}
			}
		}
	}
}
