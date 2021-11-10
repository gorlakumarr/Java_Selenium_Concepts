package javaProgrames;

public class String_Reverse {
	public static void main(String[] args) {
		String string = "Selenium";

		// Method1
		StringBuilder builder = new StringBuilder(string);
		builder.reverse();

		// Method2
		StringBuffer buffer = new StringBuffer(string);
		buffer.reverse();

		System.out.println(buffer);
		System.out.println(builder);

		// Method3
		String rev = null;
		for (int i = string.length() - 1; i >= 0; i--) {
			rev = rev + string.charAt(i);
		}
		System.out.println(rev);

		// Method4
		String revStr = null;
		char ch[] = string.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			revStr = revStr + ch[i];
		}
		System.out.println(revStr);
	}

}
