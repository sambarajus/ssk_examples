package com.ssk.samples.mvntest.sorting;

public class QuickSort {

	/**
	 * @param args
	 */
	
	public int[] x = { 20, 15, 12, 30, -5, 72, 456 };
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		QuickSort sort = new QuickSort();
		for (int i = 0; i < sort.x.length; i++) {
			System.out.print(sort.x[i]+" ");
			
		}
		System.out.println();
		sort.quickSort(0, sort.x.length-1);
		for (int i = 0; i < sort.x.length; i++) {
			System.out.print(sort.x[i]+" ");
		}
	}

	public void quickSort(int lowIndex, int highIndex){
		int i=lowIndex;
		int j = highIndex;
		System.out.println(i+", "+j);
		int pivot =x[lowIndex+(highIndex-lowIndex)/2];
		System.out.println(pivot);
		while (i<=j){
			
			while(x[i]<pivot){
				i++;
			}
			
			while (x[j]>pivot){
				j--;
			}
			// swap values...
			System.out.println("swap values..."+x[i]+","+x[j]);
			int temp = x[i];
		    x[i] = x[j];
		    x[j] = temp;
		    i++;
		    j--;
		    
		}
		
		if(lowIndex<j){
	    	quickSort(lowIndex, j);
	    }
	    if(i<highIndex){
	    	quickSort(i, highIndex);
	    }
		
	}
}
