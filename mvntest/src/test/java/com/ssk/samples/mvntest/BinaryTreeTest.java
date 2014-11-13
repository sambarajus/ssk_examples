package com.ssk.samples.mvntest;

import com.ssk.samples.mvntest.ds.tree.example.BinaryTree;

import junit.framework.TestCase;

public class BinaryTreeTest extends TestCase {

	public void testSetRoot() {
		BinaryTree<Comparable> tree = new BinaryTree<Comparable>();
		tree.put("H");
		tree.put("G");
		tree.put("I");
		tree.put("K");
		tree.put("A");
		tree.put("C");
		tree.put("B");
		assertEquals("H", tree.getRoot());
	}

	public void testPut() {
		BinaryTree<Comparable> tree = new BinaryTree<Comparable>();
		tree.put("H");
		assertEquals(true, true);
	}

	public void testSize(){
		
		BinaryTree<Comparable> tree = new BinaryTree<Comparable>();
		tree.put("H");
		tree.put("G");
		tree.put("I");
		tree.put("K");
		tree.put("A");
		tree.put("C");
		tree.put("B");
		System.out.println(tree.size());
		assertEquals(7, tree.size());
	}
	
	public void testBreadthFirstSearch(){
		BinaryTree<Comparable> tree = new BinaryTree<Comparable>();
		tree.put("H");
		tree.put("G");
		tree.put("I");
		tree.put("K");
		tree.put("A");
		tree.put("C");
		tree.put("B");
		
		assertEquals("A", tree.breadthFirstSearch("A"));
	}
	
	public void testGetHeight(){
		BinaryTree<Comparable> tree = new BinaryTree<Comparable>();
		tree.put(30);
		tree.put(20);
		tree.put(40);
		tree.put(10);
		tree.put(5);
		tree.put(12);
		tree.put(11);
		tree.put(13);
		tree.put(17);
		tree.put(14);
		tree.put(18);
		tree.put(21);
		tree.put(22);
		tree.put(35);
		tree.put(44);
		tree.put(42);
		tree.put(41);
		tree.put(43);
		tree.put(47);
		tree.put(45);
		tree.put(49);
		System.out.println(tree.getHeight());
	}
}
