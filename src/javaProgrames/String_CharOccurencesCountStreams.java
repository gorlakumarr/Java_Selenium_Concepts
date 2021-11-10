package javaProgrames;

public class String_CharOccurencesCountStreams {

	public static void main(String[] args) {
		String str = "Testing Solutions";
		getCharCount(str, 't');
	}

	public static void getCharCount(String str, char c) {
		long l = str.chars().filter(e -> (char) e == c).count();
		System.out.println(l);
	}
}
