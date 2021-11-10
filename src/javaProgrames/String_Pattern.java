package javaProgrames;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String_Pattern {
	public static void main(String[] args) {

		String pattern = "[a-z]+";
		String check = "Happy Java Learning ";
		Pattern p = Pattern.compile(pattern);
		Matcher matcher = p.matcher(check);
		while (matcher.find()) {
			System.out.println(check.substring(matcher.start(), matcher.end()));
		}

		String pattern1 = "\\b\\b";
		String check1 = "Happy Java Learning Day 10 ";
		Pattern p1 = Pattern.compile(pattern1);
		Matcher matcher1 = p1.matcher(check1);
		while (matcher1.find()) {
			System.out.println(check1.substring(matcher1.start(), matcher1.end()));
		}
	}
}
