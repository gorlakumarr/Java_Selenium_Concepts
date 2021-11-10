package lamdaConcept;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class N_SequentialStreamConcepts {
	public static void main(String[] args) {

		// 1
		Stream<String> stream = Stream.of("K1", "K2", "K3", "K4");
		// stream.forEach(System.out::println);
		stream.findFirst().ifPresent(System.out::println);

		// 2
		Arrays.asList("a1", "a2", "a3").stream().findFirst().ifPresent(System.out::println);

		// 3. Range to 1 to 5
		IntStream.range(1, 5).forEach(System.out::print);

		// 4
		Arrays.stream(new int[] { 1, 2, 3, 4, 5, 6 }).map(n -> 2 * n + 1).average().ifPresent(System.out::println);

		// 5 String Data
		Stream.of("a1", "a2", "a3").map(s -> s.substring(1)).mapToInt(Integer::parseInt).max()
				.ifPresent(System.out::println);

		// 6. doubles to string
		Stream.of(1.0, 2.0, 3.0, 4.5).mapToInt(Double::intValue).mapToObj(i -> "a" + i).forEach(System.out::println);

		// 7 limit
		Stream.iterate(0, n -> n + 1).limit(10).forEach(System.out::println);

		System.out.println();

		Stream.iterate(0, n -> n + 1).filter(x -> x % 2 != 0).limit(10).forEach(System.out::println);

	}

}
