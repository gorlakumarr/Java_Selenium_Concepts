package lamdaConcept;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class O_PrimeNumberWithParallelStream {
	public static void main(String[] args) {

		long t1, t2;

		t1 = System.currentTimeMillis();

		long count = Stream.iterate(0, n -> n + 1).limit(500000).parallel()
				.filter(O_PrimeNumberWithParallelStream::isPrime).peek(x -> System.out.println(x)).count();

		System.out.println("Total Prime Numbers " + count);

		t2 = System.currentTimeMillis();

		System.out.println("Total Time Taken " + (t2 - t1) / 1000);

		// Time taken for parallel processing is 8 sec on the other hand for sequential
		// processing is 24 sec
	}

	public static boolean isPrime(int number) {
		if (number <= 1)
			return false;

		return !IntStream.rangeClosed(2, number / 2).anyMatch(x -> number % x == 0);
	}
}