package com.DS;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class DS_Sets {

	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<String>();
		Set<String> linkedHashSet = new LinkedHashSet<String>();
		Set<String> treeSet = new TreeSet<String>();
		
		System.out.println(" test Set Intersections:");System.out.println("---------------------");
		testSetIntersectionOperations();
		System.out.println();
		System.out.println(" test Set Difference:");System.out.println("---------------------");
		testSetDifferenceOperations();
		
//		printTestSet(hashSet, linkedHashSet, treeSet);

	}

	/**
	 * @param hashSet
	 * @param linkedHashSet
	 * @param treeSet
	 */
	private static void printTestSet(Set<String> hashSet, Set<String> linkedHashSet, Set<String> treeSet) {
		System.out.println("*****HashSet: ");
		testSet("hashSet", hashSet);
		
		System.out.println("****LinkedHashSet");
		testSet("linkedHashSet", linkedHashSet);
		
		System.out.println("****TreeSet");
		testSet("treeSet", treeSet);
	}
	
	public static void testSet(String type, Set<String> set)
	{
		set.add("tiger");
		set.add("zebra");
		set.add("Dog");
		
		for (String setItem : set) {
			
			System.out.println(setItem);
		}
	}
//OutPut of this method:
//	*****HashSet: 
//		zebra
//		tiger
//		Dog
//		****LinkedHashSet
//		tiger
//		zebra
//		Dog
//		****TreeSet
//		Dog
//		tiger
//		zebra
	
	public static void testSetIntersectionOperations()
	{
		Set<String> treeSet1 = new TreeSet<String>();
		treeSet1.add("Atiger");
		treeSet1.add("Azebra");
		treeSet1.add("ADog");
		
		Set<String> treeSet2 = new TreeSet<String>();
		treeSet2.add("Bgiraffe");
		treeSet2.add("Bmonkey");
		treeSet2.add("Bpig");
		treeSet2.add("ADog");
		
		Set<String> intersectionSet = new TreeSet<String>(treeSet1);
		System.out.println("treeSet1 : "+treeSet1);
		System.out.println("treeSet2 : "+treeSet2);
		System.out.println("intersectionSet = new TreeSet<String>(treeSet1) >>>>> " + intersectionSet);
		intersectionSet.retainAll(treeSet2); //retainAll== intersection of intersectionSet and treeSet2
		System.out.println("intersectionSet.retainAll(treeSet2) >>> intersectionSet >>>" + intersectionSet);
		
	}
	//Output for this method:
		/*test Set Intersections:
		---------------------
		treeSet1 : [ADog, Atiger, Azebra]
		treeSet2 : [ADog, Bgiraffe, Bmonkey, Bpig]
		intersectionSet = new TreeSet<String>(treeSet1) >>>>> [ADog, Atiger, Azebra]
		intersectionSet.retainAll(treeSet2) >>> intersectionSet >>>[ADog]*/

	public static void testSetDifferenceOperations()
	{
		Set<String> treeSet1 = new TreeSet<String>();
		treeSet1.add("Atiger");
		treeSet1.add("Azebra");
		treeSet1.add("ADog");
		
		Set<String> treeSet2 = new TreeSet<String>();
		treeSet2.add("Bgiraffe");
		treeSet2.add("Bmonkey");
		treeSet2.add("Bpig");
		treeSet2.add("ADog");
		
		Set<String> diffeenceSet = new TreeSet<String>(treeSet1);
		System.out.println("treeSet1 : "+treeSet1);
		System.out.println("treeSet2 : "+treeSet2);
		System.out.println("diffeenceSet new TreeSet<String>(treeSet1) >>>>> " + diffeenceSet);
		diffeenceSet.removeAll(treeSet2); //removeAll== remove items of treeSet2 from intersectionSet 
		System.out.println("diffeenceSet.removeAll(treeSet2) >>> diffeenceSet -- >" + diffeenceSet);
	}
	//Output for this method:
		/*test Set Difference:
		---------------------
		treeSet1 : [ADog, Atiger, Azebra]
		treeSet2 : [ADog, Bgiraffe, Bmonkey, Bpig]
		diffeenceSet new TreeSet<String>(treeSet1) >>>>> [ADog, Atiger, Azebra]
		diffeenceSet.removeAll(treeSet2) >>> diffeenceSet -- >[Atiger, Azebra]*/
}

//Set is a kind of collection that stores only unique elements.
//..Intersection, iterating through sets etc, are some of the operations performed using Sets
//HashSet is an implementation of Set .. has no order.
//LinkedHashSet is also an implementation of Set. Retains entry order. It has a doubly linked list implementation to entries
//TreeSet is also a implementation of Set and maintains Natural Order

//Set Operations :
//	.contains(""), Checks if the set contains the item or not
// .containsAll("")
//	.isEmpty() , checks if the set is empty or not
//	.retainAll(set), --->intersection
// . removeAll(set) , --->Difference
