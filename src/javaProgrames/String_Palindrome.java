package javaProgrames;

public class String_Palindrome {
	public static void main(String[] args) {
		palindrome("KUMUK");
	}

	public static void palindrome(String string) {
		String rev = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			rev = rev + string.charAt(i);
		}
		System.out.println(string);
		System.out.println(rev);
		if (string.equalsIgnoreCase(rev)) {
			System.out.println("Palindrome String");
		} else {
			System.out.println("Not A Palindrome String");
		}

	}
}
