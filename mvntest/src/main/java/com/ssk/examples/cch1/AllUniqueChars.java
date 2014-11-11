package com.ssk.examples.cch1;

/**
 * 
 * @author shravans
 * Question 1.1 in Cracking Coding Interview
 */
public class AllUniqueChars {

	// Additional Storage is used..
	public boolean allUnique(String str) {
		boolean[] marked = new boolean[256];
		char[] strArray = str.toCharArray();
		for (Character c : strArray) {
			if (marked[c])
				return true;
			else
				marked[c] = true;
		}
		return false;
	}

	public static void main(String args[]) {
		AllUniqueChars test = new AllUniqueChars();
		System.out.println(test.allUnique("hello"));
		System.out.println(test.allUnique("helo"));
	}

	
}
