/**
 * 
 */
package com.ssk.examples.others;

/**
 * @author shravans
 *
 */
public class McNuggetProblem {
	private static int sizes[] = { 6, 9, 20 };
	private static int combos[] = { 0, 0, 0 };

	public static void findCombinations(int n) {
		// find co-efficients for sizes
		int coSum = 0;
		for (int i = 0; i < sizes.length; i++) {
			int cj = n / sizes[i];
			combos[i] = cj;
			coSum = coSum + cj * sizes[i];
			if (coSum == n) {
				printCombinations();

				System.out.println("sellable....");
				return;
			}
		}
		int diff = coSum - n;
		printCombinations();
		System.out.println("coSum:" + coSum + " , diff: " + diff);

		coSum = 0;

		for (int i = 0; i < combos.length; i++) {
			if (combos[i] != 0) {
				int j = i - 1;
				while (j >= 0 && i > 0) {
					combos[j] = 0;
					j--;
				}
			} else {
				int j = i - 1;
				while (j >= 0 && i > 0) {
					combos[j] = diff / sizes[j];
					coSum = coSum + combos[j] * sizes[j];
					j--;
				}
			}
			printCombinations();
			diff = coSum - n;
			System.out.println("coSum:" + coSum + " , diff: " + diff);
		}

	}

	public static int greedySolution(int n) {
		int dp = 0;
		int number = n;
		int diff = n;
		while (diff != 0) {
			for (int i = 0; i < combos.length; i++) {
				for (int j = 0; j < i; j++) {
					combos[j] = 0;
				}
				combos[i] = number / sizes[i];
				// dp = dp+combos[i]*sizes[i];
			}
			for (int i = 0; i < combos.length; i++) {
				dp = dp + combos[i] * sizes[i];
			}
			printCombinations();
			// find dot product
			diff = n - dp;
			System.out.println(diff);
			for (int j = combos.length - 1; j >= 0; j--) {
				if (combos[j] != 0) {
					combos[j] = combos[j] - 1;
					diff = diff + sizes[j];
				} else {
					combos[j] = diff / sizes[j];
				}
			}

			dp = 0;
			for (int i = 0; i < combos.length; i++) {
				dp = dp + combos[i] * sizes[i];
			}
			diff = n - dp;
			number = diff;
			System.out.println(dp);
			printCombinations();
		}

		return 0;
	}

	private static void printCombinations() {
		System.out.println();
		for (int i = 0; i < sizes.length; i++) {
			System.out.print(sizes[i] + " * " + combos[i] + ", ");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// greedySolution(22);
		// findCombinations(62);
		System.out.println(findGcd(3,20));
	}

	public static int findGcd(int a, int b) {
		int t = 0;
		while (b != 0) {
			t = b;
			b = a % b;
			a = t;
		}

		return a;
	}
}
