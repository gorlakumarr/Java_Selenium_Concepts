package lamdaConcept;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class K_StreamFilterAPIConcepts {

	public static void main(String[] args) {

		List<String> l = Arrays.asList("Mac", "iPhone", "Shoes", "Charger", "Bat");

		System.out.println(l);

		System.out.println();

		l.forEach(s -> System.out.println(s));

		System.out.println();

		List<String> s = l.stream().filter(e -> !e.equals("Bat")).collect(Collectors.toList());
		s.forEach(str -> System.out.println(str));

		System.out.println();

		s.forEach(System.out::println);
	}
}
