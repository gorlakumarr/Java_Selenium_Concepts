package javaConcepts;

import java.util.StringJoiner;

public class StringJoinerConcept {

	public static void main(String[] args) {
		// Tom,Lisa,Peter

		StringJoiner joiner = new StringJoiner("-", "{", "}");
		joiner.add("Tom").add("Lisa").add("Peter");
		System.out.println(joiner.toString());
	}
}
