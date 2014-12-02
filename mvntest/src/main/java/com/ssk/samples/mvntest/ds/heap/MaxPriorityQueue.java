/**
 * 
 */
package com.ssk.samples.mvntest.ds.heap;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * @author shravans
 *
 */
public class MaxPriorityQueue<K> implements Comparator<K>{

	K[] heap;
	int size = 0;
	private static final int DEFAULT_SIZE = 2;

	public MaxPriorityQueue() {
		size = DEFAULT_SIZE;
		heap = (K[]) new Object[DEFAULT_SIZE + 1];
	}

	public MaxPriorityQueue(K[] array) {
		size = array.length;
		heap = (K[]) new Object[array.length + 1];
	}

	public MaxPriorityQueue(Collection<K> c) {
		size = c.size();
//		heap = Array.newInstance(<K>, c.size()+1);
//		heap = createHeapArray(Class.forName(K), c.size()+1);
		heap = (K[]) new Object[c.size() + 1];
		int i = 1;
		for (Iterator iterator = c.iterator(); iterator.hasNext();) {
			K k = (K) iterator.next();
			heap[i] = k;	
			i++;
		}
		buildHeap(c);
	}
	
	private void buildHeap(Collection<K> c){
		for (int k = size/2; k >0; k--) {
			maxHeapify(k);
		}
	}
	
	private K[] createHeapArray(Class<K> type, int size){
		return (K[])Array.newInstance(type, size);
	}
	private void maxHeapify(int k){
		int left = 2*k;
		int right = (2*k)+1;
		int largest = k;
		
		if(left<size && compare(heap[left],heap[largest])<0)
			largest = left;
		if(right<=size && compare(heap[right],heap[largest])<0)
			largest = right;
		
		if(largest!=k){
			K temp = heap[k];
			heap[k] = heap[largest];
			heap[largest] = temp;
			maxHeapify(largest);
		}
		
	}

	public String toString(){
		System.out.println();
		for (int i = 0; i <size; i++) {
			System.out.print(heap[i+1]+" ");
		}
		System.out.println();
		return null;
	}
	
	
	public static void main(String[] args){
		List<String> list =  new ArrayList<String>();
		list.add("ant");
		list.add("basket");
		list.add("bat");
		list.add("apple");
		list.add("animal");
		
		MaxPriorityQueue<String> queue = new MaxPriorityQueue<String>(list);
		queue.toString();
	}

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	public int compare(K o1, K o2) {
		// TODO Auto-generated method stub
		return ((Comparable)o1).compareTo( o2 );
	}
}
