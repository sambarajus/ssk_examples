/**
 * 
 */
package com.ssk.examples.others;

import com.ssk.samples.mvntest.ds.stack.LinkedStack;
import com.ssk.samples.mvntest.ds.tree.TreeNode;

/**
 * @author sskumar
 *
 */
public class FindSumOfLeafPaths {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int findSum(TreeNode<Integer> node)
	{
	
		int[] parents = new int[10];
		boolean[] marked = new boolean[10];
		LinkedStack<TreeNode> stack = new LinkedStack<TreeNode>();
		stack.push(node);
		while(!stack.isEmpty()){
			
		}
		
		
		
		
		return 0;
	}

}
