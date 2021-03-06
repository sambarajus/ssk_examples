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

	public Node<Item> getHead() {
		return head;
	}

	public Node<Item> getTail() {
		return tail;
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
		System.out.println("LinkedList.findNthElement() " + n);
		Node<Item> current = head;
		Item item = null;
		while (n > 0 && current != null) {
			item = current.data;
			current = current.next;
			n--;
		}
		System.out.println("LinkedList.findNthElement() " + item);
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

	public void mergeTLists(LinkedList l1, LinkedList l2) {

		System.out.println("LinkedList.mergeTLists()");

		Node p1 = l1.head;
		Node p2 = l2.head;

		Node fakeHead = new Node();
		Node p = fakeHead;
		while (p1 != null && p2 != null) {
			if (p1.data.compareTo(p2.data) <= 0) {
				p.next = p1;
				p1 = p1.next;
			} else {
				p.next = p2;
				p2 = p2.next;
			}
			p = p.next;
		}
		if (p1 != null)
			p.next = p1;
		if (p2 != null)
			p.next = p2;

		LinkedList l3 = new LinkedList<Comparable>();
		l3.head = fakeHead;
		System.out.println(l3.toString());
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

	public void add(Node<Item> node) {
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

	public void delete(Item item) {
		Node<Item> current = head;

		while (current != null) {
			if (current.data.compareTo(item) == 0) {
				current.next = current.next.next;
				length--;
			} else {
				current = current.next;
			}
		}
	}

	public void splitPartition(Item x) {
		Node<Item> leftNode = null;
		Node<Item> rightNode = null;
		Node<Item> leftTail = null;
		Node<Item> current = head;
		while (current != null) {
			System.out.println("processing : " + current.data);
			Node<Item> n = new Node<Item>(current.data, null);
			if (x.compareTo(current.data) < 0) {
				if (rightNode != null) {
					n.next = rightNode;
					rightNode = n;
				} else {
					rightNode = n;
				}
			} else if (x.compareTo(current.data) > 0) {
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
		this.head = leftNode;
		printList(this.head);
	}

	public LinkedList sumofIntsReverseOrder(LinkedList<Integer> l1,
			LinkedList<Integer> l2) {

		LinkedList<Integer> l3 = new LinkedList<Integer>();
		Node n1 = l1.getHead();
		Node n2 = l2.getHead();
		Node<Integer> n3 = null;
		Node<Integer> temp = null;
		int cf = 0;
		while (n1 != null || n2 != null) {
			int sum = (Integer) n1.data + (Integer) n2.data + cf;
			cf = sum / 10;
			if (n3 != null) {
				temp.next = new Node<Integer>(sum % 10, null);
				temp = temp.next;
			} else {
				n3 = new Node<Integer>(sum % 10, null);
				temp = n3;
			}
			n1 = n1.next;
			n2 = n2.next;
		}
		printList(n3);
		return null;

	}

	public Node findMiddle() {

		Node slowPointer = head.next;
		Node fastPointer = head.next.next;

		while (fastPointer != null && fastPointer.next != null) {
			System.out.println("SlowPointer :" + slowPointer.data
					+ ", FastPointer: " + fastPointer.data);
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next.next;
		}
		System.out.println("Middle : " + slowPointer.data);
		return slowPointer;
	}

	public Item findLoop() {
		Node<Item> slow = this.head;
		Node<Item> fast = this.head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				break;
			}
		}

		if (fast == null || fast.next == null) {
			return null;
		}
		slow = head;
		while (slow != fast) {
			slow = slow.next;
			fast = fast.next;
		}

		return fast.data;

	}

	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public void printList(Node n) {
		// Node n = head;
		while (n.next != null) {
			System.out.print(n.data + " --> ");
			n = n.next;
		}
		if (n.next == null) {
			System.out.print(n.data + "\n");
		}
	}

	public String toString() {

		StringBuffer buf = new StringBuffer();
		if (head == null)
			return null;

		Node current = head;

		while (current != null) {
			buf.append(current.data);
			if (current.next != null)
				buf.append("-->");

			current = current.next;
		}

		return buf.toString();
	}

}
