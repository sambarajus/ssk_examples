package com.ssk.samples.mvntest.ds.tree.example;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author sskumar
 *
 */
public class TreeNode {
	char data;
	List<TreeNode> childNodes;
	TreeNode parent;
	private int N;
	public TreeNode(char data){
		this.data = data;
	}
	/**
	 * 
	 * @param node
	 */
	public void addChild(TreeNode node){
		node.parent = this;
		if(childNodes==null){
			childNodes = new ArrayList<TreeNode>();
		}
		childNodes.add(node);
		N++;
	}

	/**
	 * 
	 * @param leafNode
	 * @param parent
	 */
	public void addChild(TreeNode leafNode, TreeNode parent){
		//TODO find the parent and add invoke parent.addChild...
	}
	
	/**
	 * 
	 * @param node
	 * @param cascade
	 */
	public void remove(TreeNode node, boolean cascade){
		//TODO return if not removed, remove child from it's parent if cascade is false, remove entire tree if cascade is true..
	}
	
	/**
	 * 
	 * @return
	 */
	public TreeNode getFirstChild(){
		if(childNodes!=null && childNodes.size()>0)
			return childNodes.get(0);
		else
			return null;
	}
	
	public TreeNode getNextSibling(){
		
		
		return null;
	}
	
	/**
	 * To determine if Node is a leaf node or tree node....
	 * @return
	 */
	public boolean isLeaf(){
		if(childNodes==null || childNodes.size()==0){
			return true;
		}else{
			return false;
		}
	}
}
