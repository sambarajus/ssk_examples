package com.ssk.samples.mvntest;

import com.ssk.samples.mvntest.ds.stack.LinkedStack;

import junit.framework.TestCase;

public class LinkedStackTest extends TestCase {

	public void testClear() {
		LinkedStack<String> stack = new LinkedStack<String>(10);
		stack.push("Hello");
		stack.push("Shravan");
		stack.clear();
		assertNull(stack.topValue());
	}

	public void testPush() {
//		fail("Not yet implemented");
		LinkedStack<String> stack = new LinkedStack<String>(10);
		assertNull(stack.pop());
		stack.push("Hello");
		assertNotNull(stack.pop());
	}

	public void testPop() {
		LinkedStack<String> stack = new LinkedStack<String>(10);
		stack.push("Hello");
		stack.push("Shravan");
		assertEquals("Shravan", stack.pop());
		assertEquals("Hello", stack.pop());
//		fail("Not yet implemented");
	}

	public void testTopValue() {
		LinkedStack<String> stack = new LinkedStack<String>(10);
		stack.push("Hello");
		stack.push("Shravan");
		assertEquals("Shravan", stack.topValue());
	}

	public void testLength() {
		LinkedStack<String> stack = new LinkedStack<String>(10);
		stack.push("Hello");
		stack.push("Shravan");
		assertEquals(2, stack.length());
	}

	/*public void testMaxSize(){
		LinkedStack<String> stack = new LinkedStack<String>(10);
		for(int i=0;i<15;i++){
			stack.push("Hello"+i);
		}
		
		while(stack.topValue()!=null){
			System.out.println(stack.pop());
		}
		
	}*/
}
