/**
 * 
 */
package com.ssk.examples.cch2;

/**
 * @author sskumar
 * Question 2.3 from Cracking coding interview.
 */
public class DeleteNode23 {

	public void deleteNode(SingleNode head, SingleNode node) {

		if (head == null || node == null)
			return;
		SingleNode current = head;
		
		while (current.next != null) {
			if (current.next.data == node.data) {
				current.next = current.next.next;
			} else {
				current = current.next;
			}

		}

	}

}
