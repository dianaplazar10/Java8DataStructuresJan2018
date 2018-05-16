package com.DS;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class DS_SortedMaps {

	public static void main(String[] args) {
//		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
//		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
//		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		System.out.println("*****HashMap: ");
		testMap("hashMap", hashMap);
		
		System.out.println("****LinkedHashMap");
		testMap("linkedHashMap", linkedHashMap);
		
		System.out.println("****TreeMap");
		testMap("treeMap", treeMap);

	}
	
	public static void testMap(String type, Map<Integer, String> map)
	{
		map.put(20, "tiger");
		map.put(100,"One Hundred");
		map.put(10,"Ten");
		map.put(10000,"Ten Thousand");
		map.put(1,"One");
		map.put(48, "zebra");
		
		for (Integer key : map.keySet()) {
			String value = map.get(key);
			
			System.out.println(key+":"+value);
		}
		
	}

}

//Hashmap doesn't keep keys and values in any sorted order
//LinkedHashMap is a hashmap with reference to prev and next entry. ie, has a doubly linked list connecting each item, Ie, Order as entered.
//TreeMap is a Map that maintains a natural order(alphabetical, numerical)
//All of the above are implementation of Map interface
//Hashign means a code.. So Hashmap and Linked HashMap is called so as it uses a hash to store the items.



//OutPut:
//	
//	*****HashMap: 
//	10000:Ten Thousand
//	48:zebra
//	1:One
//	20:tiger
//	100:One Hundred
//	10:Ten
//	****LinkedHashMap
//	20:tiger
//	00:One Hundred
//	10:Ten
//	10000:Ten Thousand
//	1:One
//	48:zebra
//	****TreeMap
//	1:One
//	10:Ten
//	20:tiger
//	48:zebra
//	100:One Hundred
//	10000:Ten Thousand
