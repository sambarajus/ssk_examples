/**
 * 
 */
package com.ssk.samples.mvntest.ds.heap;


/**
 * @author shravans
 *
 */
public class MinHeap {

	int[] heap = null;
	private int size = 0;
	private static final int default_size = 2;
	public MinHeap(){
		heap = new int[default_size];
		
	}
	public int getSize(){
		return size;
	}
	
	public MinHeap(int a[]){
		heap = new int[a.length+1];
		size = a.length;
		//copy array elements to heap
		for (int i = 0; i < a.length; i++) {
			heap[i+1] = a[i];
		}
		//or use System.array copy..
		System.out.println("Before building heap.."+toString());
		
		buildHeap();
	}
	
	public void buildHeap(){
	
		for (int k = (size)/2; k >0; k--) {
			minHeapify(k);
		}
	}
	//WikiPedia pseudo code.. needs correction
	private void minHeapify(int k){
		int left = (2*k);
		int right = (2*k)+1;
		int smallest = k;
		if(left<size && heap[left]<heap[smallest])
			smallest = left;
		if(right<=size && heap[right]<heap[smallest])
			smallest = right;
		
		if(smallest!=k){
			int temp = heap[k];
			heap[k] = heap[smallest];
			heap[smallest] = temp;
			minHeapify(smallest);
		}
	}
	
	/*private void minHeapify(int k){
		int temp = heap[k];
		int child ;
		for(;2*k<=size;k=child){
			child = 2*k;
			if(child!=size && heap[child+1]<heap[child])
				child ++;
			
			if(temp>heap[child])
				heap[k] = heap[child];
			else
				break;
		}
		heap[k] = temp;
	}*/
	
	
	public void insert(int x){
		if(size==heap.length-1) increaseHeapSize();
		
		int pos = ++size;
		System.out.println("MinHeap.insert()  "+x);
		for(;pos>1 && x<heap[pos/2];pos = pos/2)
		{
			heap[pos] = heap[pos/2];
			toString();
		}
			
		heap[pos]=x;
	}
	
	public int delete(){
	
		if(size==0)
		System.out.println("Heap is empty..");
		
		int val = heap[1];
		heap[1] = heap[size--];
		minHeapify(1);
//		size--;
		return val;
	}
	
	private void increaseHeapSize(){
		 int [] old = heap;
	      heap = new int[heap.length * 2];
	      System.arraycopy(old, 1, heap, 1, size); 
	}
	
	public String toString(){
		System.out.println();
		for (int i = 0; i <size; i++) {
			System.out.print(heap[i+1]+" ");
		}
		System.out.println();
		return null;
	}
	
	public static void main(String[] arg){
		
		int a[] = {15,13,12,14,11};
		MinHeap heap = new MinHeap(a);
		heap.toString();
//		heap.insert(25);
		heap.toString();
//		heap.insert(20);
//		heap.toString();
		System.out.println(heap.delete());
		System.out.println(heap.delete());
		System.out.println(heap.delete());
		System.out.println(heap.delete());
		System.out.println(heap.delete());
//		heap.toString();
//		heap.delete();
//		heap.toString();
	}
}
