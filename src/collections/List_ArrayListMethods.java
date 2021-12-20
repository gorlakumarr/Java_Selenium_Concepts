package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class List_ArrayListMethods {

	public static void main(String[] args) {

		ArrayList<String> arrayList1 = new ArrayList<String>(20);

//		System.out.println(arrayList1.size());

		arrayList1.add("java");
		arrayList1.add("python");
		arrayList1.add("ruby");
		arrayList1.add("javaScript");

		ArrayList<String> arrayList2 = new ArrayList<String>();
		arrayList2.add("testing");
		arrayList2.add("dev ops");
		arrayList2.add("dev ops");

		System.out.println(arrayList2.lastIndexOf("dev ops"));// 2
		System.out.println(arrayList2.lastIndexOf("dev op s")); // -1

		System.out.println(arrayList2.remove(arrayList2.lastIndexOf("dev ops")));

		System.out.println(arrayList2);

		// arrayList1.addAll(arrayList2);
		// System.out.println(arrayList1);

		System.out.println("arrayList1 " + arrayList1);
		System.out.println("arrayList2 " + arrayList2);
		arrayList1.addAll(2, arrayList2);
		System.out.println("arrayList1 " + arrayList1);

		// arrayList1.clear();
		// System.out.println(arrayList1);

		ArrayList<String> cloneList = (ArrayList<String>) arrayList1.clone();
		System.out.println(cloneList);

		System.out.println(arrayList1.contains("java"));
		System.out.println(arrayList1.indexOf("java") > 0);

		ArrayList<Integer> arrayList3 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
//		arrayList3.removeIf(num -> num % 2 == 0);

		System.out.println("arrayList3 " + arrayList3);

		arrayList2.retainAll(Collections.singleton("dev ops"));
		System.out.println("arrayList2 " + arrayList2);

		ArrayList<Integer> arrayList4 = new ArrayList<Integer>(arrayList3.subList(2, 6));
		System.out.println(arrayList4);

		ArrayList<String> arrayList31 = new ArrayList<String>(Arrays.asList("Naveen", "Tom", "Peter"));
		Object arr[] = arrayList31.toArray();
		System.out.println(Arrays.toString(arr));

		for (Object object : arr) {
			System.out.println((String) object);
		}
	}
}
