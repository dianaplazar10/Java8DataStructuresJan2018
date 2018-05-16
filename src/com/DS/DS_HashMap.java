package com.DS;

import java.util.HashMap;
import java.util.Map;

public class DS_HashMap {
	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		
		hashMap.put(100,"One Hundred");
		hashMap.put(10,"Ten");
		hashMap.put(10000,"Ten Thousand");
		hashMap.put(1,"One");
		
		//Access a value from a HashMap
		System.out.println("entry of map with key 10" + hashMap.get(10));
		
		for(Map.Entry<Integer, String> mapVariable : hashMap.entrySet())
		{
		int key = mapVariable.getKey();
		String value = mapVariable.getValue();
		
		System.out.println(key + ":" +value);
		}
	}

}
////HashMap keys are unique.HashMap cannot have duplicate keys. It only overwrites.
//HashMap is an Implementation of Map(interface)
//HashMap is not sorted
//Hashmap consists of a Key and a Value for each key. 
//If we plan to implement our own Key object, then it needs to implement Hashcode() and equals() method
//Map.Entry<Integer, String> can be used to iterate through any implementation class of Map(Hashmap, Treemap)
//hashMap.entrySet() -- > retrieves all the items in a Map.. as a set