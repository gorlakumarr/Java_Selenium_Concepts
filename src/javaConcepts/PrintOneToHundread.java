package javaConcepts;

public class PrintOneToHundread {
	public static void main(String[] args) {
		int one = 'A' / 'A';
		String s1 = "..........";

		for (int i = one; i <= (s1.length() * s1.length()); i++) {
			System.out.println(i);
		}
		// a97 b 98 c99 d100
		for (int i = one; i <= 'd'; i += one) {
			System.err.println(i);
		}

	}
}