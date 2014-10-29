package com.ssk.samples.mvntest;

public class ArrayTest {

	public static void main(String args[]){
		ArrayTest t = new ArrayTest();
		int a[] = {1,2,3,5,7,9};
		int b[] = {0,1,6,7,8,9};
		int c[] = t.getCommonValues(a, b);

		for(int i=0;i<c.length;i++){
			System.out.print(c[i]+", ");
		}
	}
	public int[] getCommonValues(int[] a, int b[]){
		int[] c = new int[a.length];
		int i=0;
		int j=0;
		int k=0;
		while (i<a.length && j <b.length){
			System.out.println("i : "+i+" , j :"+j);
			if(b[j]==a[i]){
				c[k] = a[i];
				k++;
				i++;
				j++;
			}else if(b[j]<a[i]){
				j++;
			}else if(b[j]>a[i]){
				i++;
			}
		}
		
		return c;
	}
	
}
