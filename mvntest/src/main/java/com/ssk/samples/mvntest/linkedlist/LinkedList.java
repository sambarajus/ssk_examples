package com.ssk.samples.mvntest.linkedlist;

import java.util.Iterator;

@SuppressWarnings("rawtypes")
public class LinkedList<Item extends Comparable> implements Iterable {

	private Node<Item> head;
	private Node<Item> tail;
	private int length;

	public int size() {
		return length;
	}

	public void reverse() {
		Node<Item> current = head;
		Node<Item> temp = null;
		Node<Item> prev = null;
		while (current != null) {
			temp = current.next;
			if (prev == null) {
				tail = current;
			}
			current.next = prev;
			prev = current;
			head = current;
			current = temp;
		}

	}

	public Item findNthElement(int n) {

		Node<Item> current = head;
		Item item = null;
		int i = 1;
		while (current != null) {
			if (i == n) {
				item = current.data;
			} else {
				current = current.next;
			}
			i++;
		}

		return item;
	}

	public void removeDuplicates() {
		Node<Item> currentNode = head;
		try {

			while (currentNode != null) {
				Node<Item> innerNode = currentNode;
				while (innerNode.next != null) {
					if (currentNode.data.compareTo(innerNode.next.data) == 0) {
						innerNode.next = innerNode.next.next;
						length--;
					} else {
						innerNode = innerNode.next;
					}

				}
				currentNode = currentNode.next;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void sortLinkedList() {
		// TODO
	}

	public void insertNode(Item data, int position) {

		int i = 1;
		Node current = head;
		while (current != null) {
			if (i == position) {
				// Node temp = current.next;
				Node node = new Node(data, current.next);
				current.next = node;
			} else {
				current = current.next;
			}
			i++;
		}
	}

	public Item getFirst() {
		if (head != null)
			return head.data;
		else
			return null;
	}

	public Item getLast() {
		if (tail != null)
			return tail.data;
		else
			return null;
	}

	public void addNode(Item item) {
		Node<Item> node = new Node<Item>(item, null);
		if (head == null) {
			head = node;
		} else {
			tail.next = node;
		}
		tail = node;
		length++;
	}

	public Item findNthElementToLast(int n) {
		Node<Item> runner = head;
		Node<Item> current = head;
		int i = 0;
		while (current != null) {
			if (i >= n) {
				runner = runner.next;
			}
			i++;
			current = current.next;
		}
		return runner.data;
	}

	public void delete(Item item){
		Node<Item> current = head;
		
		while(current!=null){
			if(current.data.compareTo(item)==0){
				current.next = current.next.next;
				length--;
			}else{
				current = current.next;
			}
		}
		
		
	}
	
	
	@SuppressWarnings("unused")
	private class Node<Item extends Comparable> {
		Item data;
		Node next;

		public Node(Item data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}
