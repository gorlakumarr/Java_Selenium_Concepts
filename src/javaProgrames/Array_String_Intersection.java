package javaProgrames;

import java.util.HashSet;

public class Array_String_Intersection {
	public static void main(String[] args) {

		String[] inputArray1 = { "ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR" };
		String[] inputArray2 = { "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR" };

		HashSet<String> set = new HashSet<String>();

		for (int i = 0; i < inputArray2.length; i++) {
			for (int j = 0; j < inputArray2.length; j++) {
				if (inputArray1[i].equalsIgnoreCase(inputArray2[j])) {
					set.add(inputArray1[i]);
				}
			}
		}
		System.out.println("Common Elements : " + set);
	}
}
