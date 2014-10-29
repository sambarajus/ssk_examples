package com.ssk.samples.mvntest.ds.tree.example;

import java.util.List;

import com.ssk.samples.mvntest.ds.queue.MyQueue;
import com.ssk.samples.mvntest.ds.stack.LinkedStack;

public class Tree {

	TreeNode root;

	/**
	 * 
	 * @param node
	 */
	public static void preOrderTraversal(TreeNode node) {
		// Root -->Left --> Right
		System.out.println(node.data);
		if (!node.isLeaf()) {
			for (int i = 0; i < node.childNodes.size(); i++) {
				preOrderTraversal(node.childNodes.get(i));
			}
		}
	}

	/**
	 * 
	 * @param node
	 */
	public static void postOrderTraversal(TreeNode node) {
		// Left--> Right-->Root

		if (!node.isLeaf()) {
			for (int i = 0; i < node.childNodes.size(); i++) {
				postOrderTraversal(node.childNodes.get(i));
			}
		}
		System.out.println(node.data);
	}

	/**
	 * 
	 * @param node
	 */
	public void inOrderTraversal(TreeNode node) {

	}

	/**
	 * 
	 */
	public static TreeNode breadthFirstSearch(TreeNode root) {

		MyQueue<TreeNode> queue = new MyQueue<TreeNode>();
		queue.enqueue(root);
		int count = 0;
		while (!queue.isEmpty()) {
			TreeNode node = queue.dequeue();
			count++;
			System.out.println(node.data);
			if (!node.isLeaf()) {
				for (int i = 0; i < node.childNodes.size(); i++) {
					queue.enqueue(node.childNodes.get(i));
					count++;
				}
			}
		}
		System.out.println(count);
		return null;
	}

	/**
	 * 
	 * @param root
	 * @return
	 */

	public static void testDFS(TreeNode root) {
		LinkedStack<Character> stack = new LinkedStack<Character>();
		depthFirstSearch(root, 'F', stack);
		System.out.println("Path...");
		while (stack.topValue() != null) {
			System.out.println(stack.pop());
		}
	}

	public static boolean depthFirstSearch(TreeNode root, char value,
			LinkedStack<Character> stack) {
		if (root == null) {
			return false;
		}
		System.out.println("Push : " + root.data);
		stack.push(root.data);
		List<TreeNode> children = root.childNodes;
		if (root.isLeaf()) {
			if (root.data == value) {
				return true;
			}
		} else if (root.childNodes != null) {
			int i = 0;
			boolean flag = false;
			while (i < children.size() && !flag) {
				flag = depthFirstSearch(children.get(i), value, stack);
				if (flag == false)
					System.out.println("Pop ::" + stack.pop());
				i++;
			}
			return flag;
		}
		return false;
	}

	public static boolean searchNode(TreeNode node, char value) {
		System.out.println(node.data);// BFS

		if (!node.isLeaf()) {
			System.out.println("Searching Child nodes of " + node.data);
			for (int i = 0; i < node.childNodes.size(); i++) {
				if (searchNode(node.childNodes.get(i), value)) {
					System.out.println(node.data);
					return true;
				}
			}
		}

		/*
		 * if(node.data==value){ System.out.println(node.data); return true; }
		 */

		// System.out.println(node.data);//DFS
		return false;
	}

	public static void testTree() {
		TreeNode root = new TreeNode('R');

		TreeNode a = new TreeNode('A');
		TreeNode b = new TreeNode('B');
		TreeNode c = new TreeNode('C');
		TreeNode d = new TreeNode('D');
		TreeNode e = new TreeNode('E');
		TreeNode f = new TreeNode('F');
		root.addChild(a);
		a.addChild(c);
		a.addChild(d);
		a.addChild(e);
		root.addChild(b);
		b.addChild(f);

		// preOrderTraversal(root);
		// postOrderTraversal(root);
		// searchNode(root, 'C');
		// breadthFirstSearch(root);
		testDFS(root);
	}

	public static void main(String args[]) {
		testTree();
	}

	/*
	 * public void traverse( TreeNode rootNode ) {
	 * 
	 * // ignore root -- root acts as a container Node
	 * node=rootNode.getFirstChild();
	 * 
	 * while (node!=null) { // print node information System.out.println(
	 * node.getNodeName()+"="+node.getNodeValue());
	 * 
	 * if ( node.hasChildNodes()) { node = node.getFirstChild(); } else { //
	 * leaf // find the parent level while (node.getNextSibling()==null && node
	 * != rootNode) // use child-parent link to get to the parent level
	 * node=node.getParentNode();
	 * 
	 * node = node.getNextSibling(); } } }
	 */
}
