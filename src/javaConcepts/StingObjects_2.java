package javaConcepts;

public class StingObjects_2 {
	public static void main(String[] args) {

		String s1 = "Kumar"; // 1 Object in SCP
		String s2 = "Kumar";// Ref to above Object in SCP
		String s3 = s1;

		String n1 = new String("Kumar"); // One Object in Heap and ref to first obj in SCP
		String n2 = new String("Kumar");// One Object in Heap and ref to first obj in SCP

		// How Many Objects will be Created?
		// Ans: 3
	}
}
