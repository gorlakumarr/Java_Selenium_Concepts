package javaProgrames;

public class String_Rotate {

	public static void main(String[] args) {
		String str = "hello";
		boolean c = rotated(str, "elloh");
		System.out.println(c);
		boolean ch = rotated(str, "ellho");
		System.out.println(ch);
	}

	public static boolean rotated(String str, String input) {
		String rotated = "";
		
		for (int i = 1; i <= str.length(); i++) {
			
			if (i == str.length()) {
				rotated = rotated + str.charAt(0);
			} else {
				rotated = rotated + str.charAt(i);
			}
		}

		if (rotated.equalsIgnoreCase(input)) {
			return true;
		} else {
			return false;
		}

	}
}
