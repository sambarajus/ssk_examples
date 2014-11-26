package com.ssk.samples.mvntest;

public class StringPermutation {
	
	public static void main(String[] args){
		StringPermutation p = new StringPermutation();
		stringPermutation("ABC");
	}
	
	public static void stringPermutation(String str){
		char arr[] = str.toCharArray();
		int start = 0;
		int length = arr.length;
		
		permute(arr,start,length);
	}
	
	private static void permute(char[] arr, int start, int length){
		System.out.print("Permutation for : ");
		System.out.print(arr);
		System.out.println();
		if(start==length)
			System.out.println(arr);
		else{
			for(int j = start; j<length;j++){
				swap(arr,start,j);
				permute(arr, start+1,length);
				swap(arr,start,j);
			}
		}
		
	}

	private static  void swap (char a[], int start,int end)
	{
	    char temp = a[start];
	    a[start] = a[end];
	    a[end] = temp;
	}
}
