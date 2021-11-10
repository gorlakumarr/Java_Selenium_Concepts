package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class List_LinkedListMethods {
	/*
	 * It is a default class in Java
	 * 
	 * Implements Queue and Dueue
	 * 
	 * It allows Null entry
	 * 
	 * It's Dynamic Collection
	 * 
	 * Contain Duplicate Elements
	 * 
	 * Not Synchronized
	 * 
	 * Manipulation is fast as compared to ArrayList. i.e Shifting. (Insertion)
	 * 
	 * LinkedList() :: LinkedList(Collections c)
	 * 
	 */

	public static void main(String[] args) {

		LinkedList<String> names = new LinkedList<>();
		System.out.println(names.size());

		names.add("Tom");
		names.add("Naveen");
		names.add("Robby");
		names.add("Lisa");
		names.add("K4");
		names.add("K5");
		names.add(null);
		names.add(null);

		
		System.out.println(names.size());

		System.out.println(names);

		System.out.println(names.get(2));

		names.add("Steve");
		names.add("Ram");

		// Iteration
		Iterator<String> it = names.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		names.add(1, "K1");
		System.out.println();
		System.out.println(names);

		LinkedList<String> users = new LinkedList<>();
		users.add("Peter");
		users.add("Tom");

		names.addAll(users);
		System.out.println(names);

		names.addAll(2, users);
		System.out.println(names);

		names.addFirst("Gk");
		System.out.println(names);

		names.addLast("Kumar");
		System.out.println(names);

		names.removeAll(users);
		System.out.println(names);

		names.removeFirst();
		names.removeLast();
		System.out.println(names);

		names.clear();
		System.out.println(names);

		LinkedList<String> lang = new LinkedList<>();
		System.out.println(lang.size());

		lang.add("Java");
		lang.add("Python");
		lang.add("Ruby");
		lang.add("JS");

		// Typical For Loop
		for (int i = 0; i < lang.size(); i++) {
			System.out.println(lang.get(i));
		}
		System.out.println();

		// For Each Loop
		for (String string : lang) {
			System.out.println(string);
		}
		System.out.println();

		// JDK 8 - Lambda
		lang.stream().forEach(ele -> System.out.println(ele));
		System.out.println();

		// Iterator
		Iterator<String> it1 = lang.iterator();
		while (it1.hasNext()) {
			String string = (String) it1.next();
			System.out.println(string);
		}

		// List with Other Collections
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50));
		System.out.println("List with Other Collections () : " + list);

		// Reverse A List
		Iterator<String> itr = lang.descendingIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println();
		for (String string : lang) {
			System.out.println(string);
		}

		// Sort
		Collections.sort(lang);
		System.out.println(lang);

	}
}
