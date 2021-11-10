package javaProgrames;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String_CapitalLetters {

	public static void main(String[] args) {
		String str = "Java Selenium Tutorial";

		// 1
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				count++;
			}
		}
		System.out.println(count);

		// 2
		int count1 = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				count1++;
			}
		}
		System.out.println(count1);

		// 3
		int count11 = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i))) {
				count11++;
			}
		}
		System.out.println(count11);

		// 4
		System.out.println(str.chars().filter(e -> e >= 65 && e <= 90).count());

		// 5
		System.out.println(str.chars().filter(e -> Character.isUpperCase(e)).count());

		// 6
		String reg = "[A-Z]+";
		Matcher matcher = Pattern.compile(reg).matcher(str);
		int c = 0;
		while (matcher.find()) {
			c += matcher.group(0).length();
		}
		System.out.println(c);
	}
}
