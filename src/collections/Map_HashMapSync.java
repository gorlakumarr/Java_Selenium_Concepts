package collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Map_HashMapSync {

	public static void main(String[] args) {

		/*
		 * Not Synchronized: HashMap
		 * 
		 * Not Thread Safe, Can have One Null key and Multiple Null Values.
		 * 
		 * Synchronized->
		 * 
		 * HashTable:
		 * 
		 * Thread Safe,Slow Performance, Null Key and Multiple Null Values Not Allowed.
		 * 
		 * 
		 * SynchronizedMap:
		 * 
		 * Thread Safe,Slow Performance, Null Key and Multiple Null Values Allowed.
		 * 
		 * 
		 * ConcurrentHashMap:16 Segments : Lock is applied on segment level not on
		 * Object Level (No Lock on Get Operation) t1>writing ,t2 Reading: we can do
		 * that....lastetst written value returned
		 * 
		 * Thread Safe,Fast Performance, Null Key and Multiple Null Values Not Allowed.
		 * 
		 */

		Map<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("K1", "V1");
		hashMap.put("K1", "V1");
		hashMap.put("K1", "V2");
		hashMap.put(null, null);
		hashMap.put(null, null);
		System.out.println(hashMap);

		System.out.println();

		Hashtable<String, String> hashtable = new Hashtable<String, String>();
//		hashtable.put(null, null);// Exception in thread "main" java.lang.NullPointerException

		System.out.println();

		Map<String, String> synHashMap = Collections.synchronizedMap(hashMap);
		System.out.println(synHashMap);

		System.out.println();

		// ConcurrentHashMap doesn't throw ConcurrentModificationException
		ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
		concurrentHashMap.put("K1", "V1");
		concurrentHashMap.put("K1", "V1");
		concurrentHashMap.put("K1", "V1");
//		map2.put(null, null);//Exception in thread "main" java.lang.NullPointerException
		System.out.println(concurrentHashMap);
	}
}
