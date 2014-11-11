package com.ssk.examples.cch1;
/**
 * 
 * @author shravans
 *Question 1.5 in Cracking Coding Interview : compress String aabcccccaaa to a2b1c5a3.
 */
public class StringCompression {

	
	public static void compressString(String str){
		char[] strArr =  str.toCharArray();
		char last = strArr[0];
		int count = 1;
		char[] compressArr = new char[compressCount(strArr)];
		for(int i=1,j=0; i<strArr.length && j<compressArr.length;i++){
			if(strArr[i]==last){
				count++;
			}else{
				compressArr[j] = last;
				j++;
				compressArr[j]=String.valueOf(count).charAt(0);
				j++;
				last = strArr[i];
				count = 1;
			}
		
			if(i==strArr.length-1){
				compressArr[j] = last;
				j++;
				compressArr[j]=String.valueOf(count).charAt(0);
			}
		}
		
		
		System.out.println(compressArr);
		
	}
	private static int compressCount(char[] arr){
		int last = arr[0];
		int count = 1;
		int size = 0;
		for(int i=1; i<arr.length;i++){
			if(arr[i]==last){
				count++;
			}else{
				last = arr[i];
				size+=1+String.valueOf(count).length();
				count = 1;
			}
		}
		size+=1+String.valueOf(count).length();

		System.out.println(size);
		return size;
	}
	
	public static void main(String args[]){
		compressString("aabcccccdddaaa");
		int i = compressCount("aabcccccdddaaa".toCharArray());
		System.out.println("Size"+i);
	}
}
