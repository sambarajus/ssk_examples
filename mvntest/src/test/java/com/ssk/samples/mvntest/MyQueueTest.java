package com.ssk.samples.mvntest;

import com.ssk.samples.mvntest.ds.queue.MyQueue;

import junit.framework.TestCase;

public class MyQueueTest extends TestCase {

	public void testEnqueue() {
		MyQueue<String> queue = new MyQueue<String>();
		queue.enqueue("Hello");
		queue.enqueue("Shravan");
		assertEquals(2, queue.size);
	}

	public void testDequeue() {
		MyQueue<String> queue = new MyQueue<String>();
		queue.enqueue("Hello");
		assertEquals("Hello", queue.dequeue().toString());
	}

	public void testIsEmpty() {
		MyQueue<String> queue = new MyQueue<String>();
		assertTrue(queue.isEmpty());
		queue.enqueue("Hello");
		assertFalse(queue.isEmpty());
	}
	

}
