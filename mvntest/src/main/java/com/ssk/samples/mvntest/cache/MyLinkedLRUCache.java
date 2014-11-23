package com.ssk.samples.mvntest.cache;

import java.util.HashMap;

public class MyLinkedLRUCache<Item> {

	private int maxSize = 5;

	private Node<Item> first;
	private Node<Item> last;

	private HashMap<String, Node> map = new HashMap<String, Node>();

	public void put(String key, Item item) {

		if(map.containsKey(key)){
			Node node = map.get(key);
		}else{
			
		}
	}
	
	private void removeNode(){
		
	}

	public Item get(String key) {

		return null;
	}

	private void setHead(Node<Item> node) {
		node.next = first;
		node.previous = null;
		if (first != null) {
			first.previous = node;
		}

		first = node;
		if (last == null) {
			last = node;
		}
	}

	public class Node<Item> {

		public String key;
		public Item item;
		public Node<Item> next;
		public Node<Item> previous;

		public Node(String key, Item item) {
			this.key = key;
			this.item = item;
		}
	}
}
