package com.CollectionUtils;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Using_Iterators {

	public static void main(String[] args) {
		List<String> linkedList = new LinkedList<String>();
		linkedList.add("dog");
		linkedList.add("cat");
		linkedList.add("monkey");
		linkedList.add("chicken");
		Iterator<String> iterator = linkedList.iterator();
		while(iterator.hasNext()){
			String value = iterator.next();
			System.out.println(value);
			
			if(value.equals("cat")) iterator.remove();
			
		}


	}

}

//.hasNext(), .next(), .remove();
//Iterators can be customized by using Iterable interface - inturn overriding iterator() method,
//a pojo implements Iterable interface to customize its iterations while iterated in a different class.
//a foreach loop (for(String str : pojoObject)) can be used on a POJO only if it has implemented Iterable interface