package collections;

import java.util.HashMap;
import java.util.Map;

public class Map_HashMapInternal {
	public static void main(String[] args) {
		Map<String, Integer> marks = new HashMap<String, Integer>();
		marks.put("Naveen", 100);
		marks.put("Tom", 200);
		marks.put("Lisa", 300);
		marks.put("Peter", 400);
		marks.put("Nave", 600);

		marks.put(null, 500);
		marks.put(null, 700);
		marks.put("Nav", 900);

		// hashing: HashCode() from Object
		/*
		 * 16 Nodes
		 * 
		 * Naveen | 21060678 | 100 | Null
		 * 
		 */
		System.out.println(marks);
	}
}
