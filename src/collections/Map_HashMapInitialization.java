package collections;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.google.common.collect.ImmutableMap;

public class Map_HashMapInitialization {
	public static Map<String, Integer> map;

	static {
		map = new HashMap<>();
		map.put("G", 1);
		map.put("K", 1);
	}

	/**
	 * 1.Typical Initialization
	 * 
	 * 2.Static Way
	 * 
	 * 3.Collections.singletonMap()
	 * 
	 * 4.JDK 8 : Stream.of(new String[][]).collect(Collectors.toMap())
	 * 
	 * 5.Simple Entry : Mutable Map::Stream.of(new
	 * AbstractMap.SimpleImmutableEntry<>("",""))
	 * .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
	 *
	 * 6.JDK 1.9 : Map.of()
	 * 
	 * 7.JDK 1.9 : Map.of("","")
	 * 
	 * 8. JDK 1.9 :Multi Map : Max 10 Pairs
	 * 
	 * 9. OfEntries : No Limitation of Key Value Pairs : Immutable
	 * 
	 * 10. Map Using Guava
	 * 
	 */

	public static void main(String[] args) {

		// 1. using Hashmap Class

		HashMap<String, Integer> hashMap1 = new HashMap<>();
		Map<String, Integer> hashMap2 = new HashMap<>();

		// 2.Static Way

		System.out.println(Map_HashMapInitialization.map.get("G"));

		// 3.Immutable Map with only One Single Entry

		Map<String, Integer> hashMap3 = Collections.singletonMap("G", 1);
		System.out.println(hashMap3.get("G"));
//		m.put("K", null);

		/*
		 * Exception in thread "main" java.lang.UnsupportedOperationException
		 */

		// 4.JDK 8

		Map<String, String> hashMap4 = Stream.of(new String[][] { { "GK", "Kumar" } })
				.collect(Collectors.toMap(data -> data[0], data -> data[1]));
		System.out.println(hashMap4.get("GK"));
		hashMap4.put("K", "GK");
		System.out.println(hashMap4.get("K"));

		// 5.Using Simple Entry : Mutable Map

		Map<String, String> hashMap5 = Stream.of(new AbstractMap.SimpleImmutableEntry<>("G", "Kumar"))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

		System.out.println(hashMap5.get("G"));
		hashMap5.put("K", "GK");
		System.out.println(hashMap5.get("K"));

		// 6.JDK 1.9:: Empty Map

		Map<String, String> map5 = Map.of();

		// 7.Singleton Map

		Map<String, String> map6 = Map.of("K1", "V1");
		System.out.println(map6.get("K1"));
		// map6.put(null, null);
		/*
		 * Exception in thread "main" java.lang.UnsupportedOperationException
		 */

		// 8.Multi Map : Max 10 Pairs

		Map<String, String> map61 = Map.of("K1", "V1", "K2", "V2");

		// 9. OfEntries : No Limitation of Key Value Pairs : Immutable

		Map<String, Integer> hashMap9 = Map.ofEntries(new AbstractMap.SimpleEntry<>("G", 100),
				new AbstractMap.SimpleEntry<>("K", 200));
		System.out.println(hashMap9.get("G"));

//		hashMap9.put(null, null);// java.lang.UnsupportedOperationException

		// 10.Map Using Guava

		ImmutableMap<String, String> immutableMap = ImmutableMap.of("K1", "V1", "K2", "V2");
		System.out.println(immutableMap.get("K2"));

	}
}
