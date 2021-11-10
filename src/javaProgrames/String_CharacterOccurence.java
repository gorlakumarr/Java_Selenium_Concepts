package javaProgrames;

public class String_CharacterOccurence {
	public static void main(String[] args) {
		String str = "I am Kumar Gorla";
		System.out.println(occurence(str, 'a'));
		occrenceofChar(str, "a");
		getCount(str, 'a');
	}

	// Approach 1
	public static void occrenceofChar(String str, String a) {
		int len = str.length();
		String temp = str.replaceAll(a, "");
		int tempLen = temp.length();
		System.out.println("No Of Occurences " + (len - tempLen));
	}

	// Approach 2
	public static int occurence(String str, char ch) {
		int count = 0;
		char[] chr = str.toCharArray();
		for (char c : chr) {
			if (c == ch) {
				count++;
			}
		}
		return count;
	}

	// Approach 3
	public static void getCount(String str, char val) {
		int cou = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == val) {
				cou++;
			}
		}
		System.out.println(cou);
	}
}
