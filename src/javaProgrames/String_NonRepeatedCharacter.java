package javaProgrames;

public class String_NonRepeatedCharacter {

	public static void main(String[] args) {

		String s = "gkgumarr";

		for (char c : s.toCharArray()) {
			if (s.indexOf(c) == s.lastIndexOf(c)) {
				System.out.println("String :> " + s + " <: is Character :" + c);
			}
		}
	}
}