package javaProgrames;

import java.util.Arrays;

public class Array_Int_Equality {
	public static void main(String[] args) {
		int[] arrayOne = { 21, 57, 11, 37, 24 };
		int[] arrayTwo = { 21, 57, 11, 37, 24 };

		equalitySimple(arrayOne, arrayTwo);
		System.out.println(equality(arrayOne, arrayTwo));
	}

	public static void equalitySimple(int[] arrayOne, int[] arrayTwo) {
		// Method 1
		boolean equalOrNot = Arrays.equals(arrayOne, arrayTwo);

		System.out.println(Arrays.toString(arrayOne));

		System.out.println(Arrays.toString(arrayTwo));

		if (equalOrNot) {
			System.out.println("Two Arrays Are Equal");
		} else {
			System.out.println("Two Arrays Are Not equal");
		}
	}

	public static boolean equality(int[] arrayOne, int[] arrayTwo) {
		boolean check = false;
		// Method 2
		if (arrayOne.length == arrayTwo.length) {
			for (int i = 0; i < arrayOne.length; i++) {
				if (arrayOne[i] == arrayTwo[i]) {
					check = true;
				}
			}
		} else {
			System.out.println("Arrays Not Equal In Size");
		}
		return check;
	}
}