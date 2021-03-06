package com.ssk.examples.cch1;

/**
 * 
 * @author shravans
 * Question 1.2 in Cracking Coding Interview
 */
public class StringReverse12 {

	public String reverseString(char[] strArray){
		
		int start = 0;
		int end = strArray.length -1;
		
		while(start<end){
			char ch = strArray[start];
			strArray[start] = strArray[end];
			strArray[end] = ch;
			start++;
			end --;
		}
		return new String(strArray).toString();
	}
	
	public static void main(String args[]){
		StringReverse12 test = new StringReverse12();
		System.out.println(test.reverseString("hello".toCharArray()));
	}
}
