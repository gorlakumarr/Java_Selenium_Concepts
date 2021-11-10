package javaProgrames;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class File_ReadDataFromText {
	public static void main(String[] args) {

		// Approach 1
		FileReader fileReader = null;
		try {
			fileReader = new FileReader("C:\\GK_Work\\codebase\\sele_learn_gk\\src\\resources\\Sample.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String str = "";
		try {
			while ((str = bufferedReader.readLine()) != null) {
				System.out.println(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			bufferedReader.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		try {
			fileReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// Approach 2
		File file = new File("C:\\GK_Work\\codebase\\sele_learn_gk\\src\\resources\\Sample.txt");
		Scanner scanner = null;
		try {
			scanner = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		while (scanner.hasNext()) {
			System.out.println(scanner.nextLine());
		}

	}

}
