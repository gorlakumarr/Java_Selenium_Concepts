package javaConcepts;

public class PrintHelloWithOutSemiColon {
	public static void main(String[] args) {

		if (System.out.printf("Hello World" + "\n") != null) {

		}

		if (System.out.append("Hello World" + "\n") != null) {

		}

		if (System.out.append("Hello World" + "\n").equals(null)) {

		}

		for (int i = 0; i < 1; System.out.println("Hello World"))
			i++;
	}

}
