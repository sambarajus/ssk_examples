package com.ssk.samples.mvntest;

public class MatrixTest {

	public static void main(String args[]) {
		int a[][] = { { 1, 2, 0, 4 }, { 5, 6, 7, 8 }, { 9, 0, 11, 12 },
				{ 13, 14, 15, 16 } };
		printArray(a);
		// setZeroMxNWithOneZero(a);

		setZeroMxN(a);
		printArray(a);
	}

	public static void setZeroMxNWithOneZero(int a[][]) {
		int rowIndex = 0;
		int colIndex = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] == 0) {
					rowIndex = i;
					colIndex = j;
				}
			}
		}

		for (int col = 0; col < a[rowIndex].length; col++) {
			a[rowIndex][col] = 0;
		}
		for (int row = 0; row < a.length; row++) {
			a[row][colIndex] = 0;
		}
	}

	public static void setZeroMxN(int a[][]) {
		boolean[] rowIndex = new boolean[a.length];
		boolean[] colIndex = new boolean[a[0].length];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] == 0) {
					rowIndex[i] = true;
					colIndex[j] = true;
				}
			}
		}
		for (int i = 0; i < rowIndex.length; i++) {
			if (rowIndex[i]) {
				for (int col = 0; col < a[i].length; col++) {
					a[i][col] = 0;
				}
			}

		}
		for (int i = 0; i < colIndex.length; i++) {
			if (colIndex[i]) {
				for (int row = 0; row < a.length; row++) {
					a[row][i] = 0;
				}
			}
		}
	}

	public static void printArray(int a[][]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print((a[i][j]) + " ");
			}
			System.out.println();
		}

	}
}
