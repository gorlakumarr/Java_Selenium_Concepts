package lamdaConcept;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class P_InfinteStreams {
	public static void main(String[] args) {

		// Infinite streams used to generate infinite stream of data

		// 1. Iterate Method
		// static : (seed, unary operator)
		// return stream

		List<Integer> in = IntStream.iterate(0, n -> n + 2).mapToObj(Integer::valueOf).limit(10)
				.collect(Collectors.toList());
		System.out.println(in);

		// 2. Generate
		// static generate(Supplier)
		List<Integer> c = Stream.generate(() -> (new Random()).nextInt(100)).limit(10).collect(Collectors.toList());
		System.out.println(c);
	}
}
