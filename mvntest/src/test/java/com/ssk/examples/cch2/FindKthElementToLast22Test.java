/**
 * 
 */
package com.ssk.examples.cch2;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author shravans
 *
 */
public class FindKthElementToLast22Test {

	/**
	 * Test method for {@link com.ssk.examples.cch2.FindKthElementToLast22#findNthElementToLast(com.ssk.examples.cch2.SingleNode, int)}.
	 */
	@Test
	public void testFindNthElementToLast() {

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
		FindKthElementToLast22 t = new FindKthElementToLast22();
		
		//TODO fix these test cases...
		assertEquals(25, t.findNthElementToLast(n1, 3));
		assertEquals(-1, t.findNthElementToLast(n1, 8));
	}

}
