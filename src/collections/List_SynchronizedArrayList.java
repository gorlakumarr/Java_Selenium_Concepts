package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class List_SynchronizedArrayList {

	/**
	 * How to Synchronize ArrayList in Java:
	 * 
	 * 1.Collections.synchronizedList() - Method - return synchronizedList
	 * 
	 * 2.copyOnWriteArrayList- Class-Thread Safe variant of ArrayList
	 * 
	 */
	public static void main(String[] args) {

		/*
		 * 1. Collections.synchronizedList
		 */
		List<String> list = Collections.synchronizedList(new ArrayList<String>());
		list.add("Java");
		list.add("Ruby");
		list.add("Python");

		// add, remove we don't need explicit synchronization
		// To fetch values from this list - we have to use explicit synchronization
		// System.out.println(list);

		synchronized (list) {
			Iterator<String> ite = list.iterator();
			while (ite.hasNext()) {
				System.out.println(ite.next());
			}
		}
		System.out.println();

		/*
		 * 2. copyOnWriteArrayList
		 */
		CopyOnWriteArrayList<String> list2 = new CopyOnWriteArrayList<String>();
		list2.add("Java");
		list2.add("Ruby");
		list2.add("Python");

		// We don't need explicit synchronization to add, remove, traverse

		Iterator<String> it = list2.iterator();
		while (it.hasNext()) {
			String string = (String) it.next();
			System.out.println(string);
		}
	}
}
