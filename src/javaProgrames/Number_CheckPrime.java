package javaProgrames;

public class Number_CheckPrime {
	public static void main(String[] args) {
		checkPrime(15);
	}

	public static void checkPrime(int num) {
		int count = 0;
		if (num > 1) {
			for (int i = 1; i <= num; i++) {
				if (num % i == 0)
					count++;
			}
			if (count == 2) {
				System.out.println("Prime Number");
			} else {
				System.out.println("Not Prime Number");
			}
		} else {
			System.out.println("Not A Number");
		}

	}
}
