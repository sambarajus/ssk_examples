/**
 * 
 */
package com.ssk.examples.java;

/**
 * @author sskumar
 *
 */
public class BitWiseOperators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		bitwiseAnd(60, 13);
		bitwiseOR(60, 13);
		bitwiseXOR(60, 13);
		bitwiseUnary(60,13);
	}

	
	public static void bitwiseAnd(int a, int b){
		System.out.println("a AND b :"+ (a & b));
	}
	
	public static void bitwiseOR(int a, int b){
		System.out.println("a OR b :"+ (a | b));
	}
	
	public static void bitwiseXOR(int a, int b){
		System.out.println("a XOR b :"+ (a ^ b));
	}
	
	public static void bitwiseUnary(int a, int b){
		System.out.println("a's complement :"+ (~a));
	}
}
