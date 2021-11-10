package javaConcepts;

public class Continue_Demo {
	public static void main(String args[]) {
		for (int i = 0; i < 10; i++) {
			// If the number is 2
			// skip and continue
			if (i == 5)
				continue;
			System.out.print(i + " ");
		}
	}
}