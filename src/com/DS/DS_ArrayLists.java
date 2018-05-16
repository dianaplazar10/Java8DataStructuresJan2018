package com.DS;

import java.util.ArrayList;

public class DS_ArrayLists {
public static void main(String[] args) {
	ArrayList<Integer> arrayList = new ArrayList<Integer>();
	arrayList.add(1);
	arrayList.add(100);
	arrayList.add(41);
	System.out.println(arrayList.get(2) + " : Third element in the list");
	
	System.out.println("Iteration One :");
	for (int i = 0; i < arrayList.size(); i++) {
		System.out.println(arrayList.get(i));
	}
	
	System.out.println("Iteration two:");
	for (Integer integer : arrayList) {
		System.out.println(integer);
	}
}
}


//Extends AbstractList
// . add(object)
// .remove(object index)
// .get(object)
// . size
//ArrayLists are Not sorted. Default size is 10-->new ArrayList<>(100);
// ArrayLists are very slow when items removed from begining(index 0). Very fast if removed from end

//Collection classes are grouped by Interfaces..3 main, List, Map and Set
//hence,
//List<Integer> arrayList = new ArrayList<Integer>();
//is correct.