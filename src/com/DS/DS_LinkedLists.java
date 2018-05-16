package com.DS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DS_LinkedLists {

	public static void main(String[] args) {
//		ArrayList<Integer> arrayList = new ArrayList<Integer>();
//		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> linkedList = new LinkedList<Integer>();
		
		doTimings("ArrayList",arrayList);
		doTimings("LinkedList",linkedList);
	}

	private static void doTimings(String type, List<Integer> typeOfList){
		
		System.out.println("******" + type + "*******");
		long startTime = System.currentTimeMillis();
		
		//Adding items at the end of lists
		for (int i = 0; i < 1E5; i++) {
			typeOfList.add(i);//Or adding right at end.. typeOfList.add(typeOfList.size(),i);
			}
		
		long endTime = System.currentTimeMillis();
//		
		System.out.println("Time Taken adding at end in milliseconds : " + (endTime - startTime)+ "for :" + type);
		
	}
}

//Use LinkedList .. to perform operations on items in the middle or beginning.
//Each item has a reference to item next and previous elements.
//Its slower to traverse through a linked list when compared to ArrayList. However, with huge data, this gets faster than ArrayList.

//Use ArrayList .. to perform operations on items at the end of the list.
//Manage arrays internally.. ie, it has to move the remaining items forwards or backward while adding or removing items in between
//either specify size of defaults to 10