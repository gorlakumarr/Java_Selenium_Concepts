package javaProgrames;

import java.util.Arrays;
import java.util.Collections;

public class Array_String_Sort {

	public static void main(String[] args) {

		String str[] = { "a", "g", "z", "f" };

		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		System.out.println("Before Sorting");

		for (String string : str) {
			System.out.println(string);
		}

		Arrays.sort(str);
		for (String string : str) {
			System.out.println(string);
		}
		Arrays.sort(str, Collections.reverseOrder());
		for (String string : str) {
			System.out.println(string);
		}

	}

}
