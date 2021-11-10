package javaConcepts;

import java.util.StringJoiner;

public class String_Manipulation {
	public static void main(String[] args) {

		String str = "The Rain started from here's";
		String str1 = "The Rain Started from here's";

		System.out.println("length of the string -->" + str.length());
		System.out.println("chat at 5th index -->" + str.charAt(5));
		System.out.println("index of s is -->" + str.indexOf("s")); // First occuerence of s
		System.out.println("index of s is -->" + str.indexOf("s", str.indexOf("s") + 1));// Second occuerence of s
		System.out.println("index of from -->" + str.indexOf("from"));
		System.out.println("index of from -->" + str.indexOf("ssfsd")); // return -1

		// String Comparision
		System.out.println(str.equals(str1)); // false
		System.out.println(str.equalsIgnoreCase(str1)); // true

		// Substring
		System.out.println(str.substring(4, 8));

		// trim
		String s = " kumar us ";
		System.out.println(s.trim());

		// remove spaces
		System.out.println(s.replace(" ", ""));

		String st = "1-10-2021";
		System.out.println(st.replace("-", "/"));

		// split
		String string = "Hellp_World_Test_Selenium";
		String sr[] = string.split("_");
		for (int i = 0; i < sr.length; i++) {
			System.out.println(sr[i]);
		}
		String nullref = null;
		// concatenate
		System.out.println("concatenate :" + str.concat(st));
//		System.out.println("concatenate :" + str.concat(nullref));
		// + Operator
		System.out.println("+ operator :" + (str + 5));
		System.out.println("+ operator :" + (str + nullref));

		// Join String Method
		System.out.println("join :" + String.join(" space ", str, st));

		String x = "Hello";
		String y = "world";
		int a = 100;
		int b = 200;
		System.out.println(x + y);// Helloworld
		System.out.println(a + b); // 300
		System.out.println(x + y + a + b); // Hellpworld100200
		System.out.println(a + b + x + y); // 300Hellpworld
		System.out.println(x + y + (a + b));// Hellpworld300

		String scheduledJob = "PurgeAbandonedEntriesBatch";
		// String Format
		System.out.println(String.format("/batchJob/startJob/%s", scheduledJob));

		StringJoiner joinerString = new StringJoiner(" ");

		joinerString.add("Java");
		joinerString.add("Goal");
		joinerString.add("Website");
		System.out.println("joinerString :" + joinerString);

		StringJoiner joinerString2 = new StringJoiner(",");

		joinerString2.add("Java");
		joinerString2.add("Goal");
		joinerString2.add("Website");
		System.out.println("joinerString :" + joinerString2);
	}
}
