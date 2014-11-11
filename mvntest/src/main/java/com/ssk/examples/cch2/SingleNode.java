/**
 * 
 */
package com.ssk.examples.cch2;

import com.ssk.samples.mvntest.linkedlist.Node;

/**
 * @author shravans
 *
 *
 *         Node class for all Single Node LinkedList examples.
 */
public class SingleNode {

	public int data;
	public SingleNode next;

	public SingleNode() {

	}

	public SingleNode(int data) {
		this.data = data;
	}

	public SingleNode(int data, SingleNode next) {
		this.data = data;
		this.next = next;
	}

	public int getSize() {
		SingleNode n = this;
		int i = 0;
		while (n != null) {
			i++;
			n = n.next;
		}
		return i;
	}

	public String toString() {

		StringBuffer buf = new StringBuffer();
		SingleNode n = this;

		while (n != null) {
			buf.append(n.data);
			if (n.next != null)
				buf.append("-->");
			n = n.next;
		}
		return buf.toString();
	}
}
