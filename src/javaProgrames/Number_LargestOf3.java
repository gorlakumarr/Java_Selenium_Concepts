package javaProgrames;

public class Number_LargestOf3 {
	public static void main(String[] args) {
		int a = 10;
		int b = 30;
		int c = 20;

		if (a > b && a > c) {
			System.out.println(a + " is largest Num");
		} else if (b > a && b > c) {
			System.out.println(b + " is largest Num");
		} else if (c > a && c > b) {
			System.out.println(c + " is largest Num");
		}

		int largest = c > (a > b ? a : b) ? c : (a > b ? a : b);
		System.out.println(largest);

	}
}
