package com.ssk.samples.mvntest.ds.queue;

public class MyQueue<K> {

	Node<K> first;
	Node<K>  last;
	public int size;

	/**
	 * 
	 * An Inner class used to store Queue elements.
	 *
	 */
	private class Node<K>{
		Node<K> next;
		K data;
		
		Node(K data){
			this.data = data;
		}
	}
	public void enqueue(K data){
		Node<K> x = new Node<K>(data);
		
		if(isEmpty()){
			first = x;
			last = x;
		}else{
			last.next = x;
			last = x;
		}
		size++;
	}
	
	public K dequeue(){
		if(!isEmpty()){
			K data = first.data;
			first = first.next;
			return data;
		}
		return null;
	}
	
	public boolean isEmpty(){
		if(first==null || last==null) 
			return true;
		else
			return false;
	}

	public void clear(){
		first = null;
		last = null;
		
	}
}
