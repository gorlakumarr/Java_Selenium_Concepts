package javaProgrames;

public class Number_Palindrome {
	public static void main(String[] args) {
		palindrome(12321);
	}

	public static void palindrome(int num) {
		int orginalNum = num;
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		if (orginalNum == rev)
			System.out.println("Number is Palindrome");
		else
			System.out.println("Number is Not Palindrome");
	}
}
