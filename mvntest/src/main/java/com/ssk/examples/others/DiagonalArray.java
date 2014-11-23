/**
 * 
 */
package com.ssk.examples.others;

/**
 * @author sskumar
 *
 *Given an array of numbers print the values in diagonal format. 
	Example (1) for 8 dataset 
	Input Array : [1, 2, 3,4,5,6,7,8] 
	Output 
	01 02 04 07 
	03 05 08 
	06 
 */
public class DiagonalArray {
	
	public void diagonalArray(){
		int arr[] = {1,2,3,4,5,6,7,8};
		int i = 0;
		int row = 1;
		int n = row -1;
		int max = 45;
		
		while(i<max){
		int cell = (n*(n+1)/2)+row;	
			if(cell>max){
				row++;
				n = row-1;
				System.out.println();
			}else{
				System.out.print(cell+" ");
				i++;
				n++;
			}
		}
		
		
	}
	
	public static void printIt(int[] cs) {
		int start = 0, cur = 0;
		int len = cs.length;
		for (int i = 0; i + start <= len; i++) {
			start += i;
			cur = start;
			for (int j = i; j + cur <= len; j++) {
				cur = cur + j;
				if(cur< len)
				System.out.print("[" + cs[cur] + "]");
			}
			System.out.println();
		}
	}
	public static void main(String args[]){
		DiagonalArray test = new  DiagonalArray();
		test.diagonalArray();
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45};
		printIt(arr);
	}
}
