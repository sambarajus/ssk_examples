/**
 * 
 */
package com.ssk.examples.cch1;

/**
 * @author shravans
 * Question 1.8 in Cracking Coding Interview: check if String is rotated string.
 *
 */
public class StringRotation18 {

	public boolean isRotation(String s1, String s2){
		
		int length = s1.length();
		
		if(length==s2.length() && length>0){
			String s1s1 = s1+s1;
			return isSubString(s1s1,s2);
		}
		
		return false;
	}
	
	private boolean isSubString(String s1,String s2){
		return s1.contains(s2);
	}
	
	public static void main(String args[]){
		
		StringRotation18 test = new StringRotation18();
		System.out.println(test.isRotation("erbottlewat", "waterbottle"));
	}
}
