package javaProgrames;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_String_ToArrayList {
	public static void main(String[] args) {
		String[] array = new String[] { "ANDROID", "JSP", "JAVA", "STRUTS", "HADOOP", "JSF" };
		// Method 1
		ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(array));
		System.out.println(arrayList);

		// Method 2
		ArrayList<String> list = new ArrayList<String>();

		list.add("JAVA");

		list.add("JSP");

		list.add("ANDROID");

		list.add("STRUTS");

		list.add("HADOOP");

		list.add("JSF");

		String[] array1 = new String[list.size()];

		list.toArray(array1);

		for (String string : array1) {
			System.out.println(string);
		}
	}
}
