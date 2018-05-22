package com.datastructures;
//reference: https://www.lynda.com/Java-tutorials/Iterable-interface/534633/594587-4.html
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*ArrayList and Vector
pros:
fast access via indexing
memory coherence: The elements are stored sequentially in meory
provide size or not.. works
Elements are stores in sequential memory addresses
cons:
Time consuming to insert/delete elements in the middle. if need to insert element at 50th index.. the remaining elements(50). say 50 to 100 if of size n, needs to move 50 indeces.
Waste memory if array not null as it has fixed size
Need to resize the arraylist if capacity assigned reached.

LinkedList
Pros:
	Insertion.Deletion of elements easy. Beginning/middle or end.. due to indexing
Cons:
	Elements not stored sequentially..
	Slower iteration and memory overhead
	

Collections comprises of : 
	-Set(TreeSet,SortedSet,HashSet)
	-List(Vector(parents -Stack),ArrayList,LinkedList)
	-Queue(PriorityQueue,Deque)
	
Iterable interface:iterator object to traverse the elements
	-iterator() returns an iterator object
	-iterator includes hasNext(), next(), remove()
	
	ListIterator
	-while iterator is applied for List object, Listiterator is used explicitly for List objects which provides functionality for backwards traversing of the elements
	-ListIterator includes along with those of Iterator(), previous(), hasPrevious() previousIndex();
	
	ArrayList(AL)/LinkedList(LL)
	-Both implements List interface
	-the array size increases as required in both
	//AL 
	 * can contain NULL values
	 * not thread-safe inherently
	 * 
 */
	
public class ArrayList_Vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1 = Arrays.asList(1,1,2,3,5,11,21,34,55);
		System.out.println("position of the number 21 :" + Collections.binarySearch(list1, 21));
		
		Collection collection = Arrays.asList("red","orange" ,"yellow","green","blue","indigo","violet");
		Iterator iterator = collection.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}

	}

}
