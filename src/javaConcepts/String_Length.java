package javaConcepts;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String_Length {
	public static void main(String[] args) {
		String str = "Kumar";

		// 1
		System.out.println(str.toCharArray().length);

		// 2
		System.out.println(str.lastIndexOf(""));

		// 3
		Matcher matcher = Pattern.compile("$").matcher(str);
		matcher.find();
		int len = matcher.end();
		System.out.println(len);

		// 4
		System.out.println(str.split("").length);

		// 5
		int count = 0;
		for (char s : str.toCharArray()) {
			count++;
		}
		System.out.println(count);

		// 6
		int i = 0;
		try {
			while (true) {
				str.charAt(i);
				i++;
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println(i);
		}

		// 7
		int l = 0;
		try {
			l = str.getBytes("UTF-16BE").length / 2;
		} catch (Exception e) {
			System.out.println(l);
		}

		// 8
		String s[] = str.split("");
		int c = 0;
		for (String string : s) {
			c += string.toCharArray().length;
		}
	}
}
