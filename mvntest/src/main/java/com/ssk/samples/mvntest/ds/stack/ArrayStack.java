package com.ssk.samples.mvntest.ds.stack;

public class ArrayStack<K> implements Stack<K> {

	private int maxSize = 10;
	private int top;
	private K listArray[];
	public ArrayStack(int size){
		maxSize = size;
		top = 0;
		listArray = (K[])new Object[maxSize];
	}
	public void clear() {
		// TODO Auto-generated method stub
		top = 0;
	}

	public void push(K k) {
		// TODO Auto-generated method stub
		assert top!=maxSize : "Stack is Full.";
		listArray[top++] = k;
	}

	public K pop() {
		// TODO Auto-generated method stub
		assert top!=0 : "Stack is empty";
		return listArray[--top];
	}

	public K topValue() {
		// TODO Auto-generated method stub
		assert top!=0 : "Stack is empty";
		return listArray[top-1];
	}

	public int length() {
		// TODO Auto-generated method stub
		return top;
	}

}
