/**
 * 
 */
package com.ssk.examples.hackerrank;

import java.util.Scanner;

/**
 * @author shravans
 *
 */
public class UtopianTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		for(int i = 0;i<t;i++){
			printUtopianTreeGrowth(Integer.parseInt(sc.nextLine()));
			
		}
	}
	
	private static void printUtopianTreeGrowth(int cycles){
		int sizeOfTheTree = 1;
		for(int i = 1;i<=cycles;i++){
			if(i%2==1){
				//spring - double the height
				sizeOfTheTree = sizeOfTheTree*2;
			}else{
				//summer - increment by 1
				sizeOfTheTree++;
			}
		}
		System.out.println(sizeOfTheTree);
	}
	

}
