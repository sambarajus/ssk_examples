/**
 * 
 */
package com.ssk.examples.others;

/**
 * @author sskumar
 *
 */
public class ArrayPartition {

	public static void main(String args[]){
		
		
		int[] a = {6,5,3,9,10,16,19,1,2,4,7,8};
		partitionArray(a);
		
	}
	
	public static void partitionArray(int[] a){
		int[] a1 = new int[a.length];
		int[] a2 = new int[a.length];
		int arraySum = 0;
		
		for(int i = 0;i<a.length;i++){
			arraySum = arraySum+a[i];
		}

		int j=0;
		int k=0;
		int i = 0;
		int a1Sum = 0;
		int a2Sum =0;
		while(i<a.length){
			if(a1Sum+a[i]<arraySum/2){
				a1[j] = a[i];
				a1Sum = a1Sum+a[i];
				j++;
			}else if(a2Sum+a[i]<arraySum/2){
				a2[k] = a[i];
				a2Sum = a2Sum+a[i];
				k++;
			}else{
				//TODO Implement rest of the portion////
				break;
			}
			i++;
		}
		
		//find the difference..
		System.out.println("A Sum: "+arraySum);
		System.out.println("A1 Sum: "+a1Sum);
		System.out.println(a1);
		System.out.println("A2 Sum: "+a2Sum);
		System.out.println(a2);
	}
}
