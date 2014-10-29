package com.ssk.samples.mvntest.ds.tree;

import java.util.List;

import com.ssk.samples.mvntest.ds.queue.MyQueue;
import com.ssk.samples.mvntest.ds.stack.LinkedStack;
import com.ssk.samples.mvntest.ds.tree.TreeNode;
/**
 * 
 * @author shravans
 *
 */
public class TreeUtil<K extends Comparable> {

	/**
	 * 
	 * @param root
	 * @return
	 */
	public TreeNode<K> breadthFirstSearch(TreeNode<K> root) {

		MyQueue<TreeNode<K>> queue = new MyQueue<TreeNode<K>>();
		queue.enqueue(root);
		int count = 0;
		while (!queue.isEmpty()) {
			TreeNode<K> node = queue.dequeue();
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

	public boolean depthFirstSearch(TreeNode<K> root, K value,
			LinkedStack<K> stack) {
		if (root == null) {
			return false;
		}
		System.out.println("Push : " + root.data);
		stack.push(root.data);
		List<TreeNode<K>> children = root.childNodes;
		if (root.isLeaf()) {
			if (root.data.compareTo(value)==0) {
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
}
