package lamdaConcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class I_ArrayListIterator {
	public static void main(String[] args) {

		ArrayList<String> l = new ArrayList<>();
		l.add("Game Of Thrones");
		l.add("Breaking Bad");
		l.add("The Big Bang Theory");
		l.add("The Walking Dead");
		l.add("Prison Break");

		System.out.println("----------------------------------------");

		// 1.using JDK1.8 for each loop and lambda expression
		l.forEach(shows -> System.out.println(shows));

		System.out.println("----------------------------------------");

		// 2.Using Iterator
		Iterator<String> i = l.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		System.out.println("----------------------------------------");

		// 3.using Iterator and Java 8 for each remianing method
		Iterator<String> it = l.iterator();
		it.forEachRemaining(show -> {
			System.out.println(show);
		});

		System.out.println("----------------------------------------");

		// 4.using for each simple loop
		for (String string : l) {
			System.out.println(string);
		}

		System.out.println("----------------------------------------");

		// 5.using for loop with order
		for (int j = 0; j < l.size(); j++) {
			System.out.println(l.get(j));
		}

		System.out.println("----------------------------------------");

		// 6.using List Iterator
		ListIterator<String> li = l.listIterator(l.size());
		while (li.hasPrevious()) {
			System.out.println(li.previous());
		}
	}
}
