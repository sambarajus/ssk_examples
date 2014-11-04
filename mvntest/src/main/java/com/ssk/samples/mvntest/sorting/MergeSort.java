package com.ssk.samples.mvntest.sorting;

/**
 * 
 * @author sskumar
 *
 *	MergeSort is divide and concur algorithm
 *	Divides the collection into smaller sets to sort.
 *	Recursively sorts the smaller sets.
 *	Complexity is O(n log n)
 *	
 *	Step1: Calculate the middle index of the collection and split into two sets of collection.
 *	Step2: Recursively split into sets to least possible (0,1)
 *	Step3: Compare and Merge values.
 *
 */

public class MergeSort {

	int[] temp;

	public int[] sort(int[] a) {
		temp = new int[a.length];
		mergeSort(a, 0, a.length-1);
		return a;
	}

	public void mergeSort(int[] a, int low, int high) {
		int center;
		if (low < high) {
			center = low + (high - low) / 2;// calculate the center index to split into sub arrays.
			mergeSort(a, low, center); // sorting left part of the array.
			mergeSort(a, center + 1, high);// sort right part of the array.
			merge(a, low, center, high);
		}
	}

	public void merge(int[] a, int low, int middle, int high) {

		for (int i = low; i <= high; i++) {
			temp[i] = a[i];
		}

		int i = low; // counter for lower part of array
		int j = middle + 1; // counter for higher part of the array
		int k = low; // stores temp index.

		while (i <= middle && j <= high) {
			if (temp[i] <= temp[j]) {
				a[k] = temp[i];
				i++;
			} else {
				a[k] = temp[j];
				j++;
			}
			k++;
		}
		while (i <= middle) {
			a[k] = temp[i];
			k++;
			i++;
		}
	}
	
	public static void main(String[] args){
		int[] a = {10,5,2,19,35,24};
//		int[] a = {10,5};
		MergeSort sort = new MergeSort();
		sort.sort(a);
		for(int i=0;i<=a.length-1;i++)
			System.out.print(a[i]+" ");
	}

}
