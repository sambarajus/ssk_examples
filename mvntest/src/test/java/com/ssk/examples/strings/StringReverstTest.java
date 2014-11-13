package com.ssk.examples.strings;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringReverstTest {

	@Test
	public void testReverseString() {
//		fail("Not yet implemented");
		assertEquals("hello", StringReverse.reverseString("olleh".toCharArray()));
		assertEquals("KSRS", StringReverse.reverseString("SRSK".toCharArray()));
	}

	/*@Test
	public void testReverseWordsInString(){
		assertEquals("dlrow olleh", StringReverse.revWordsInString("hello world".toCharArray()));
	}*/
	@Test
	public void testReverseOrderOfWords(){
		
//		assertEquals("5678 1234", StringReverse.reverseOrderOfWords("1234 5678"));
		assertEquals("90AB 5678 1234", StringReverse.reverseWords("1234 5678 90AB"));
	}
}
