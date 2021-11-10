package lamdaConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class O_ParallelStreamConcepts {
	public static void main(String[] args) {

		// Sequential
		Stream.of("K1", "K2", "K3", "K4").forEach(System.out::println);

		System.out.println();

		// 1. Parallel
		Stream<String> stream = Stream.of("K1", "K2", "K3", "K4");
		stream.parallel().forEach(System.out::println);

		System.out.println();

		// 2 use parallel stream method on a collection stream
		Arrays.asList("K1", "K2", "K3", "K4").parallelStream().forEach(System.out::println);

		System.out.println();

		// 3 print 1 to 10
		IntStream.range(1, 11).parallel().forEach(System.out::println);

		System.out.println();

		// 4 print a to z
		System.out.println(getAlphabets());
		// sequential
		getAlphabets().stream().forEach(System.out::println);

		System.out.println();

		// parallel
		getAlphabets().parallelStream().forEach(System.out::println);

		// check stream is running in parallel mode
		IntStream st = IntStream.rangeClosed(1, 10);
		System.out.println(st.isParallel());

		System.out.println();

		IntStream st1 = IntStream.rangeClosed(1, 10).parallel();
		System.out.println(st1.isParallel());
	}

	public static List<String> getAlphabets() {
		List<String> l = new ArrayList<String>();
		int n = 97;
		while (n <= 122) {
			char c = (char) n;
			l.add(String.valueOf(c));
			n++;
		}
		return l;
	}
}
