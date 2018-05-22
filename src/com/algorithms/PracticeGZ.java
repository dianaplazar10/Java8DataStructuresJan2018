package com.sorting;

public class PracticeGZ {

    public static void main(String[] args) {
       int itemIndex =0;
       int[] arr = {4,78,0,12,7};
//       itemIndex = binarySearch(arr,7);
//       printSearchResult(itemIndex, "binarySearch");
//       itemIndex = linearSearch(arr,7);
//       printSearchResult(itemIndex, "linearSearch");
       
//       insertionSort(arr);
//       printSortResult(arr);
//       selectionsort(arr);
//       printSortResult(arr);
       
//     HeapSort(arr);
//     printSortResult(arr);
       
//     MergeSort(arr);
//     printSortResult(arr);
    }

    //select key as 2nd item in arr
    //iterate over the array and compare the previous item and swap if prev is greater than key.
    //proceed thsi for all elements on the left of the key,
    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            while((i-1>-1) && (arr[i-1]>key)){
                arr[i]=arr[i-1];
                i--;
            }
            arr[i] = key;
        }
    }
    /**
    *reference link : https://www.studytonight.com/data-structures/insertion-sorting
    Complexity Analysis of Insertion Sorting
    ----------------------------------------
    Worst Case Time Complexity : O(n2)
    Best Case Time Complexity : O(n)
    Average Time Complexity : O(n2)
    Space Complexity : O(1)
    * 
    */

  //start with min = first arrayitem, 
    //and then check that min across all other items and 
    //  swap when an item is less than the min.
      private static void selectionsort(int[] arr) {
          for (int i = 0; i < arr.length; i++) {
              int min=arr[i];
              for (int j = i+1; j < arr.length; j++) {
                  if(arr[j]<min){
                      min = arr[j];
                      swap(arr,i,j);
                  }
              }
          }
          
      }
      /**
      *reference link : https://www.studytonight.com/data-structures/selection-sorting
      Complexity Analysis of Selection Sorting
      ----------------------------------------
      Worst Case Time Complexity : O(n2)
      Best Case Time Complexity : O(n2)
      Average Time Complexity : O(n2)
      Space Complexity : O(1)
      * 
      */

      private static void mergeSort(int[] arr) {
//          int k,i,j;
          int midIndex=arr.length/2;
          int[] larr=new int[midIndex];
          int[] rarr=new int[arr.length-midIndex];
          for (int i = 0; i < larr.length; i++) {
            larr[i]=arr[i];
          }
          for (int i = 0; i < rarr.length; i++) {
              rarr[i]=arr[i];
          }
          int[] leftarr=
      }

    private static void swap(int[] arr, int item, int min) {
       int temp=arr[min];
       arr[min]=arr[item];
       arr[item]=temp;
    }

    private static void printSortResult(int[] arr) {
        for(int item:arr) System.out.print(item+" ");
    }
    

    private static void printSearchResult(int itemIndex, String searchType) {
        if(!(itemIndex==-1)) System.out.println(searchType+"index of searched item is :"+itemIndex);
           else System.out.println("Searched item not found");
    }

    //divide the sorted array into 2 
    //check if the search item is the mid item itself, return index,
    //else check if miditem>searchitem, if yes, then set end_index of array to midindex -1
    //else set start index to midIndex+1
    private static int binarySearch(int[] arr, int searchItem) {
        int start = 0;
        int end= arr.length-1;
        while(start<end){
            int mid=(start+end)/2;
            if(arr[mid]==searchItem) return mid;
            else if(arr[mid]>searchItem){
                end = mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }

    private static int linearSearch(int[] arr, int searchItem) {
        int searchItemIndex=-1;
        for(int i =0; i<arr.length;i++){
            if(arr[i]==searchItem) return i;
        }
        return searchItemIndex; 
    }
    
    
}

