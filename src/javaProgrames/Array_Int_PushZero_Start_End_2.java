package javaProgrames;

import java.util.Arrays;

public class Array_Int_PushZero_Start_End_2 {

	public static void main(String[] args) {

		int array[] = { 5, 0, 2, 0, 3, 6 };
		int newArray[] = new int[array.length];

		System.out.println(Arrays.toString(pushZerosToEnd(array, newArray, "start")));

	}

	static int[] pushZerosToEnd(int array[], int newArray[], String postion) {

		if (postion.equalsIgnoreCase("end")) {
			int count = 0;
			for (int number : array) {
				if (number != 0) {
					newArray[count] = number;
					count++;
				}
			}
		} else {
			int count = array.length - 1;
			for (int i = array.length - 1; i >= 0; i--) {
				if (array[i] != 0) {
					newArray[count] = array[i];
					count--;
				}
			}
		}
		return newArray;
	}
}