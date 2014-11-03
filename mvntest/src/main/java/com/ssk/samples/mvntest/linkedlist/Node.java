package com.ssk.samples.mvntest.linkedlist;


@SuppressWarnings("unused")
public class Node<Item extends Comparable> {
	Item data;
	Node next;

	public Node(){
		
	}
	public Node(Item data, Node next) {
		this.data = data;
		this.next = next;
	}
}
