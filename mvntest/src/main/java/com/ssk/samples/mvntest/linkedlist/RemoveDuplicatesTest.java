package com.ssk.samples.mvntest.linkedlist;

public class RemoveDuplicatesTest {

	public Node removeDuplicates(Node head) {

		Node currentNode = head;
		while (currentNode.next != null) {
			Node innerNode = currentNode;
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

	public static void main(String args[]) {
		Node n1 = new Node(10);
		Node n2 = new Node(10);
		Node n3 = new Node(15);
		Node n4 = new Node(10);
		Node n5 = new Node(30);
		Node n6 = new Node(15);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = null;

		RemoveDuplicatesTest t = new RemoveDuplicatesTest();
		t.printLinkedList(n1);
		System.out.println("Removing Duplicates \n");
//		t.removeDuplicates(n1);

//		t.printLinkedList(n1);
//		System.out.println(t.FindnthToLast(n1, 2).data);
//		t.printLinkedList(t.reverseLinked(n1));
//		t.printLinkedList(t.findNthNode(n1, 1));
		Node n = t.sortLinkedList(n1);
		t.printLinkedList(n);
	}

	public void printLinkedList(Node n) {
		while (n.next != null) {
			System.out.print(n.data + " --> ");
			n = n.next;
		}
		if (n.next == null) {
			System.out.print(n.data + "\n");
		}
	}

	Node FindnthToLast(Node head, int n) {

		if (n < 1 || head == null)
			return null;

		Node pntr1 = head;
		Node pntr2 = head;

		// advance pntr2 by n-1 nodes;
		for (int i = 0; i < n - 1; ++i) {

			if (pntr2 == null) {
				/*
				 * this is an error condition to check to see if the linked list
				 * is less than n nodes long, in which case we just return null
				 * indicating an error
				 */
				return null;
			}

			else
				// go to the next node
				pntr2 = pntr2.next;

		}

		/*
		 * Now, keep going until you hit a null node, and then you've reached
		 * the end, and pntr1 will be pointing to the nth from last node
		 */

		while (pntr2.next != null) {
			pntr1 = pntr1.next;
			pntr2 = pntr2.next;
		}

		return pntr1;

	}
	
	
	public Node reverseLinked(Node head){
		
		Node temp = null;
		Node prev = null;
		Node current = head;
		
		while(current!=null){
			temp = current.next;
			current.next = prev;
			prev = current;
			current = temp;
		}
		return prev;
	}
	
	public Node findNthNode(Node head, int n){
		
		Node current = head;
		Node runner = head;
		int i=1;
		while(current!=null){
			if(i>n){
				runner = runner.next;
			}else{
				runner = null;
			}
			current = current.next;
			i++;
		}
		
		return runner;
	}
	
	public Node sortLinkedList(Node head){
		
		Node current = head;
		
		while(current.next!=null){
			Node t = current.next;
			if(t.data<current.data){
				current.next = t.next;
				current = t;
//				current = current.next;
			}else{
				current = current.next;
			}
		}
		
		head = current;
		
		return head;
	}
}
