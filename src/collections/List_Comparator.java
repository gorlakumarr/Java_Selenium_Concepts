package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class List_Comparator {
	public static void main(String[] args) {

		// Comparable
		List<ComparableDemo> list = new ArrayList<ComparableDemo>();
		list.add(new ComparableDemo("Kumar", 28, "NT School"));
		list.add(new ComparableDemo("Gk", 29, "Kt School"));
		list.add(new ComparableDemo("Ramesh", 30, "Mt School"));

		Collections.sort(list);

		list.stream().forEach(e -> System.out.print(e));

		System.out.println();

		// Comparator
		List<ComparatorDemo> list1 = new ArrayList<ComparatorDemo>();
		list1.add(new ComparatorDemo("Peter", 28, "NT School"));
		list1.add(new ComparatorDemo("John", 29, "Kt School"));
		list1.add(new ComparatorDemo("Ramesh", 30, "Mt School"));

		System.out.println();
		System.out.println("----------------------Name Comparator----------------------");

		Collections.sort(list1, new Comparator<ComparatorDemo>() {
			@Override
			public int compare(ComparatorDemo o1, ComparatorDemo o2) {
				return o1.getName().compareTo(o2.getName()); // ASC
//				return o2.getName().compareTo(o1.getName()); //DESC
			}
		});
		list1.stream().forEach(e -> System.out.print(e));

		System.out.println();
		System.out.println("----------------------Age Comparator----------------------");

		Collections.sort(list1, new Comparator<ComparatorDemo>() {
			@Override
			public int compare(ComparatorDemo o1, ComparatorDemo o2) {
				if (o1.getAge() == o2.getAge())
					return 0;
				else if (o1.getAge() > o2.getAge())// ASC
//				else if (o2.getAge() > o1.getAge())// DESC
					return 1;
				else
					return -1;
			}
		});
		list1.stream().forEach(e -> System.out.print(e));
	}
}
