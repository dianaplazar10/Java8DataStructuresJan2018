package com.algorithms;

//reference: http://www.vogella.com/tutorials/JavaAlgorithmsMergesort/article.html#mergesort 
	//The link also has related junit test code


public class MergeSort {
    private int[] numbers;
    private int[] helper;

    private int number;

    public void sort(int[] values) {
            this.numbers = values;
            number = values.length;
            this.helper = new int[number];
            mergesort(0, number - 1);
    }

    // check if low is smaller then high, if not then the array is sorted
    // Get the index of the element which is in the middle
    // Sort the left side of the array
    // Sort the right side of the array
    // Combine them both
    private void mergesort(int low, int high) {
            if (low < high) {
                    int middle = low + (high - low) / 2;
                    mergesort(low, middle);
                    mergesort(middle + 1, high);
                    merge(low, middle, high);
            }
    }

    private void merge(int low, int middle, int high) {

            // Copy both parts into the helper array
            for (int i = low; i <= high; i++) {
                    helper[i] = numbers[i];
            }

            int i = low;
            int j = middle + 1;
            int k = low;
            // Copy the smallest values from either the left or the right side back
            // to the original array
            while (i <= middle && j <= high) {
                    if (helper[i] <= helper[j]) {
                            numbers[k] = helper[i];
                            i++;
                    } else {
                            numbers[k] = helper[j];
                            j++;
                    }
                    k++;
            }
            // Copy the rest of the left side of the array into the target array
            while (i <= middle) {
                    numbers[k] = helper[i];
                    k++;
                    i++;
            }

    }
    
    public static void main(String[] args) {
	int[] arrayToMergeSort = {4,7,34,0,71,67,5,9,2};
	int high = arrayToMergeSort[0];
	int low=arrayToMergeSort[arrayToMergeSort.length-1];
	//int middle = (int) arrayToMergeSort.length/2;
	MergeSort msort = new MergeSort();
	msort.mergesort(low, high);
	}
}
