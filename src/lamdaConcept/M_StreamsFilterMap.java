package lamdaConcept;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class M_StreamsFilterMap {
	public static void main(String[] args) {

		List<L_Customer> customersList = Arrays.asList(
				new L_Customer("Tom", 30), 
				new L_Customer("Steve", 40),
				new L_Customer("Peter", 45), 
				new L_Customer("Simon", 23));
		
		String str = customersList.stream().filter(x -> "Peter".equals(x.getName())).map(L_Customer::getName).findAny()
				.orElse(null);
		System.out.println(str);
		System.out.println("-------------------------");

		// Print All The Names
		List<String> str1 = customersList.stream().map(L_Customer::getName).collect(Collectors.toList());
		System.out.println(str1);
		System.out.println("-------------------------");
		str1.forEach(System.out::println);
	}
}
