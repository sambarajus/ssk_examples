/**
 * 
 */
package com.ssk.samples.mvntest.ds.heap;


/**
 * @author shravans
 *
 */
public class MaxHeap {

	int[] heap = null;
	private int size = 0;
	private static final int default_size = 2;
	public MaxHeap(){
		heap = new int[default_size];
		
	}
	public MaxHeap(int a[]){
		heap = new int[a.length+1];
		size = a.length;
		//copy array elements to heap
		for (int i = 0; i < a.length; i++) {
			heap[i+1] = a[i];
		}
		//or use System.array copy..
		buildHeap();
	}
	
	public void buildHeap(){
	
		for (int k = size/2; k >0; k--) {
			maxHeapify(k);
		}
	}
	//WikiPedia pseudo code.. needs correction
	/*private void maxHeapify(int k){
		int left = (2*k)+1;
		int right = (2*k)+2;
		int largest = k;
		if(left<size && heap[left]>heap[largest])
			largest = left;
		if(right<size && heap[right]>heap[largest])
			largest = right;
		
		if(largest!=k){
			int temp = heap[k];
			heap[k] = heap[largest];
			heap[largest] = temp;
			maxHeapify(largest);
		}
	}*/
	
	private void maxHeapify(int k){
		int temp = heap[k];
		int child ;
		for(;2*k<=size;k=child){
			child = 2*k;
			if(child!=size && heap[child+1]>heap[child])
				child ++;
			
			if(temp<heap[child])
				heap[k] = heap[child];
			else
				break;
		}
		heap[k] = temp;
	}
	
	
	
	public static void main(String[] arg){
		
		int a[] = {5,3,2,4,6,7,1,0};
		MaxHeap heap = new MaxHeap(a);
		System.out.println(heap);
	}
}
