/**
 * 
 */
package com.ssk.examples.others;

import java.util.List;

/**
 * @author sskumar
 *
 *Given a sorted array with some sequenced numbers and some non-sequenced numbers. Write an algorithm that takes this array as an input and returns a list of {start, end} of all consecutive numbers. Consecutive numbers have difference of 1 only. 
E.g. of array: 
[4, 5, 6, 7, 8, 9, 12, 15, 16, 17, 18, 20, 22, 23, 24, 27]



 *
 */
public class SequentialNumbersFromArray {

	public List getSequences(int[] array){
		int begin = array[0];
		int end = array[0];
		for(int i : array){
			if(i-end>1){
				System.out.println("{"+begin+" : "+end+" }");
				begin = i;
				end = i;
			}else{
				end = i;
			}
		}
		return null;
	}
}
