package com.ssk.samples.mvntest.sorting;

public class InsertionSort {
	
	public static void main(String args[]){
		int a[] = {3,2,4,6,1};
		InsertionSort t = new InsertionSort();
		t.printArray(a);
		t.printArray(t.sortArray(a));
	}
	
	public void printArray(int a[]){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+", ");
		}
		System.out.println();
	}
	
	public int[] sortArray(int a[]){
		
		int i; // index for unsorted array elements
		int j; // Sub Array index for sorted elements.
		int key; // to be compared with array elements
		
		for (j=1;j<a.length;j++){
			key = a[j];
//			System.out.println("j : "+j+" Key Value : "+key);
			for (i=j-1;(i>=0 && a[i]>key);i--){
				a[i+1] = a[i];
//				System.out.println("Array in inner Loop : ");
				
			}
			a[i+1] = key;
			printArray(a);
		}
		
		return a;
	}

}
