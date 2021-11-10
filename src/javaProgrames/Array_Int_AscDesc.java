package javaProgrames;

import java.util.Arrays;
import java.util.Collections;

public class Array_Int_AscDesc {
	public static void main(String args[]) {
		Integer array[] = { 5, 0, 2, 0, 3, 6 };

		// Approach 1-ASC
		Arrays.parallelSort(array);
		System.out.println(Arrays.toString(array));

		// Approach 2-ASC
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));

		// Approach 3 --DESC
		Arrays.sort(array, Collections.reverseOrder());
		System.out.println(Arrays.toString(array));

		// Approach 4
		asecDesc("asc", array);
		asecDesc("desc", array);

	}

	public static void asecDesc(String condition, Integer[] array) {

		int temp = 0;
		int len = array.length;
		for (int i = 0; i < len; i++) {
			// System.out.println(Arrays.toString(array));
			for (int j = i + 1; j < len; j++) {
				if (condition.equalsIgnoreCase("asc")) {
					if (array[i] > array[j]) {
						temp = array[i];
						array[i] = array[j];
						array[j] = temp;
					}
				} else {
					if (array[i] < array[j]) {
						temp = array[i];
						array[i] = array[j];
						array[j] = temp;
					}
				}
			}
		}
		System.out.println(Arrays.toString(array));
	}
}
