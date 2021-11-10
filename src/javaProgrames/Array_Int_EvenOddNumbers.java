package javaProgrames;

import java.util.Arrays;

public class Array_Int_EvenOddNumbers {
	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		evenOdd(array);
	}

	public static void evenOdd(int[] array) {
		int even[] = new int[array.length];
		int odd[] = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				even[i] = array[i];

			} else {
				odd[i] = array[i];

			}
		}
		System.out.println(Arrays.toString(odd));
		System.out.println(Arrays.toString(even));

	}
}
