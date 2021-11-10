package javaProgrames;

public class String_Sort {

	public static void main(String[] args) {
		String str = "KUMAR";

		char[] ch = str.toCharArray();
		char tem;
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] > ch[j]) {
					tem = ch[i];
					ch[i] = ch[j];
					ch[j] = tem;
				}
			}
		}
		System.out.println(ch);
	}
}
