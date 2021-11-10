package javaProgrames;

public class String_NoOfWords {
	public static void main(String[] args) {
		String str = "I am Kumar Gorla";
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println(str.length());
		System.out.println(count);
	}
}
