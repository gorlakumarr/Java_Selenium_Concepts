package javaProgrames;

public class Number_Factorial {
	public static void main(String[] args) {
		int num = 5;
		long fact = 1;
		fact(num, fact);
	}

	public static void fact(int num, long fact) {
		// Method 1
		// 1 2 3 4 5
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println(fact);

		// Method 2
		// for (int i = num; i > 0; i--) {
		// fact = fact * i;
		// }
		// System.out.println(fact);

	}

}
