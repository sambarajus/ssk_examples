package com.ssk.samples.mvntest.cache;

import java.util.HashMap;

public class MyLinkedLRUCache<Item> {

	private int maxSize = 5;
	private int size = 0;

	private Node<Item> head;
	private Node<Item> tail;

	private HashMap<String, Node<Item>> map = new HashMap<String, Node<Item>>();

	public void put(String key, Item item) {
		Node<Item> n = null;
		if(map.containsKey(key)){
			n = map.get(key);
			n.item = item;
		}else{
			n = new Node<Item>(key,item);
			n.item = item;
			map.put(key, n);
			size++;
		}
		refreshCache(n);
	}
	
	private void removeElement(String key){
		//TODO
	}

	public Item get(String key) {

		Node<Item> n = map.get(key);
		refreshCache(n);
		return n.item;
	}

	private void refreshCache(Node<Item> node) {
		if(head!=null){
			if(node.previous!=null){
				node.previous.next = node.next;
			}else{
				head.previous = node;
				
			}
			node.next = head;
			head = node;
			if(tail==null){
				tail = node;
			}
			
		}else{
			
			head = node;
			tail  =node;
		}
		
		if(size>maxSize){
			tail = tail.previous;
			tail.next = null;
		}
		
	}

	public String toString(){
		Node current = head;
		System.out.println();
		while(current!=null){
			System.out.print(current.item+" --> ");
			current = current.next;
		}
		System.out.println();
		return null;
	}
	
	
	public static void main(String args[]){
		
		MyLinkedLRUCache<String> cache = new MyLinkedLRUCache<String>();
		cache.put("first", "First");
		cache.toString();
		cache.put("second", "Second");
		cache.toString();
		cache.put("third", "Third");
		cache.toString();
		cache.put("fourth", "Fourth");
		cache.toString();
		cache.put("fifth", "Fifth");
		cache.toString();
		cache.put("sixth", "Sixth");
		cache.toString();
		cache.put("seventh", "Seventh");
		cache.toString();
		cache.put("eighth", "Eighth");
		cache.toString();
		cache.get("third");
		cache.toString();
		cache.get("fourth");
		cache.toString();
		cache.get("first");
		cache.toString();
		
		
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
