package lamdaConcept;

import java.util.Arrays;
import java.util.stream.Stream;

public class M_StreamStringArrayWithFlatMap {

	public static void main(String[] args) {

		String data[][] = new String[][] { { "a", "b" }, { "c", "d" }, { "e", "f" } };

		Stream<String[]> dataStream = Arrays.stream(data);

		// Apply Flat Map
		Stream<String> dataFlatMap = dataStream.flatMap(y -> Arrays.stream(y));

		Stream<String> dataStreamFilter = dataFlatMap.filter(x -> "a".equals(x.toString()));

		dataStreamFilter.forEach(System.out::println);

		System.out.println(Arrays.stream(data).flatMap(x -> Arrays.stream(x)).filter(x -> "g".equals(x.toString()))
				.findAny().orElse(null));
	}
}