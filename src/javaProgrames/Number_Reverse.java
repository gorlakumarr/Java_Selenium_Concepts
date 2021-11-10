package javaProgrames;

public class Number_Reverse {

	public static void main(String[] args) {

		int num = 12345; // 54321
		int rev = 0;

		// method 1
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println(rev);

		// Method 2

		int num1 = 12345; // 54321
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());

		// Method 3

		System.out.println(new StringBuilder(String.valueOf(num1)).reverse());

	}

}
