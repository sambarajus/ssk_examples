/**
 * 
 */
package com.ssk.examples.cch2;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ssk.samples.mvntest.Node;
import com.ssk.samples.mvntest.RemoveDuplicatesTest;

/**
 * @author shravans
 *
 */
public class RemoveDuplicate21Test {

	/**
	 * Test method for {@link com.ssk.examples.cch2.RemoveDuplicate21#removeDuplicates(com.ssk.examples.cch2.SingleNode)}.
	 */
	@Test
	public void testRemoveDuplicates() {
//		fail("Not yet implemented");
		
		SingleNode n1 = new SingleNode(10);
		SingleNode n2 = new SingleNode(10);
		SingleNode n3 = new SingleNode(15);
		SingleNode n4 = new SingleNode(10);
		SingleNode n5 = new SingleNode(30);
		SingleNode n6 = new SingleNode(15);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = null;
		RemoveDuplicate21 t = new RemoveDuplicate21();
		assertEquals(6, n1.getSize());
		System.out.println(n1.toString());
		System.out.println("Removing Duplicates \n");
		t.removeDuplicates(n1);
		System.out.println(n1.toString());
		assertEquals(3, n1.getSize());
	}
	@Test
	public void testRemoveDuplicatesWithBuffer(){
		SingleNode n1 = new SingleNode(10);
		SingleNode n2 = new SingleNode(10);
		SingleNode n3 = new SingleNode(15);
		SingleNode n4 = new SingleNode(10);
		SingleNode n5 = new SingleNode(30);
		SingleNode n6 = new SingleNode(15);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = null;
		RemoveDuplicate21 t = new RemoveDuplicate21();
		assertEquals(6, n1.getSize());
		System.out.println(n1.toString());
		System.out.println("Removing Duplicates with buffer\n");
		t.removeDuplicateWithBuffer(n1);
		System.out.println(n1.toString());
		assertEquals(3, n1.getSize());
	}
	
}
