package javaProgrames;

import java.util.function.IntPredicate;

import com.google.common.base.CharMatcher;

public class String_Vowel {

	public static void main(String[] args) {
		String str = "I am Kumar";
		// Approach 1
		isVowels(str);

		// Approach 2
		countVowels(str);

		// Approch 3
		vowelsCountStreams(str);

		// Approch 4
		vowelsCount(str);
	}

	public static void vowelsCount(String str) {
		System.out.println("No Of Vowels :" + CharMatcher.anyOf("aeiou").countIn(str));
	}

	public static void countVowels(String str) {
		int vowelCount = 0;
		int consonantsCount = 0;
		for (int i = 0; i < str.length(); i++) {
			if (isVowel(str.charAt(i))) {
				++vowelCount;
			} else {
				++consonantsCount;
			}
		}
		System.out.println("vowelCount " + vowelCount);
		System.out.println("consonantsCount " + consonantsCount);

	}

	private static boolean isVowel(char charAt) {
		charAt = Character.toUpperCase(charAt);
		return (charAt == 'A' || charAt == 'E' || charAt == 'I' || charAt == 'O' || charAt == 'U');
	}

	public static void isVowels(String str) {

		char chr[] = str.replace(" ", "").toCharArray();
		int count = 0;
		for (char c : chr) {
			switch (c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;
			default:
			}
		}
		System.out.println("No Of Vowels :" + count);
		System.out.println("No Of Consonants :" + (str.replace(" ", "").length() - count));
	}

	public static void vowelsCountStreams(String str) {
		IntPredicate predicate = new IntPredicate() {

			@Override
			public boolean test(int charAt) {
				return (charAt == 'a' || charAt == 'e' || charAt == 'i' || charAt == 'o' || charAt == 'u'
						|| charAt == 'A' || charAt == 'E' || charAt == 'I' || charAt == 'O' || charAt == 'U');
			}
		};

		System.out.println("No Of Vowels :" + str.chars().filter(predicate).count());
	}
}
