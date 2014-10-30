package com.ssk.samples.mvntest.linkedlist;

import junit.framework.TestCase;

public class LinkedListTest extends TestCase {

	public void testReverse() {
		LinkedList<String> list = new LinkedList<String>();
		list.addNode("Hello");
		list.addNode("Shravan");
		list.addNode("Good");
		list.addNode("Afternoon");
		list.reverse();
		assertEquals("Afternoon", list.getFirst());
		assertEquals("Hello", list.getLast());
		
	}

	public void testFindNthElement() {
		LinkedList<String> list = new LinkedList<String>();
		list.addNode("Hello");
		list.addNode("Shravan");
		list.addNode("Good");
		list.addNode("Afternoon");
		assertEquals("Hello", list.findNthElement(1));
		assertEquals("Shravan", list.findNthElement(2));
		assertEquals("Good", list.findNthElement(3));
		assertEquals("Afternoon", list.findNthElement(4));
		list.reverse();
		assertEquals("Hello", list.findNthElement(4));
		assertEquals("Shravan", list.findNthElement(3));
		assertEquals("Good", list.findNthElement(2));
		assertEquals("Afternoon", list.findNthElement(1));
	}

	public void testRemoveDuplicates() {
		LinkedList<String> list = new LinkedList<String>();
		list.addNode("Hello");
		list.addNode("Shravan");
		list.addNode("Good");
		list.addNode("Afternoon");
		list.addNode("Good");
		list.addNode("Afternoon");
		list.removeDuplicates();
		assertEquals(4, list.size());
	}

	public void testSortLinkedList() {
		fail("Not yet implemented");
	}

	public void testInsertNode() {
		fail("Not yet implemented");
	}

	public void testAddNode() {
		LinkedList<String> list = new LinkedList<String>();
		list.addNode("Hello");
		assertEquals("Hello", list.getFirst());
		assertEquals("Hello", list.getLast());
	}

}
