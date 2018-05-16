package com.algorithms;

//Binary search.. compare the searching value with the mid-indexed value in the array.. 
//n assign the start and end index accordingly

import java.util.Arrays;
import java.util.Scanner;

public class binarySearch
{
	public static void main(String[] args)
	{
		int[] array={23,43,21,87,98,67,56,80,76,55};
		int search=77;
		Arrays.sort(array);
		for(int i=0;i<=array.length-1;i++)
		{
			System.out.print(array[i]+",");
		}
		int start=0;
		int end=array.length-1;
		int mid=(start+end)/2;
		System.out.println();
		
		while(start<=end)
		{
			if(search==array[mid])
			{
				System.out.println("Number found at index "+mid);
				break;
			}
			else if(search>array[mid])
			{
				start=mid+1;
			}
			else if(search<array[mid])
			{
				end=mid-1;
			}
			mid=(start+end)/2;
		}
		if(start>end)
		{
			System.out.println("Number not found");
		}	
	}
}

//Code with recursive method - solution 2
/*class binarySearch{

	   static int search_method(int[] arr,int start, int end, int search_elem){
	        int mid=(start+(end-1))/2;
	    if(start < end){	       
	        if ( search_elem < arr[mid])    return search_method(arr,start,mid,search_elem); Searching in the lower half               
	        if (search_elem == arr[mid])	return mid;	Checking if the middle element                         
	        return search_method(arr,mid+1,end,search_elem);		searching in upper half
	      }
	     return -1; // If not found 
	    
	    }
	  public static void main(String[] args){
		  Scanner sc = new Scanner(System.in);
		  int search_element=Integer.parseInt(sc.nextLine());
	         
	         int[] arr={1,2,3,4,5};
	         int indexOfSearchInt = search_method(arr,0,arr.length,search_element);
	         if(indexOfSearchInt==-1) System.out.println("Number not found");
	         else
	         System.out.println("Index of the search element is "+ indexOfSearchInt);
	   }
	}*/
