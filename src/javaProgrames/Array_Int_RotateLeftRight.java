package javaProgrames;

import java.util.Arrays;

public class Array_Int_RotateLeftRight {

	public static void main(String[] args) {
		int array[] = { 5, 0, 2, 0, 3, 6 };

		int num = 5;
		rotated(num, array, "left");
	}

	public static void rotated(int num, int[] array, String condition) {

		System.out.println(" --------- :" + Arrays.toString(array));
		System.out.println("------------------------------");

		if (condition.equalsIgnoreCase("left")) {

			for (int i = 0; i < num; i++) {
				int first = array[0];
				int j = 0;
				for (j = 0; j < array.length - 1; j++) {
					array[j] = array[j + 1];
				}
				array[j] = first;
				System.out.println(i + 1 + " Rotation :" + Arrays.toString(array));
			}

		} else {

			for (int i = 0; i < num; i++) {
				int last = array[array.length - 1];
				int j = 0;
				for (j = array.length - 1; j > 0; j--) {
					array[j] = array[j - 1];
				}
				array[j] = last;
				System.out.println(i + 1 + " Rotation :" + Arrays.toString(array));
			}
		}
	}
}
