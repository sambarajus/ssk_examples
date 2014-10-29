/**
 * 
 */
package com.ssk.samples.mvntest.ds.stack;

/**
 * @author shravans
 *
 */
public interface Stack<K> {
	/**
	 * Clears stack
	 */
	public void clear();

	/**
	 * Inserting element into Stack
	 * 
	 * @param k
	 */
	public void push(K k);

	/**
	 * Retrieving element from Stack
	 * @return
	 */
	public K pop();

	/**
	 * Retrieve a copy of top element of the stack.
	 * @return
	 */
	public K topValue();

	/**
	 * returns the length of stack.
	 * @return
	 */
	public int length();

}
