package collections;

import java.util.EnumSet;
import java.util.Iterator;

public class Set_EnumSet {
	/**
	 * >It's not synchronized
	 * 
	 * >It's a highly performence java collections
	 * 
	 * >Faster than HashSet
	 * 
	 * >All the Methods are implemented using Airthemetic Operations
	 * 
	 **/

	enum Lang {
		JAVA, CSHARP, JAVASCRIPT, PYTHON, RUBY
	}

	public static void main(String[] args) {

		// Created New Enum Set using Enum
		EnumSet<Lang> enumSet = EnumSet.allOf(Lang.class);
		System.out.println(enumSet);

		// Empty EumSet
		EnumSet<Lang> enumSet1 = EnumSet.noneOf(Lang.class);
		System.out.println(enumSet1);

		// Range(e1,e2)
		EnumSet<Lang> enumSet2 = EnumSet.range(Lang.CSHARP, Lang.PYTHON);
		System.out.println(enumSet2);

		// Of
		EnumSet<Lang> enumSet3 = EnumSet.of(Lang.CSHARP);
		System.out.println(enumSet3);

		EnumSet<Lang> enumSet4 = EnumSet.of(Lang.JAVA, Lang.RUBY);
		System.out.println(enumSet4);

		// Add and AddAll()
		EnumSet<Lang> lang1 = EnumSet.allOf(Lang.class);
		EnumSet<Lang> lang2 = EnumSet.noneOf(Lang.class);

		lang2.add(Lang.PYTHON);
		lang2.addAll(lang1);

		System.out.println(lang1);
		System.out.println(lang2);

		System.out.println();

		// How to Iterate
		Iterator<Lang> iterator = lang1.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
