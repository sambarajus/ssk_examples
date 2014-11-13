/**
 * 
 */
package com.ssk.examples.cch2;


/**
 * @author shravans
 *
 *         Question 2.2 in Cracking Coding Interview.
 */
public class FindKthElementToLast22 {

	//this code uses Iterative, O(N) time and O(1) space.
	public int findNthElementToLast(SingleNode head,int n) {
		if(n<0)
			return -1;
		
		SingleNode runner = null;
		SingleNode current = head;
		int i = 0;
		while (current != null && runner!=null) {
			if (i >= n) {
				runner = runner.next;
			}
			i++;
			current = current.next;
		}
		if(runner==null){
			return -1;
		}
		return runner.data;
	}
}
