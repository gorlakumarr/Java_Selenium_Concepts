package javaProgrames;

public class String_FirstLetterOfWord {

	public static void main(String[] args) {
		String str = "Welcome To Java Sessions";
		getFirstLetterWord(str);
	}

	public static void getFirstLetterWord(String str) {
		String[] words = str.split(" ");
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i].charAt(0));
		}
	}
}
