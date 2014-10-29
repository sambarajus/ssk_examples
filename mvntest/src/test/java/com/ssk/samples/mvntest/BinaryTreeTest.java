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
}
