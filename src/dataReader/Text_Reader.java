package dataReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Text_Reader {
	public static void main(String[] args) {

		// 1.BufferedReader
		try {
			File file = new File("C:\\GK_Work\\codebase\\sele_learn_gk\\src\\notes\\CSS Selector.txt");
			BufferedReader br = new BufferedReader(new FileReader(file));
			String st;

			while ((st = br.readLine()) != null)
				System.out.println(st);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 2.FileReader
		try {
			File file = new File("C:\\GK_Work\\codebase\\sele_learn_gk\\src\\notes\\CSS Selector.txt");
			FileReader fileReader = new FileReader(file);
			int i;

			while ((i = fileReader.read()) != -1)
				System.out.println(i);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 3.Scanner
		try {
			File file = new File("C:\\GK_Work\\codebase\\sele_learn_gk\\src\\notes\\CSS Selector.txt");
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 3.Scanner But with out loops
		try {
			File file = new File("C:\\GK_Work\\codebase\\sele_learn_gk\\src\\notes\\CSS Selector.txt");
			Scanner scanner = new Scanner(file);
			scanner.useDelimiter("\\Z");
			System.out.println(scanner.next());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}