package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Map_HashMapToArrayList {
	public static void main(String[] args) {
		Map<String, Integer> companyMap = new HashMap<String, Integer>();
		companyMap.put("Google", 1000);
		companyMap.put("Walmart", 2000);
		companyMap.put("Amazon", 3000);
		companyMap.put("Cisco", 5000);
		companyMap.put("Facebook", 12000);

		Iterator<Entry<String, Integer>> it = companyMap.entrySet().iterator();

		ArrayList<String> companyList = new ArrayList<String>();
		ArrayList<Integer> sizeList = new ArrayList<Integer>();

		// Convert HashMap to ArrayList
		while (it.hasNext()) {
			Map.Entry<String, Integer> pairs = (Map.Entry<String, Integer>) it.next();
			companyList.add(pairs.getKey().toString());
			sizeList.add((Integer) pairs.getValue());
		}
		System.out.println(companyList);
		System.out.println(sizeList);

		// Convert HashMap Keys into ArrayList
		List<String> companyList1 = new ArrayList<String>(companyMap.keySet());
		for (String company : companyList1) {
			System.out.println(company);
		}

		// Convert HashMap Values into ArrayList
		List<Integer> countlist = new ArrayList<Integer>(companyMap.values());
		for (Integer count : countlist) {
			System.out.println(count);
		}

		// Print Values using JDK 1.8
		companyMap.forEach((k, v) -> System.out.println(k + v));
	}
}
