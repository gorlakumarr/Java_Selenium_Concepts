package javaProgrames;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Array_Int_Frequeny {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 8, 3, 2 };
		int length = arr.length;

		// Method 1
		int fr[] = new int[arr.length];
		int visited = -1;
		for (int i = 0; i < length; i++) {
			int count = 1;
			for (int j = i + 1; j < fr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					fr[i] = visited;
				}
			}
			if (fr[i] != visited) {
				fr[i] = count;
			}
		}
		System.out.println(Arrays.toString(fr));
		System.out.println("---------------------");
		System.out.println(" Element | Frequency");
		System.out.println("---------------------");
		for (int i = 0; i < fr.length; i++) {
			if (fr[i] != visited)
				System.out.println("    " + arr[i] + "    |    " + fr[i]);
		}
		System.out.println("---------------------");

		// Method 2
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i : arr) {
			Integer count = map.get(i);
			if (count == null) {
				map.put(i, 1);
			} else {
				map.put(i, ++count);
			}
		}

		Set<Entry<Integer, Integer>> set = map.entrySet();
		for (Entry<Integer, Integer> entry : set) {
			System.out.println("Array Value >" + entry.getKey() + " and Frequency is >" + entry.getValue());
		}
	}

}
