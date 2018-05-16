package com.algorithms;

//reference : http://howtodoinjava.com/algorithm/quicksort-java-example/

//keep the last item as pivot.
//Cmpare pivot element with each element in the 
import java.util.Arrays;

public class QuickSort
{
    public static void main(String[] args) 
    {
        Integer[] array = new Integer[] { 12, 13, 24, 10, 3, 6, 90, 70 };
        System.out.println(Arrays.toString(array));
        quickSort( array, 0, array.length - 1 );
        System.out.println(Arrays.toString(array));
    }
 
    public static void quickSort(Integer[] arr, int lowestIndex, int highestIndex) 
    {//check for empty or null array
        if (arr == null || arr.length == 0) return;         
        if (lowestIndex >= highestIndex)  return;
        int middle = lowestIndex + (highestIndex - lowestIndex) / 2; //Get  pivot  from  middle of  list
        int pivot = arr[middle];
        int i = lowestIndex, j = highestIndex;// make left < pivot and right > pivot
        while (i <= j) 
        {
            while (arr[i] < pivot)   i++;  //Check until all  on left  array are< pivot 
            while (arr[j] > pivot)  j--; //Check until all  on left side  are > pivot
            //Now compare values from both side of lists to see if they need swapping 
            //After swapping move the iterator on both lists
            if (i <= j) 
            {
                swap (arr, i, j);
                i++;
                j--;
            }
        }
        //Do same operation as above recursively to sort two sub arrays
        if (lowestIndex < j){
            quickSort(arr, lowestIndex, j);
        }
        if (highestIndex > i) quickSort(arr, i, highestIndex);
    }
     
    public static void swap (Integer array[], int x, int y)
    { int temp = array[x]; array[x] = array[y]; array[y] = temp;}
}
 
