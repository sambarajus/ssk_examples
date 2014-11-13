/**
 * 
 */
package com.ssk.examples.cch2;

/**
 * @author sskumar
 * 
 */
public class SumOfInts25 {

	public SingleNode sumOfIntsReverseOrder(SingleNode n1, SingleNode n2) {

		SingleNode n3 = null;
		SingleNode temp = null;
		int cf = 0;
		while (n1 != null || n2 != null) {
			int sum = (Integer) n1.data + (Integer) n2.data + cf;
			cf = sum / 10;
			if (n3 != null) {
				temp.next = new SingleNode(sum % 10, null);
				temp = temp.next;
			} else {
				n3 = new SingleNode(sum % 10, null);
				temp = n3;
			}
			n1 = n1.next;
			n2 = n2.next;
		}

		return n3;
	}

	public SingleNode sumOfIntsForward(SingleNode n1, SingleNode n2) {
		SingleNode node = new SingleNode();
		int cf = 0;
		if (n1 == null || n2 == null)
			return null;
		SingleNode sumNode = sumOfIntsForward(n1.next, n2.next);
		if (sumNode != null) {
			cf = sumNode.data / 10;
			sumNode.data = sumNode.data % 10;
		}
		node.next = sumNode;
		node.data = n1.data + n2.data + cf;
		return node;
	}
}
