package com.ssk.examples.cch1;

/**
 * 
 * @author shravans
 * Question 1.1 in Cracking Coding Interview
 */
public class AllUniqueChars11 {

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
		AllUniqueChars11 test = new AllUniqueChars11();
		System.out.println(test.allUnique("hello"));
		System.out.println(test.allUnique("helo"));
	}

	
}
