package javaProgrames;

public class String_ReverseEachWord {
	public static void main(String[] args) {
		String string = "Myself working JavaSessions";
		revesewords(string);
	}

	public static void revesewords(String string) {
		String[] words = string.split(" ");
		String revString = "";
		for (String word : words) {
			String revWord = "";
			for (int i = word.length() - 1; i >= 0; i--) {
				revWord = revWord + word.charAt(i);
			}
			revString = revString + revWord + " ";
		}
		System.out.println(string);
		System.out.println(revString);
	}
}
