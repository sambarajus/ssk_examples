package com.ssk.samples.mvntest.sorting;

import junit.framework.TestCase;

public class MergeSortTest extends TestCase {

	public void testMergeSort() {
		MergeSort ms = new MergeSort();
		int[] arr = new int[]{1,4,3,6,7,5,2};
		int[] sortedArr = new int[]{1,2,3,4,5,6,7};
		arr = ms.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			assertEquals(sortedArr[i], arr[i]);
		}
	}

}
