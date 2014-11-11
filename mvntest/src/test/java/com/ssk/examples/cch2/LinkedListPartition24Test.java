package com.ssk.examples.cch2;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListPartition24Test {

	

	@Test
	public void testSplitPartition(){
		
		LinkedListPartition24 test = new LinkedListPartition24();
		
		SingleNode n1 = new SingleNode(10);
		SingleNode n2 = new SingleNode(35);
		SingleNode n3 = new SingleNode(20);
		SingleNode n4 = new SingleNode(25);
		SingleNode n5 = new SingleNode(30);
		SingleNode n6 = new SingleNode(35);
		SingleNode n7 = new SingleNode(22);
		SingleNode n8 = new SingleNode(27);
		SingleNode n9 = new SingleNode(21);
		SingleNode n10 = new SingleNode(35);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next =n7;
		n7.next =n8;
		n8.next =n9;
		n9.next =n10;
		n10.next = null;
		System.out.println(n1.toString());
		n1 = test.splitPartition(n1, 45);
		assert(true);
		System.out.println(n1.toString());
		assertEquals(10, n1.getSize());
	}
	
}
