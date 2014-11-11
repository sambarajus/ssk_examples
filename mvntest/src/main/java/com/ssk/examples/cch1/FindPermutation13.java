package com.ssk.examples.cch1;

import java.util.Arrays;
/**
 * 
 * @author shravans
 * Question 1.3 in Cracking Coding Interview
 */
public class FindPermutation13 {

	public boolean isPermutation(String str1, String str2){
		if(str1.length()!=str1.length())
			return false;
		if(this.sort(str1).equals(this.sort(str2)))
			return true;
		return false;
	}
	
	public String sort(String str){
		char[] c = str.toCharArray();
		Arrays.sort(c);
		return new String(c);
	}
	
	public static void main(String args[]){
		FindPermutation13 test = new FindPermutation13();
		System.out.println(test.isPermutation("hello", "lloeh"));
	}
}
