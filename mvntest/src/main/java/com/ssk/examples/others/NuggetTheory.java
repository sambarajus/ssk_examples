/**
 * 
 */
package com.ssk.examples.others;

/**
 * @author shravans
 *
 */
public class NuggetTheory {

	//define a static array of allowed sizes..
	static int[] sizes = {6,9,20};
	static int[] combos = {0,0,0};

	// This is based on GreedyAlgorithm http://mathworld.wolfram.com/GreedyAlgorithm.html
	/** 
	 * @param n
	 * @return
	 */
	
	public static boolean isSellable(int n){
		for (int i = 0;i<sizes.length;i++){
			int c = n/sizes[i];
			combos[i]=c;
			if(c*sizes[i]!=0){
				int diff = n-c*sizes[i];
				for (int j = 0;j<i;j++){
					int cj = diff/sizes[j];
					combos[j]=cj;
				}
			}
		}
		int sum = 0;
		for (int i = 0; i < combos.length; i++) {
			sum = sum+sizes[i]*combos[i];
		}
		if(sum==n)
			return true;
		return false;
	}

	public static void main(String[] args){
		System.out.println(isSellable(15));
		printCombinations(sizes,combos);
	}
	private static void printCombinations(int[] a,int[] b){
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" * "+b[i]+", ");
		}
	}
}
