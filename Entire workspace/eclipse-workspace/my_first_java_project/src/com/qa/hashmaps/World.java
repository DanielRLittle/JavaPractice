package com.qa.hashmaps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class World {
	public static void main(String[] args) {
		HashDouble<Integer, String> hm = new HashDouble<Integer, String>();
		hm.add(1, "Hugo");
		System.out.println(hm.getByKey(1));
		System.out.println(hm.getByValue("Hugo"));
		
		
		
		
//		HashMap<Integer, String> hashy = new HashMap<Integer, String>();
//		hashy.put(1, "Jay");
//		hashy.put(4, "Danny");
//		hashy.put(2, "Hugo");
//		hashy.put(3, "Viki");
////		System.out.println(hashy.entrySet());
////		System.out.println(hashy);
////		System.out.println(hashy.values());
////		hashy.remove(4);
////		System.out.println(hashy);
////		System.out.println(hashy.size());
////		System.out.println(hashy.clone());
////		@SuppressWarnings("unchecked")
////		HashMap<Integer, String> hashy2 = (HashMap<Integer, String>) hashy.clone();
////		System.out.println(hashy2);
//
//		for (Map.Entry<Integer, String> entry : hashy.entrySet()) {
//			if (entry.getValue().equals("Hugo")) {
//				System.out.println(entry.getKey());
//			}
//		}
//		
////		Iterator<Entry<Integer, String>> it = hashy.entrySet().iterator();
////		while(it.hasNext()) {
////			Entry<Integer, String> entry = it.next();
////			System.out.println(entry.getKey());
////		}
	}
}
