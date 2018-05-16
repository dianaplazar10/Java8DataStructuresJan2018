package com.CollectionUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class NaturalOrder_ComparableInterface {

	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<String>();
		
		
		Set<String> treeSet = new TreeSet<String>();//Sorts items in natural order
		
		addElementsToAnyCollectionType(arrayList);
		addElementsToAnyCollectionType(treeSet);
		
//		Collections.sort(arrayList);

		showElements(arrayList);
		showElements(treeSet);
	}
	
	private static void addElementsToAnyCollectionType(Collection<String> collectionType)
	{
		collectionType.add("Sandy");
		collectionType.add("Annie");
		collectionType.add("Lilly");
	}

	private static void showElements(Collection<String> collectionType)
	{
//		for (int i=0; i<collectionType.size();i++) 
		{
			System.out.println(collectionType.getClass().toString() + ":"+collectionType);
			
		}
	}
	//Output:
	/*class java.util.ArrayList:[Sandy, Annie, Lilly]
	class java.util.TreeSet:[Annie, Lilly, Sandy]*/

}


//Comparable
//Implementing Comparable interface (override its compareTo()) to a POJO if you intend to add it to a Set/
//To add elements to a Set, The adding elements should have a natural order while sorting, ie.. if we are to add set.add(new Person());,
//then, we have to implement Comparable interface and implement compareTo() in th ePerson Object class. Ths will bring a natural order to th eObject.
//If we try and add an Object to a set without a Natural order(ie, if the Person object has not implemented Comparable), then, 
//Collections.sort(set) will throw an exception.

//and Of course, the Person object also needs to implement Hashcode and equals method to be able to be added to a Set.