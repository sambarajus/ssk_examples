/**
 * 
 */
package com.ssk.examples.others;

/**
 * @author shravans
 *
 */
public class GreedyAlgo {

	private static int a[] = { 6, 9, 20 };
	private static int c[] = { 0, 0, 0 };

	public static void main(String args[]) {

		// gredyChoice(15);
		gredyChoice(35);
		// minTerm(c);

	}

	public static void gredyChoice(int n) {

		int diff = n;
		for (int i = 0; i < a.length; i++) {
			if (n >= a[i]) {
				c[i] = n / a[i];
				if (i != 0)
					c[i - 1] = 0;
			}

		}

		printCombinations();
		int cc = 0;
		while (diff != 0 && cc<4) {
			int sum = 0;
			for (int i = 0; i < a.length; i++) {
				sum = sum + c[i] * a[i];
			}
			diff = n - sum;
			System.out.println("Diff 1 : " + diff);
			boolean divisable = false;
			if (diff == 0) {
				return;
			} else {
				for (int k = 0; k < a.length; k++) {
					if (diff % a[k] == 0) {
						c[k] = diff / a[k];
						divisable = true;
					}

				}
				if (!divisable) {
					int minTerm = minTerm(c);
					c[minTerm] = c[minTerm] - 1;
					if (minTerm >= 0) {
					if (diff < n)
						diff = diff + a[minTerm];
					System.out.println("Diff 2: " + diff);
					
						for (int j = 0; j <= minTerm - 1; j++) {
							if (diff >= a[j]) {
								c[j] = diff / a[j];
								if (j != 0)
									c[j - 1] = 0;
							}

						}
					}
				}

				printCombinations();
			}
			cc++;
		}
	}

	private static void printCombinations() {
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " * " + c[i] + ", ");
		}
	}

	private static int minTerm(int[] a) {
	int minIndex = -1;
		
		for(int i = 0;i<a.length;i++){
			if(a[i]!=0){
				if (minIndex == -1){
					minIndex = i;
				}else if(a[i]<a[minIndex]){
					minIndex = i;
				}
				
			}
		}
		
		return minIndex;

	}
}
