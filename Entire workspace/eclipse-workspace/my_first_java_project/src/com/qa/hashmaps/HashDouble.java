package com.qa.hashmaps;

import java.util.HashMap;

public class HashDouble<K, V> {

	HashMap<K, V> hashie = new HashMap<K, V>();
	HashMap<V, K> hashieInverse = new HashMap<V, K>();
	
	public void add(K k, V v) {
		hashie.put(k, v);
		hashieInverse.put(v, k);
	}
	
	public V getByKey(K k) {
		return hashie.get(k);
	}
	
	public K getByValue(V v) {
		return hashieInverse.get(v);
	}
}
