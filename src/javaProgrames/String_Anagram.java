package javaProgrames;

import java.util.Arrays;

public class String_Anagram {

	public static void main(String[] args) {

		String str1 = "JAVA";

		String str2 = "VAJA";

		char[] char1 = str1.toCharArray();
		char[] char2 = str2.toCharArray();
		Arrays.sort(char1);
		Arrays.sort(char2);

		boolean tr = Arrays.equals(char1, char2);
		System.out.println(tr);

	}

}
