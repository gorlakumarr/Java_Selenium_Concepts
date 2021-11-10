package javaProgrames;

public class String_RemoveWhiteSpaces {
	public static void main(String[] args) {
		String str = "Java Programmeing and    slenium  Autamtion";
		System.out.println(str.replaceAll("\\s", ""));
	}
}
