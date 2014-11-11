/**
 * 
 */
package com.ssk.examples.cch2;

/**
 * @author shravans
 *
 */
public class DoublyNode {
	public int data;
	public DoublyNode next;
	public DoublyNode prev;
	
	public DoublyNode(){
		
	}
	public DoublyNode(int data,DoublyNode next,DoublyNode prev){
		this.data = data;
		this.next = next;
		this.prev = prev;
	}
}
