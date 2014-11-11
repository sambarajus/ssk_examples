package com.ssk.samples.mvntest.cache;


//This is using single linkedlist..
public class MyLRUCache<Item> {

	private int MAX_ENTRIES = 5;
	public Node<Item> first;
	public Node<Item> last;

	private int size = 0;

	public MyLRUCache(int maxSize) {
		this.MAX_ENTRIES = maxSize;
	}

	public void put(String key, Item item) {
		if (size < MAX_ENTRIES) {
			Node<Item> node = new Node(key, item);
			node.next = first;
			first.previous = node;
			first = node;
			size++;
		}
	}

	public Item get(String key) {
		Node<Item> object = first;
//		Node<Item> prev = first;
		Item item = null;

		if (first != null && first.key.equalsIgnoreCase(key))
			return item = first.item;

		while (object != null) {
			if (object.key.equalsIgnoreCase(key)) {
				item = object.item;
//				prev.next = object.next;
				object.previous = object.next;
				object.next = first;
				first = object;
			} 
			
			object = object.next;
		}
		return item;
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
