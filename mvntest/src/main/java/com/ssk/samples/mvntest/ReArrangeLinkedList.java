package com.ssk.samples.mvntest;
/*
 * You have a LinkList with each node having Next node and Other node and Data. 
i.e. Class Node 
{ 
Node Next; 
Node Other; 
int Data; 
} 

Next pointer always points to next node and Other node can point to any other node in the list or can be pointing to null/nothing or can point to self. 

Write program to copy this link list to a new list with proper Next and Other pointers
 */
public class ReArrangeLinkedList {
	public static void main(String args[]){
		Node n1 = new Node(10);
		Node n2 = new Node(30);
		Node n3 = new Node(15);
		Node n4 = new Node(35);
		Node n5 = new Node(25);
		Node n6 = new Node(20);
		
		n1.next = n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;
		n1.otherNode=n1;
		n2.otherNode=n4;
		n3.otherNode=n4;
		n4.otherNode=n3;
		n5.otherNode=n6;
		n6.otherNode=n2;
		
	}

	public static Node reArrangeLinkrdList(Node head){
		
		
		return head;
	}
}
