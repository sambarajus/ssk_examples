package com.ssk.samples.mvntest.ds.tree;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author sskumar
 *
 */
public class TreeNode<K extends Comparable> {
	K data;
	List<TreeNode<K>> childNodes;
	TreeNode<K> parent;
	private int N;
	public TreeNode(K data){
		this.data = data;
	}
	/**
	 * 
	 * @param node
	 */
	public void addChild(TreeNode<K> node){
		node.parent = this;
		if(childNodes==null){
			childNodes = new ArrayList<TreeNode<K>>();
		}
		childNodes.add(node);
		N++;
	}

	/**
	 * 
	 * @param node
	 * @param cascade
	 */
	public void remove(TreeNode<K> node, boolean cascade){
		//TODO return if not removed, remove child from it's parent if cascade is false, remove entire tree if cascade is true..
	}
	/**
	 * 
	 * @return
	 */
	public TreeNode<K> getFirstChild(){
		if(childNodes!=null && childNodes.size()>0)
			return childNodes.get(0);
		else
			return null;
	}
	public TreeNode<K> getNextSibling(){
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
