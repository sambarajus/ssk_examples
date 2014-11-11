package com.ssk.examples.cch2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SumOfInts25Test {

	@Test
	public void testSumOfInts() {
//		fail("Not yet implemented");
		
		SingleNode n1 = new SingleNode(7);
		SingleNode n2 = new SingleNode(1);
		SingleNode n3 = new SingleNode(6);
		n1.next = n2;
		n2.next = n3;
		n3.next = null;
		
		SingleNode n4 = new SingleNode(5);
		SingleNode n5 = new SingleNode(9);
		SingleNode n6 = new SingleNode(2);
		n4.next = n5;
		n5.next = n6;
		n6.next = null;
		SumOfInts25 test = new SumOfInts25();
		SingleNode sum = test.sumOfInts(n1, n4);
		System.out.println(sum.toString());
		
		assertEquals(3, sum.getSize());
	}

}
