package lamdaConcept;

import java.util.Arrays;
import java.util.List;

public class L_SteamsFilter_FindAnyOrElse {
	public static void main(String[] args) {

		List<L_Customer> customersList = Arrays.asList(
				new L_Customer("Tom", 30), 
				new L_Customer("Steve", 40),
				new L_Customer("Peter", 45), 
				new L_Customer("Simon", 23)
				);

		// 1.Filter Find Any
		L_Customer ll = customersList.stream().filter(x -> "Peter".equals(x.getName())).findAny().orElse(null);
		System.out.println(ll.getName());

		System.out.println("---------------------------------------------------------------");

		// 2.filter - did not find any .. or else
		L_Customer l2 = customersList.stream().filter(x -> "N".equals(x.getName())).findAny().orElse(null);
		System.out.println(l2);

		System.out.println("---------------------------------------------------------------");

		// 3.Filter with multiple conditions
		L_Customer cust = customersList.stream().filter((x) -> "Simon".equals(x.getName()) && 23 == x.getAge())
				.findAny().orElse(null);
		System.out.println(cust.getName() + " " + cust.getAge());

		System.out.println("---------------------------------------------------------------");
	}
}
