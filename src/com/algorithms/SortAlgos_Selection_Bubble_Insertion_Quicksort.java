package com.algorithms;

import java.util.Arrays;

public class SortAlgos_Selection_Bubble_Insertion_Quicksort{ 
	
	
//SelectionSort
//------------
//	Its a slow sorting algorithm
//	Its time complexity is 0(n2)
	
//for (int i = 0; i < arr.length - 1; i++) 
//		for (int j = i + 1; j < arr.length; j++)
//			if (arr[j] < arr[index]){
    public static void selectionSort(int[] arr){  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int minindex = i;  
           for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[minindex]){  
                	minindex = j;//searching for lowest index  
                }  
            }  
            swapArrayItem(arr, i, minindex);  
        }  
    }
       
    
//BubbleSort
//------------
//    .With every pass, the array will have 1 largest will bubble to the highest index
//    Also a slow sorting algorithm
//    Its worst time complexity is 0(n2)
//    Best case: 0(n). when the first iteration with no swap, indicate already sorted

    //    If there is no swap in the iteration, it means teher's no swap needed as teh list is alreday sorted. so , we cd introduce a flag
    
//for (int i = 0; i < arr.length-1; i++) 
//  	for (int j = 0; j < arr.length-1-i; j++){  
//  		if (arr[j] >arr[j+1]){  
      public static void bubbleSort(int[] arr){  
          for (int i = 0; i < arr.length-1; i++)  
          {  
               int flag =0;//to check if no swaps occured in any iteration, we cd stop the iteration.
             for (int j = 0; j < arr.length-1-i; j++){  
                  if (arr[j] >arr[j+1]){  
                	  swapItem4bubblesort(arr, j); 
                	  flag=1;
                  }  
              }  
             if(flag==0) break;//This breaks further iteration.
          }  
      }


/**
 * @param arr
 * @param j
 */
private static void swapItem4bubblesort(int[] arr, int j) {
	int temp = 0; 
	temp = arr[j];  
	  arr[j] = arr[j+1];  
	  arr[j+1] = temp;
} 
    
      
//Insertion
//------------
//Time complexity: Best case = O(n), Worstcase = O(n2)
//for (int j = 1; j < arr.length; j++) 
//      	  
//      while ( (i > -1) && ( arr [i] > arr[j] ) ) {         
      public static void insertionSort(int[] arr) {  
          for (int j = 1; j <arr.length; j++) {  
              int i = j-1;  
              int key = arr[j];
              while ( (i > -1) && ( arr [i] > key ) ) {  
                  arr [i+1] = arr [i];  
                  i--;  
              }  
              arr[i+1] = key;  
          }  
      }  
      
      
//Quicksort
/*      Quicksort is a divide and conquer algorithm. It first divides a large list into two smaller sub-lists and then recursively sort the two sub-lists. If we want to sort an array without any extra space, quicksort is a good option. On average, time complexity is O(n log(n)).

      The basic step of sorting an array are as follows:

      Select a pivot, normally the middle one
      From both ends, swap elements and make left elements < pivot and all right > pivot
      Recursively sort left part and right part
      Here is a very good animation of quicksort.*/

       
      	public static void quickSort(int[] arr, int low, int high) {
      		if (arr == null || arr.length == 0)
      			return;
       
      		if (low >= high)
      			return;
       
      		// pick the pivot
      		int middle = low + (high - low) / 2;
      		int pivot = arr[middle];
       
      		// make left < pivot and right > pivot
      		int i = low, j = high;
      		while (i <= j) {
      			while (arr[i] < pivot) {
      				i++;
      			}
       
      			while (arr[j] > pivot) {
      				j--;
      			}
       
      			if (i <= j) {
      				swapArrayItem(arr, j, i);
      				i++;
      				j--;
      			}
      		}
       
      		// recursively sort two sub parts
      		if (low < j)
      			quickSort(arr, low, j);
       
      		if (high > i)
      			quickSort(arr, i, high);
      	}
      	


    	/**
    	 * @param arr
    	 * @param i
    	 * @param index
    	 */
    	private static void swapArrayItem(int[] arr, int i, int minIndex) {
    		int smallerNumber = arr[minIndex];   
    		arr[minIndex] = arr[i];  
    		arr[i] = smallerNumber;
    	}  

      
    public static void main(String a[]){  
        int[] arr1 = {6,0,3,1,4};//9,14,3,2,43,11,58,22};  
        insertionSort2(arr1);
        
        
        System.out.println("Before Selection Sort");  
        for(int i:arr1){  
            System.out.print(i+" ");  
        }  
        System.out.println();  
          
        System.out.println();System.out.println("--------------------");
        
        selectionSort(arr1);         
        System.out.println("After Selection Sort");  
        for(int i:arr1){  
            System.out.print(i+" ");  
        }  
        
        System.out.println();System.out.println("--------------------");
        
        bubbleSort(arr1);       
        System.out.println("After Bubble Sort");  
        for(int i:arr1){  
            System.out.print(i+" ");  
        }
        
        
        System.out.println();System.out.println("--------------------");
        
        insertionSort(arr1);           
        System.out.println("After Insertion Sort");  
        for(int i:arr1){  
            System.out.print(i+" ");  
        }  
        
        
        System.out.println();System.out.println("--------------------");
  		int[] x = { 9, 2, 4, 7, 3, 7, 10 };
  		//System.out.println(Arrays.toString(x));
  		int low = 0;
  		int high = x.length - 1;
   
  		quickSort(x, low, high);
  		System.out.println("After QuickSort"); 
  		System.out.println(Arrays.toString(x));
    }  
    
    //practice - Apr 27th
    private static void insertionSort2(int[] arr){
    	for(int item : arr) 
    		System.out.println(item);
    	for(int i =1;i<arr.length;i++){
    		int key = arr[i];
    		while(i>0 && arr[i-1]>key){
    			arr[i]=arr[i-1];
    			i--;
    		}
    		arr[i]=key;
    	}
    	for(int item : arr) System.out.println(item);
    }
    
}
  