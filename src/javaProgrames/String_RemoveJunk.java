package javaProgrames;

public class String_RemoveJunk {
	public static void main(String[] args) {
		/**
		 * Remove junk
		 * 
		 * Regular expressions [a-z A-Z 0-9]
		 */
		String str = "#$%^&*&^%$ sds%hdkah 02842#45678&^%433$%^783728 $%^&8";
		System.out.println(str.replaceAll("[^a-zA-Z0-9 ]", ""));
	}
}
