package com.ssk.samples.mvntest.ds.queue;

public class Link<K>  {
	K element;
	Link<K> next;
	/**
	 * @return the element
	 */
	public K getElement() {
		return element;
	}
	/**
	 * @param element the element to set
	 */
	public void setElement(K element) {
		this.element = element;
	}
	/**
	 * @return the next
	 */
	public Link<K> getNext() {
		return next;
	}
	/**
	 * @param next the next to set
	 */
	public void setNext(Link<K> next) {
		this.next = next;
	}
	
	
}
