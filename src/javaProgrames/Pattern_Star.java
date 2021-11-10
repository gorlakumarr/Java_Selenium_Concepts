package javaProgrames;

public class Pattern_Star {

	public static void main(String[] args) {
		starPattern(5);
	}

	public static void starPattern(int n) {

		// *
		// * *
		// * * *
		// * * * *
		// * * * * *
		/*
		 * Method 1:
		 */
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();

		/*
		 * Method 2:
		 */
		for (int i = n - 1; i >= 0; i--) {
			for (int j = n - 1; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();

		// * * * * *
		// * * * *
		// * * *
		// * *
		// *
		/*
		 * Method 1:
		 */
		for (int i = 0; i < n; i++) {
			for (int j = n - 1; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();

		/*
		 * Method 2
		 */
		for (int i = n - 1; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();

		// Left Angle Triangle
		for (int i = 0; i < n; i++) {
			for (int j = 2 * (n - i); j >= 0; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println();

		// Right Triangle
		for (int i = n; i >= 0; i--) {
			for (int j = n; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
		// Pyramid
		for (int i = 0; i < n; i++) {
			for (int j = n - i; j >= 0; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();

		// Reverse Pyramid
		for (int i = 0; i <= n - 1; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= n - i - 1; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
