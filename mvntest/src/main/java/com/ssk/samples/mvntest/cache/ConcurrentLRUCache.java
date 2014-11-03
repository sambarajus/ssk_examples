package com.ssk.samples.mvntest.cache;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLRUCache<Key, Value> {

	private final int maxSize;
	private ConcurrentHashMap<Key, Value> map;
	private ConcurrentLinkedQueue<Key> queue;

	public ConcurrentLRUCache(final int maxSize) {
		this.maxSize = maxSize;
		map = new ConcurrentHashMap<Key, Value>(maxSize);
		queue = new ConcurrentLinkedQueue<Key>();
	}

	/**
	 * @param key
	 *            - may not be null!
	 * @param value
	 *            - may not be null!
	 */
	public void put(final Key key, final Value value) {
		if (map.containsKey(key)) {
			System.out.println("Removing Key from Queue "+key);
			queue.remove(key); // remove the key from the FIFO queue
		}

		while (queue.size() >= maxSize) {
			Key oldestKey = queue.poll();
			System.out.println("Polling Key : "+oldestKey);
			if (null != oldestKey) {
				System.out.println("Removing Key from Map "+oldestKey);
				map.remove(oldestKey);
			}
		}
		System.out.println("Adding Key : "+key);
		queue.add(key);
		map.put(key, value);
	}

	public Map getMap(){
		return map;
	}
	/**
	 * @param key
	 *            - may not be null!
	 * @return the value associated to the given key or null
	 */
	public Value get(final Key key) {
		return map.get(key);
	}

	public static void main(String args[]) {

		ConcurrentLRUCache<String, Object> cache = new ConcurrentLRUCache<String, Object>(3);
		
		for( int i=1;i<5;i++){
			String str  = new String("Object for "+i);
			cache.put("Key:"+i, str);
			cache.get("Key:"+i);
			System.out.println(cache.map);
		}
		cache.put("Key:"+3, "Put for 3");
		System.out.println(cache.get("Key:"+3));
		System.out.println(cache.map);
	}
}