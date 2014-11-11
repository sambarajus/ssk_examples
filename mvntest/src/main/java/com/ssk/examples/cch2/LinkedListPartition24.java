package com.ssk.examples.cch2;

import com.ssk.samples.mvntest.linkedlist.LinkedList;
/**
 * 
 * @author sskumar
 *	Question 2.4 in Cracking Coding Interview
 */
public class LinkedListPartition24 {


	public SingleNode splitPartition(SingleNode head,int x) {
		
		if(head==null)
			return null;
		
		SingleNode leftNode = null;
		SingleNode rightNode = null;
		SingleNode leftTail = null;
		SingleNode current = head;
		
		
		while (current != null) {
			System.out.println("processing : " + current.data);
			SingleNode n = new SingleNode(current.data);
			if (current.data>x) {
				if (rightNode != null) {
					n.next = rightNode;
					rightNode = n;
				} else {
					rightNode = n;
				}
			} else if (current.data<x) {
				if (leftNode != null) {
					n.next = leftNode;
					leftNode = n;
				} else {
					leftNode = n;
					leftTail = n;
				}

			} else {
				leftTail.next = n;
				leftTail = n;
			}
			current = current.next;
		}
		leftTail.next = rightNode;
		head = leftNode;
		return head;
	}

	public static void sumOfInts() {
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		l1.addNode(7);
		l1.addNode(1);
		l1.addNode(6);

		LinkedList<Integer> l2 = new LinkedList<Integer>();
		l2.addNode(5);
		l2.addNode(9);
		l2.addNode(2);
		l2.sumofIntsReverseOrder(l1, l2);
	}

}
