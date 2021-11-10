package javaProgrames;

import java.util.Arrays;

public class Array_Int_Reverse {
	public static void main(String args[]) {
		int array[] = { 5, 0, 2, 0, 3, 6 };
		reverseArray(array);
	}

	public static void reverseArray(int[] array) {

		int temp = 0;
		int len = array.length;
		for (int i = 0; i < len / 2; i++) {
			temp = array[i];
			array[i] = array[len - 1 - i];
			array[len - 1 - i] = temp;
		}
		System.out.println(Arrays.toString(array));
	}
}
