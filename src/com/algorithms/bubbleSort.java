package com.sorting;

import java.util.Arrays;

/**
 * @author diana.lazar
 *
 * It is called Bubble sort, because with each iteration the largest element in the list bubbles up 
 * towards the last place, just like a water bubble rises up to the water surface. 
 * Sorting takes place by stepping through all the data items one-by-one in pairs and 
 * comparing adjacent data items and swapping each pair that is out of order.
 */
public class bubbleSort {

    /**
     * @param args
     * In the above code, if in a complete single cycle of j iteration(inner for loop), 
     * if no swapping takes place, then flag will remain 0 and 
     * then we will break out of the for loops, because the array has already been sorted.
     */
    public static void main(String[] args) {
        int a[] = {5, 1, 6, 2, 4, 3};
        int i, j;
        System.out.println("before sort : " +Arrays.toString(a));
        for(i=0; i<6; i++)
        {
          boolean flag = false;
          for(j=0; j<6-i-1; j++)
          {
            if( a[j] > a[j+1])
            { flag = swap(a, j); } 
          }
          if(!flag)//breaking out of for loop if no swapping takes place
          { break; }
        }
        System.out.println("after sort : " +Arrays.toString(a));
    }

    /**
     * @param a
     * @param j
     * @return
     */
    private static boolean swap(int[] a, int j) {
        int temp;
        boolean flag;
        temp = a[j];
          a[j] = a[j+1];
          a[j+1] = temp;
          flag = true;         //setting flag as 1, if swapping occurs
        return flag;
    }

}

/**
 *reference link : https://www.studytonight.com/data-structures/bubble-sort.php
 *
Complexity Analysis of Bubble Sorting
In Bubble Sort, n-1 comparisons will be done in 1st pass, n-2 in 2nd pass, n-3 in 3rd pass and so on. So the total number of comparisons will be

(n-1)+(n-2)+(n-3)+.....+3+2+1
Sum = n(n-1)/2
i.e O(n2)
Hence the complexity of Bubble Sort is O(n2).
The main advantage of Bubble Sort is the simplicity of the algorithm. 

Space complexity for Bubble Sort is O(1), 
----------------
because only single additional memory space is required i.e. for temp variable

Best-case Time Complexity will be O(n), 
-------------------------
it is when the list is already sorted.

Complexity Analysis of Bubble Sort
Worst Case Time Complexity : O(n^2)
Best Case Time Complexity : O(n)
Average Time Complexity : O(n^2)
Space Complexity : O(1)
 * 
 */
