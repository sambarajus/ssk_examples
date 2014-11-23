package com.ssk.examples.others;


public class LinkedListPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node n1 = new Node('A');
		Node n2 = new Node('B');
		Node n3 = new Node('C');
		Node n4 = new Node('D');
		Node n5 = new Node('C');
		Node n6 = new Node('B');
		Node n7 = new Node('A');
		Node n8 = new Node('E');
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
//		n7.next = n8;
		
		LinkedListPalindrome p = new LinkedListPalindrome();
		System.out.println(p.isPalindrom(n1));
		
	}

	public static boolean isPalindrom(Node n) {

		// reverse linked list into another list.

		Node slow = n;
		Node fast = n;
		Node prev = null;
		Node p = new Node();
		while (fast!=null && fast.next != null) {
			fast = fast.next.next;
			p  = new Node(slow.data);
			p.next = prev;
			prev = p;
			System.out.println(p);
			slow = slow.next;
		}
		
		if(fast!=null)
			slow = slow.next;
		
		System.out.println(p.toString());
		
		while(p!=null &&  slow!=null){
			if(p.data!=slow.data){
				return false;
			}
			p = p.next;
			slow = slow.next;
		}
		return true;

	}

	

}
class Node {
	public char data;
	public Node next;

	public Node(){
		
	}
	public Node(char data) {
		this.data = data;
	}

	public String toString() {

		StringBuffer buf = new StringBuffer();
		Node n = this;

		while (n != null) {
			buf.append(n.data);
			if (n.next != null)
				buf.append("-->");
			n = n.next;
		}
		return buf.toString();
	}
}
