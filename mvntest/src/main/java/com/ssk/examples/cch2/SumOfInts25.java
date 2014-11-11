/**
 * 
 */
package com.ssk.examples.cch2;


/**
 * @author sskumar
 *
 */
public class SumOfInts25 {

	
	public SingleNode sumOfInts(SingleNode n1, SingleNode n2){
		
		SingleNode n3 = null;
		SingleNode temp = null;
		int cf = 0;
		while (n1 != null || n2 != null) {
			int sum = (Integer) n1.data + (Integer) n2.data + cf;
			cf = sum / 10;
			if (n3 != null) {
				temp.next = new SingleNode(sum % 10, null);
				temp = temp.next;
			} else {
				n3 = new SingleNode(sum % 10, null);
				temp = n3;
			}
			n1 = n1.next;
			n2 = n2.next;
		}
		
		return n3;
	}
}
