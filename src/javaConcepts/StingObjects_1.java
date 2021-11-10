package javaConcepts;

public class StingObjects_1 {
	public static void main(String[] args) {

		/**
		 * how many string objects will be created here
		 * 
		 * By using literals : It will create only object in SCP
		 * 
		 * By using new keyword: It will create 2 objcets : one in HEAP and one in SCP
		 * 
		 */
		// Ans: 3

		String s1 = new String("Kumar");
		String s2 = new String("Kumar");
		String s3 = "Kumar";
		String s4 = "Kumar";

		// String: Heap and Stack Memory

		// Heap: Inside this there is String Constant Pool (SCP)

		/**
		 * s1 stored in Stack Memory
		 * 
		 * --new string("kumar")--object will be created in Heap Memory and SCP as well
		 * : 2
		 * 
		 * s2 stored in Stack Memory
		 * 
		 * --new string("kumar")--object will be created in Heap Memory but not in SCP
		 * as we already have object with "Kumar" : 1
		 * 
		 * 
		 * So Total Number of objects created : 3 (2 in heap and 1 in SCP)
		 * 
		 * now again
		 * 
		 * 
		 * String s3 = "Kumar"; s3 stored in Stack Memory and now s3 pointing to "Kumar"
		 * object in SCP
		 * 
		 * again
		 * 
		 * String s4 = "Kumar"; s4 stored in Stack Memory, s4 will point to "Kumar"
		 * object in SCP
		 * 
		 * if there is no new keyword then object will be created in SCP only not in
		 * Heap memory
		 * 
		 * now total: 3 objects are created
		 * 
		 */

	}

}
