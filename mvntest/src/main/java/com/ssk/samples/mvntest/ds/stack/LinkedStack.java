/**
 * 
 */
package com.ssk.samples.mvntest.ds.stack;

/**
 * @author shravans
 *
 */
public class LinkedStack<K> implements Stack<K> {

	Link<K> top = null;
	Link<K> last = null;
	int size = 0;
	int maxSize = 10;
	public LinkedStack(int maxSize) {
		this.maxSize = maxSize;
	}
	
	public LinkedStack(){
		
	}

	public void clear() {
		top = null;
		size = 0;
	}

	public void push(K k) {
		assert size<maxSize : "Stack is Full.";
		top = new Link<K>(k,top);
		size++;
	}

	public K pop() {
		// TODO Auto-generated method stub
		K data = null;
		if(top!=null){
			data = top.data;
			top = top.next;
			size--;
		}
		return data;
	}

	public K topValue() {
		// TODO Auto-generated method stub
		if(top!=null)
			return top.data;
		
		return null;
	}

	public int length() {
		// TODO Auto-generated method stub
		return size;
	}
	
	public boolean isEmpty(){
		return size==0;
	}

	private class Link<K> {
		public Link<K> next;
		public K data;
		public Link(K k,Link<K> nextVal) {
			// TODO Auto-generated constructor stub
			data = k;
			next = nextVal;
		}
	}
}
