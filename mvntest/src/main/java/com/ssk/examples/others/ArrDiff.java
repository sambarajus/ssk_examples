/**
 * 
 */
package com.ssk.examples.others;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author sskumar
 *
 */
public class ArrDiff {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,5,7,8,9,10,12,14,15};
		printDiff(a);

	}

	
	public static void printDiff(int[] a){
		int lastIndex = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 1;i<a.length;i++)
			if(a[i]-a[i-1]==2){
				if(lastIndex!=i-1){
					list.add(a[i-1]);
				}
				list.add(a[i]);
				lastIndex = i;
				
			}
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
	}
}
