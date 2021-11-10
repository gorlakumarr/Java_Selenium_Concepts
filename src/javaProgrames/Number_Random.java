package javaProgrames;

import java.util.Random;

public class Number_Random {
	public static void main(String[] args) {
		Random rand = new Random();
		int randNum = rand.nextInt(100);
		System.out.println(randNum);

		System.out.println(Math.random());
	}
}
