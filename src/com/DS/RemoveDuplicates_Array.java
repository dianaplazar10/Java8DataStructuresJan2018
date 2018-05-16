package com.DS;

import java.util.HashSet;
import java.util.Set;

import org.apache.commons.lang3.ArrayUtils;

//refer:http://www.programcreek.com/2013/01/leetcode-remove-duplicates-from-sorted-array-java/
public class RemoveDuplicates_Array {

	public static void main(String[] args) {
		//SORTED Array
		int[] sortedArray = {1,2,2,4,6,7,7,9};
		System.out.println("length of original sortedArray : "+ sortedArray.length);
		
		int countOfUniqueElementsinSORTEDArray = countUniqueSortedArray(sortedArray);
		System.out.println("countOfUniqueElementsinSORTEDArray : "+countOfUniqueElementsinSORTEDArray);

		System.out.println("----------------------------------------------");
		
		//UNSORTED Array
		int[] unsortedArray = {3,1,6,6,8,3,5,9,1,2};
		System.out.println("length of original unsortedArray : "+ unsortedArray.length);
	
		
		int countOfUniqueElementsinUNSORTEDArray = countUniqueUNSortedArray(unsortedArray);
		System.out.println("countOfUniqueElementsinUNSORTEDArray : "+countOfUniqueElementsinUNSORTEDArray);
	}
	
	// Count the number of unique elements
	public static int countUniqueSortedArray(int[] A) {
		int count = 0;
		for (int i = 0; i < A.length - 1; i++) {
				if (A[i] == A[i+1]) {
					count++;//System.out.println("Repeated Element :" +A[i]);
				}
		}
		return (A.length - count);
	}
	
	// Count the number of unique elements
		public static int countUniqueUNSortedArray(int[] A) {
			//int count = 0;
			Set<Integer> uniqueArrayElementsSet = new HashSet<Integer>();
			for (int i = 0; i < A.length; i++) {
				uniqueArrayElementsSet.add(A[i]);
			}
			int[] tempArray = toInt(uniqueArrayElementsSet);
			return uniqueArrayElementsSet.size();//tempArray.length;
		}
		
		
		//CONVERT Set<Integer> to Array(int[])
		public static int[] toInt(Set<Integer> set) {
			  int[] a = new int[set.size()];
			  int i = 0;
			  for (Integer val : set) a[i++] = val;
			  return a;
			}

}
