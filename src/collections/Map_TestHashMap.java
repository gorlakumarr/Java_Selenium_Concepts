package collections;

import java.util.HashMap;
import java.util.Map;

public class Map_TestHashMap {

	public static void main(String[] args) {
		Map<Map_Employee, String> empMap = new HashMap<Map_Employee, String>();

		Map_Employee e1 = new Map_Employee("Naveen", 20);
		empMap.put(e1, "Permanent");

		e1.setAge(25); // (Naveen,20) --> HashCode Something now its different. But there is no value
						// so we get "Null"

		empMap.put(e1, "Temporary"); // Create New Entry

		System.out.println(empMap.get(e1));

		Map<String, Integer> m1 = new HashMap<String, Integer>();
		m1.put("Tom", 100);

		System.out.println(m1.get("Tom")); // Directly go to cache(Value which is stored by map.put) get the Value

		/*
		 * With the Immutable Object : we can get values fastly and we can get old
		 * key-values if at all if u changed the values for the string
		 */
	}
}
