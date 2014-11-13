package com.ssk.samples.mvntest.ds.tree.example;

import com.ssk.samples.mvntest.ds.queue.MyQueue;
import com.ssk.samples.mvntest.ds.stack.LinkedStack;

public class BinaryTree<K extends Comparable> {

	Node<K> root;

	public void setRoot(K data) {
		if (root == null) {
			root = new Node<K>(data);
		}
	}

	public K getRoot() {
		if (root != null)
			return root.data;
		else
			return null;
	}

	public void put(K data) {
		root = put(root, data);
	}

	private Node<K> put(Node<K> node, K data) {
		if (node == null)
			node = new Node<K>(data);

		int comp = data.compareTo(node.data);
		if (comp < 0)
			node.left = put(node.left, data);
		else if (comp > 0)
			node.right = put(node.right, data);
		else
			node.data = data;

		node.N = 1 + size(node.left) + size(node.right);
		return node;
	}

	public int size() {
		return size(root);
	}

	private int size(Node node) {
		if (node == null) {
			return 0;
		} else {
			return node.N;
		}
	}

	public K breadthFirstSearch(K data) {
		if (root == null) {

		}
		MyQueue<Node> queue = new MyQueue<Node>();
		queue.enqueue(root);
		while (!queue.isEmpty()) {
			Node node = queue.dequeue();
			if (data.equals(node.data)) {
				return data;
			}
			System.out.println(node.data);
			if (node.left != null)
				queue.enqueue(node.left);
			if (node.right != null)
				queue.enqueue(node.right);
		}

		return null;
	}

	public K deapthFirstSearch() {

		LinkedStack<K> stack = new LinkedStack<K>();

		stack.push(root.data);
		Node<K> left = root.left;
		Node<K> right = root.right;
		while (left != null) {
			stack.push(left.data);
		}
		return null;
	}

	public int getHeight() {
		LinkedStack<Node> nodes = new LinkedStack<Node>();
		LinkedStack<Integer> levels = new LinkedStack<Integer>();
		
		nodes.push(root);
		levels.push(0);
		int maxLevel = 0;
		while(!nodes.isEmpty()){
			Node node = nodes.pop();
			int currentLevel = levels.pop();
			if(node.left!=null){
				nodes.push(node.left);
				levels.push(currentLevel + 1);  
			}
			if(node.right!=null){
				nodes.push(node.right);
				levels.push(currentLevel + 1);  
			}
			if(currentLevel>maxLevel)
				maxLevel = currentLevel;
		}
		return maxLevel;
	}

	private class Node<K extends Comparable> {
		K data;
		Node<K> left;
		Node<K> right;
		int N = 0; // Number of Nodes

		public Node(K data) {
			this.data = data;
		}
	}

	public static void main(String args[]) {
		BinaryTree<Comparable> tree = new BinaryTree<Comparable>();
		tree.put("H");
		tree.put("G");
		tree.put("I");
		tree.put("K");
		tree.put("A");
		tree.put("C");
		tree.put("B");
		tree.breadthFirstSearch("A");
		System.out.println(tree.getHeight());
		
	}
}
