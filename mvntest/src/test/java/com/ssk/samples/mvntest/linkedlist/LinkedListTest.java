package com.ssk.samples.mvntest.linkedlist;

import junit.framework.TestCase;


public class LinkedListTest extends TestCase {

	public void testReverse() {
		System.out.println("LinkedListTest.testReverse()");
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
		System.out.println("LinkedListTest.testFindNthElement()");
		LinkedList<String> list = new LinkedList<String>();
		list.addNode("one");
		list.addNode("Two");
		list.addNode("Three");
		list.addNode("Four");
		list.addNode("Five");
		list.addNode("Six");
		list.addNode("Seven");
		list.addNode("Eight");
		list.addNode("Nine");
		System.out.println(list.toString());
		assertEquals("one", list.findNthElement(1));
		assertEquals("Two", list.findNthElement(2));
		assertEquals("Three", list.findNthElement(3));
		assertEquals("Four", list.findNthElement(4));
		/*list.reverse();
		assertEquals("Hello", list.findNthElement(4));
		assertEquals("Shravan", list.findNthElement(3));
		assertEquals("Good", list.findNthElement(2));
		assertEquals("Afternoon", list.findNthElement(1));*/
	}

	public void testRemoveDuplicates() {
		System.out.println("LinkedListTest.testRemoveDuplicates()");
		LinkedList<String> list = new LinkedList<String>();
		list.addNode("one");
		list.addNode("Two");
		list.addNode("Three");
		list.addNode("Three");//duplicate entry..
		list.addNode("Four");
		list.addNode("Five");
		list.addNode("Six");
		list.addNode("Six"); //duplicate
		list.addNode("Seven");
		list.addNode("Eight");
		list.addNode("Six");
		list.addNode("Nine");
		System.out.println(list.toString());
		list.removeDuplicates();
		System.out.println(list.toString());
		assertEquals(9, list.size());
	}

	public void testFindNthElementToLast(){
		System.out.println("LinkedListTest.testFindNthElementToLast()");
		LinkedList<String> list = new LinkedList<String>();
		list.addNode("Hello");
		list.addNode("Shravan");
		list.addNode("Good");
		list.addNode("Afternoon");
		assertEquals("Hello", list.findNthElementToLast(4));
		assertEquals("Shravan", list.findNthElementToLast(3));
		assertEquals("Good", list.findNthElementToLast(2));
		assertEquals("Afternoon", list.findNthElementToLast(1));
		list.reverse();
		assertEquals("Hello", list.findNthElementToLast(1));
		assertEquals("Shravan", list.findNthElementToLast(2));
		assertEquals("Good", list.findNthElementToLast(3));
		assertEquals("Afternoon", list.findNthElementToLast(4));
	}
	
	public void testFindMiddle(){
		System.out.println("LinkedListTest.testFindMiddle()");
		LinkedList<String> list = new LinkedList<String>();
		list.addNode("one");
		list.addNode("Two");
		list.addNode("Three");
		list.addNode("Four");
		list.addNode("Five");
		list.addNode("Six");
		list.addNode("Seven");
		list.addNode("Eight");
		list.addNode("Nine");
//		System.out.println(list.findMiddle().data);
		System.out.println(list.toString());
		assertEquals("Five", list.findMiddle().data);
	}
	
	/*public void testDelete(){
		LinkedList<String> list = new LinkedList<String>();
		list.addNode("Hello");
		list.addNode("Shravan");
		list.addNode("Good");
		list.addNode("Afternoon");
		assertEquals(4, list.size());
		list.delete("Shravan");
		assertEquals(3, list.size());
	}*/
	
	/*public void testSortLinkedList() {
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
	}*/

	public void testPartition(){
		
	}
	
	/*public void testFindLoop(){
		LinkedList<String> list = new LinkedList<String>();
		Node<String> n1 = new Node<String>(new String("Hello"),null);
		Node<String> n2 = new Node<String>(new String("Shravan"),null);
		Node<String> n3 = new Node<String>(new String("Good"),null);
		Node<String> n4 = new Node<String>(new String("Afternoon"),null);
		list.add(n1);
		list.add(n2);;
		list.add(n3);
		list.add(n4);
		list.add(n2);
		assertEquals("Good", list.findLoop());
	}*/
	
	
	public void testMergeList(){
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.addNode(1);
		list.addNode(2);
		list.addNode(4);
		list.addNode(5);
		list.addNode(7);
		list.addNode(9);
		list.addNode(12);
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		
		list2.addNode(3);
		list2.addNode(6);
		list2.addNode(9);
		list2.addNode(10);
		list2.addNode(11);
		
		System.out.println("List 1: "+list.toString());
		System.out.println("List 2: "+list2.toString());
		list.mergeTLists(list, list2);
		assert(true);
	}
}
