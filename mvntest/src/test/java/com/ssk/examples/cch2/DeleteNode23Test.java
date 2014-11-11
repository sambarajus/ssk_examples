package com.ssk.examples.cch2;

import static org.junit.Assert.*;

import org.junit.Test;

public class DeleteNode23Test {

	@Test
	public void testDeleteNode() {
		
		SingleNode n1 = new SingleNode(10);
		SingleNode n2 = new SingleNode(15);
		SingleNode n3 = new SingleNode(20);
		SingleNode n4 = new SingleNode(25);
		SingleNode n5 = new SingleNode(30);
		SingleNode n6 = new SingleNode(35);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = null;
		
		DeleteNode23 test = new DeleteNode23();
		test.deleteNode(n1, new SingleNode(25));
		assertEquals(5, n1.getSize());
		System.out.println(n1.toString());
	}

}
