/**
 * 
 */
package com.ssk.examples.cch2;

import java.util.HashSet;

/**
 * @author shravans Question 2.1 in Cracking coding interview: Remove Duplicates
 *         from unsorted Linked List.
 */
public class RemoveDuplicate21 {

	// this code runs on O(1) space but O(N^2) time
	public SingleNode removeDuplicates(SingleNode head) {

		SingleNode currentNode = head;
		while (currentNode.next != null) {
			SingleNode innerNode = currentNode;
			while (innerNode.next != null) {
				if (currentNode.data == innerNode.next.data) {
					innerNode.next = innerNode.next.next;
				} else {
					innerNode = innerNode.next;
				}
			}
			currentNode = currentNode.next;
		}
		head = currentNode;
		return head;
	}
//this code runs on O(N) time, where N is number of nodes in linked list;
	public SingleNode removeDuplicateWithBuffer(SingleNode head) {

		SingleNode prev = null;
		SingleNode n = head;
		HashSet<Integer> set = new HashSet<Integer>();
		while (n != null) {
			if (set.contains(n.data)) {
				prev.next = n.next;
			} else {
				set.add(n.data);
				prev = n;
			}
			n = n.next;
		}

		return head;
	}
}
