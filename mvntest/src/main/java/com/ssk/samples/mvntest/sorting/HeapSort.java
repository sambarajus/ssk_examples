package com.ssk.samples.mvntest.sorting;

public class HeapSort {

	
	public static void sort(int[] a){
		int length= a.length-1;
		for (int i = length/2; i >= 0; i--)
			heapify(a,i);
//		heapSort(a);
		printArray(a);
		for(int j = length; j>0; j--){
			swap(a,j,0);
			length = length-1;
			heapify(a, 0);
		}
	}
	
	public static void heapify(int[] a, int i){
		
		int left = 2*i;
		int right = 2*i+1;
		int max = i;
		
		if(left<=a.length-1 && a[left]>a[max])
			max = left;
		
		if(right<=a.length-1 && a[right]>a[max])
			max = right;
		
		/*if((right<=a.length-1 && left<=a.length-1) && a[right]>a[left]){
			swap(a,right,left);
			max = left;
		}*/
		if(max!=i){
			swap(a,i,max);
			heapify(a, max);
		}
			
		
	}
	
	private static void swap(int[] a, int source, int target){
		int temp = a[target];
		a[target] = a[source];
		a[source] = temp;
	}
	
	public static void printArray(int a[]){
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String args[]){
		int a[] = {4,3,6,3,2,5,8,1,9};
		printArray(a);
		sort(a);
		printArray(a);
	}
	
	public static void heapSort(int[] array)
	{
		for (int heapsize = array.length; heapsize > 0;) {
			swap(array, 0, --heapsize); // swap root with the last heap
												// element
			int n = 0; // index of the element being moved down the tree
			while (true) {
				int left = (n * 2) + 1;
				if (left >= heapsize) // node has no left child
					break; // reached the bottom; heap is heapified
				int right = left + 1;
				if (right >= heapsize) { // node has a left child, but no right
											// child
					if (array[left] > array[n]) // if left child is greater than
												// node
						swap(array, left, n); // swap left child with node
					break; // heap is heapified
				}
				if (array[left] > array[n]) { // (left > n)
					if (array[left] > array[right]) { // (left > right) & (left
														// > n)
						swap(array, left, n);
						n = left;
						continue; // continue recursion on left child
					} else { // (right > left > n)
						swap(array, right, n);
						n = right;
						continue; // continue recursion on right child
					}
				} else { // (n > left)
					if (array[right] > array[n]) { // (right > n > left)
						swap(array, right, n);
						n = right;
						continue; // continue recursion on right child
					} else { // (n > left) & (n > right)
						break; // node is greater than both children, so it's
								// heapified
					}
				}
			}
		}
	}
}
