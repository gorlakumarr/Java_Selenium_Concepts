package javaProgrames;

public class Number_Armstrong {

	public static void main(String[] args) {
		checkArmstrong(153);
	}

	public static void checkArmstrong(int num) {
		int cube = 0;
		int reminder;
		int t;

		t = num;

		while (num > 0) {
			reminder = num % 10;
			num = num / 10;
			cube = cube + (reminder * reminder * reminder);
		}

		if (t == cube)
			System.out.println("Number is Armstrong Number");
		else
			System.out.println("Number is Not Armstrong Number");
	}
}
