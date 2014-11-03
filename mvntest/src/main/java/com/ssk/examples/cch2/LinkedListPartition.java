package com.ssk.examples.cch2;

import com.ssk.samples.mvntest.linkedlist.LinkedList;

public class LinkedListPartition {

	public static void main(String args[]){
//		partition(4);
		sumOfInts();
	}
	

	public static void partition(int x){
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.addNode(7);
		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.addNode(4);
		list.addNode(5);
		list.addNode(6);
		list.addNode(4);
//		list.partition(x);
		list.splitPartition(4);
	}
	
	public static void sumOfInts(){
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		l1.addNode(7);
		l1.addNode(1);
		l1.addNode(6);
		
		LinkedList<Integer> l2 = new LinkedList<Integer>();
		l2.addNode(5);
		l2.addNode(9);
		l2.addNode(2);
		l2.sumofIntsReverseOrder(l1,  l2);
	}
	
	
}
