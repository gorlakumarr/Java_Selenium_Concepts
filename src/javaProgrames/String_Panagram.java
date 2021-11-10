package javaProgrames;

public class String_Panagram {
	public static void main(String[] args) {
		String str = "The Quick Brown fox jumps over the lazy dog";
		System.out.println(isPanagram(str.toLowerCase().replace(" ", "")));
	}

	public static boolean isPanagram(String str) {
		if (str.length() < 26) {
			return false;
		} else {
			for (char ch = 'a'; ch <= 'z'; ch++) {
				if (str.indexOf(ch) < 0) {
					return false;
				}
			}
		}
		return true;
	}
}
