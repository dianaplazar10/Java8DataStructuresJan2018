package com.sorting;

import java.util.Arrays;

public class SearchAlgos {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr={23,45,1,0,5,6};
        int indexofSearch = SearchAlgos.linearSearch(arr,5);
        System.out.println("SearchItem LinearSearch::" + indexofSearch);

        Arrays.sort(arr);
        indexofSearch = SearchAlgos.binarySearch(arr,5);
        if(indexofSearch==-1) System.out.println("item not in given array");
        else System.out.println("SearchItem BinarySearch::" + indexofSearch);
    }
    
    private static int linearSearch(int[] arr, int searchItem){
        int indexofSearch = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==searchItem){
                return i;
            }
        }
        return indexofSearch;
    }
    
    private static int binarySearch(int[] arr, int searchItem){
        int indexofSearch = -1;
        int startIndex=0;
        int endIndex=arr.length-1;
        while(startIndex<endIndex){
            int midIndex= (startIndex+endIndex)/2;
            if(arr[midIndex]==searchItem) return midIndex;
            else if(arr[midIndex]>searchItem){
                startIndex=midIndex-1;
            }else if(arr[midIndex]<searchItem){
                endIndex=midIndex+1;
            } 
        }
        return indexofSearch;
    }

}