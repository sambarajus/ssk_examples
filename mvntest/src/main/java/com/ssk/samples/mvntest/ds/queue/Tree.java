package com.ssk.samples.mvntest.ds.queue;

import java.util.List;

public class Tree<K extends Comparable> {

	Node<K> node;
	public Tree(){
		
	}
	private Tree(Node<K> node){
		this.node = node;
	}
	public void setRootNode(K data) throws UnsupportedOperationException{
		if(node==null){
			node = new Node<K>();
			node.data = data;
		}else{
			throw new UnsupportedOperationException(" Tree has aleady root node, addChild instead to expand.");
		}
	}
	public void addChild(K parent,K child) throws UnsupportedOperationException{
		
		if(node==null){
			throw new UnsupportedOperationException(" Tree does not have root node.");
		}else{
			
		}
	}
	
	public Tree<K> findNode(K data){
		//TODO implement find ...

		return new Tree();
	}
	
	private class Node<K> {
		K data;
		List<K> children;

		public boolean isLeaf() {
			return children != null && children.size() != 0;
		}
	}
}
