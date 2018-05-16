package com.DS;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import com.CustomObjects.Person;

public class UsingCustomObjectsInSetsMaps {

	public static void main(String[] args) {
	
		System.out.println("-----------------");
		System.out.println("MAP>>>>>>>>>>>>>>");
//		Map<Integer, String> map = new LinkedHashMap<Integer, String>();
		Map<Integer, Person> map = new LinkedHashMap<Integer, Person>();
		map.put(100,new Person(1,"name1"));//"One Hundred");
		map.put(10,new Person(2,"name2"));//"Ten");
		map.put(10000,new Person(3,"name3"));//"Ten Thousand");
		map.put(1,new Person(4,"name4"));//"One");
		
		for (Integer key : map.keySet()) {
			Person value = map.get(key);			
			System.out.println(key+":"+value.getName());
		}
		
		System.out.println("-----------------");
		System.out.println("SET>>>>>>>>>>>>>>");
//		Set<String> set = new LinkedHashSet<String>();
		Set<Person> set = new LinkedHashSet<Person>();
		set.add(new Person(1,"Setname1"));//"tiger");
		set.add(new Person(2,"Setname2"));//"zebra");
		set.add(new Person(3,"Setname3"));//"Dog");
		
		for (Person setItem : set) {			
			System.out.println(setItem.getName());
		}
	}
}

//Implement the equals and hashcode method for your POJO object 
//if you want them to be ignored while used as new objects with same values in Maps or Sets
//ie, Person p1 = new Person(1,"Setname1"); is not equal to 
//Person p2 = new Person(1,"Setname1"). However, though their values(id and name) are same, 
//they will b treated as difference object due to p1 and p2. hence implement the equals and hashcode methods.
