package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class List_RemoveDuplicateElements {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>(
				Arrays.asList(1, 1, 13, 2, 3, 2, 5, 6, 8, 10, 9, 8, 15, 12, 13, 6, 5, 15, 15));

		// 1.LinkedHashSet

		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(arrayList);
		System.out.println(linkedHashSet);

		// 2.JDK 8 Streams

		ArrayList<Integer> marksList = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 5, 6, 8, 10, 9, 8, 15, 12, 13, 6, 5));
		List<Integer> list = marksList.stream().distinct().collect(Collectors.toList());
		System.out.println(list);

	}
}
