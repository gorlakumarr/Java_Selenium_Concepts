package synchronizedDemo;

public class NonSynchronizedMethod {

	// If we remove synchronized,you will get unpredicted Results
	public /* synchronized */ void printNumbers() {

		System.out.println("Starting to print Numbers for " + Thread.currentThread().getName());

		synchronized (this) {
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName() + " " + i);
			}
		}

//		That's fine because we just wanted to synchronize the sequence of the numbers in each thread. 
//		We can clearly see that the two threads are printing numbers 
//		in the correct sequence by just synchronizing the for loop./
		System.out.println("Completed printing Numbers for " + Thread.currentThread().getName());
	}
}