package lamdaConcept;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class J_LamdaExppressionMethodReferences {
	public static void main(String[] args) {

		List<String> nameList = new ArrayList<>();
		nameList.add("Tom");
		nameList.add("Peter");
		nameList.add("Simon");
		nameList.add("Naveen");

		System.out.println("----------------------------------");

		// 1.Anonymous Class
		nameList.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});

		System.out.println("----------------------------------");

		// 2.Lambda Expressions: ->
		nameList.forEach(str -> System.out.println(str));

		System.out.println("----------------------------------");

		// 3.Method References
		nameList.forEach(System.out::println);
	}
}
