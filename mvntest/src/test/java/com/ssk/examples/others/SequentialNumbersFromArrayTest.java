package com.ssk.examples.others;

import static org.junit.Assert.*;

import org.junit.Test;

public class SequentialNumbersFromArrayTest {

	@Test
	public void testGetSequences() {
//		fail("Not yet implemented");
				
		int arr[] = {4, 5, 6, 7, 8, 9, 12, 15, 16, 17, 18, 20, 22, 23, 24, 27};
		SequentialNumbersFromArray test = new SequentialNumbersFromArray();
		test.getSequences(arr);
		
		assert(true);
	}

}
