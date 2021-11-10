package javaProgrames;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class File_WriteDataToText {
	public static void main(String[] args) {

		// Approach 1
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter("C:\\GK_Work\\codebase\\sele_learn_gk\\src\\resources\\SampleWrite.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		try {
			bufferedWriter.write("Welcome to Java");
			bufferedWriter.write("Sample");
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			bufferedWriter.close();
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Approach 2

}
