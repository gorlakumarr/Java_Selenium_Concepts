package javaProgrames;

import java.util.HashMap;

public class String_FirstNonRepeatedCharacter {

	public static void main(String[] args) {

		String str = "Please Enter the input String";
		char c = firstNonRepeatedCharacter(str);
		char c1 = nonRepeatedCharacter(str);
		System.out.println("The first non repeated character is :  " + c);
		System.out.println("The first non repeated character is :  " + c1);
	}

	public static Character firstNonRepeatedCharacter(String str) {

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int i, length;
		Character c = null;
		length = str.length(); // Scan string and build hash table
		for (i = 0; i < length; i++) {
			c = str.charAt(i);
			if (map.containsKey(c)) {
//				System.out.println(map.get(c)); // increment count corresponding to c
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		// Search characterhashtable in in order of string str

		for (i = 0; i < length; i++) {
			c = str.charAt(i);
			if (map.get(c) == 1)
				return c;
		}
		return c;
	}

	public static char nonRepeatedCharacter(String str) {
		char ch = 0;
		for (char c : str.toCharArray()) {
//		System.out.println("Char :" + c + " :" + s.indexOf(c));
//		System.out.println("Char1 :" + c + " :" + s.lastIndexOf(c));
			if (str.indexOf(c) == str.lastIndexOf(c)) {
				ch = c;
				break;
			}
		}
		return ch;
	}
}
