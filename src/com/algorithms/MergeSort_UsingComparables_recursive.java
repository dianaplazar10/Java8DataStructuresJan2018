package com.algorithms;

import java.util.*;


//Merge sort also called Out-Of-Placeprocedure
public class MergeSort_UsingComparables_recursive
{
    public static void main(String[] args) 
    {
        //Unsorted array
        Integer[] a = { 2, 6, 3, 5, 1 };
        System.out.println(Arrays.toString(a));
        //Call merge sort
        mergeSort(a);
         
        //Check the output which is sorted array
        System.out.println(Arrays.toString(a));
    }
 
    @SuppressWarnings("rawtypes") 
    public static Comparable[] mergeSort(Comparable[] list) 
    {
        //If list is empty; no need to do anything
        if (list.length <= 1) {
            return list;
        }
         
        //Split the array in half in two parts
        Comparable[] first = new Comparable[list.length / 2];
        Comparable[] second = new Comparable[list.length - first.length];
        System.arraycopy(list, 0, first, 0, first.length);
        System.arraycopy(list, first.length, second, 0, second.length);
         
        //Sort each half recursively
        mergeSort(first);
        mergeSort(second);
         
        //Merge both halves together, overwriting to original array
        merge(first, second, list);
        return list;
    }
     
    @SuppressWarnings({ "rawtypes", "unchecked" }) 
    private static void merge(Comparable[] first, Comparable[] second, Comparable[] mergedResult) 
    {
        //Index Position in first array - starting with first element
        int firstIndexOf_first = 0;
         
        //Index Position in second array - starting with first element
        int firstIndexOf_second = 0;
         
        //Index Position in merged array - starting with first position
        int firstIndexOf_mergedResult = 0;
         
        //Compare elements at iFirst and iSecond, 
        //and move smaller element at iMerged
        while (firstIndexOf_first < first.length && firstIndexOf_second < second.length) 
        {
            if (first[firstIndexOf_first].compareTo(second[firstIndexOf_second]) < 0) 
            {
            	mergedResult[firstIndexOf_mergedResult] = first[firstIndexOf_first];
                firstIndexOf_first++;
            } 
            else
            {
            	mergedResult[firstIndexOf_mergedResult] = second[firstIndexOf_second];
                firstIndexOf_second++;
            }
            firstIndexOf_mergedResult++;
        }
        //copy remaining elements from both halves - each half will have already sorted elements
        System.arraycopy(first, firstIndexOf_first, mergedResult, firstIndexOf_mergedResult, first.length - firstIndexOf_first);
        System.arraycopy(second, firstIndexOf_second, mergedResult, firstIndexOf_mergedResult, second.length - firstIndexOf_second);
    }
}
