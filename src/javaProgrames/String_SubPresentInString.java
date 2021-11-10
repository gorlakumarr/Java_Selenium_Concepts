package javaProgrames;

public class String_SubPresentInString {

	public static void main(String[] args) {
		System.out.println(checkString("Java Selenium Tutorial", "Tutorial"));
		System.out.println(checkString("Java Selenium Tutorial", "m T"));
		System.out.println(checkString("Java Selenium Tutorial", "m"));
		System.out.println(checkString("Java Selenium Tutorial", " "));
		System.out.println(checkString("Java Selenium Tutorial", "  "));
		System.out.println(checkString("Java Selenium Tutorial", null));
		System.out.println(checkString2("Java Selenium Tutorial", "Jav"));
	}

	public static boolean checkString(String str, String subStr) {
		return str.matches("(.*)" + subStr + "(.*)");
	}

	public static boolean isSubString(String str, String subStr) {
		return str.contains(subStr);
	}

	public static boolean checkString2(String str, String subStr) {
		return str.indexOf(subStr) != -1;
	}
}
