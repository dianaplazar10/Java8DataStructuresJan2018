package com.algorithms;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
		int[] arr = {23,8,34,0};//new int[in.nextInt()];
//		for(int i =0; i<arr.length;i++){
//			arr[i]=in.nextInt();
//		}
		for(int item :arr) System.out.print(item+" ");
		System.out.println();
		//practice.selectionsort(arr);
//		practice.insertionSort(arr);
//		practice.mergeSort(arr);
		practice.bubbleSort(arr);
		
		for(int item :arr) System.out.print(item+" && ");
	}

	private static void selectionsort(int[] arr) {
		for(int i =0;i<arr.length;i++){			
			int min=i;
			for(int j =i;j<arr.length;j++){
				if(arr[j] < arr[min]){
					min =j;
				}
			}
			swap(min,i, arr);
		}
		for(int item :arr) System.out.print(item+" ");
	}

	private static void swap(int min, int i, int[] arr) {
		int temp = arr[min];
		arr[min]=arr[i];
		arr[i]=temp;		
	}
	
	static void insertionSort(int[] arr){
		for(int i =1;i<arr.length;i++){	
			
			int key = arr[i];
			while((i-1)>-1 && arr[i-1]>key){
				arr[i]=arr[i-1];
				i--;
			}
			arr[i]=key;
		}
		for(int item :arr) System.out.print(item+" ");
	}
	
	private static void mergeSort(int[] arr){
		int midIndex=arr.length/2;
		int[] left=new int[midIndex+1];
		for(int i=0;i<left.length;i++){
			left[i] = arr[i];
		}
		int[] right=new int[arr.length-midIndex+1];
		for(int i=0;i<right.length;i++){
			right[i] = arr[i];
		}
		
		mergeSort(left);
		mergeSort(right);
		merge(left, right);
	}

	private static void merge(int[] left, int[] right) {
		int i = 0,j = 0,k=0;
		int[] arr=new int[left.length+right.length];
		
		while(i<left.length && j<right.length){
			if(left[i]<right[j]){
				arr[k]=left[i];
				i++;
			} else {
				arr[k]=right[j];
				j++;
			}
			k++;
		}
		while(i<left.length){
			arr[k] =left[i];
			i++;k++;
		}
		while(j<right.length){
			arr[k]=right[j];
			j++;k++;
		}
	}
	
	private static void bubbleSort(int[] arr){
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {				
				if(arr[j+1]<arr[j]){
					swap(j+1,j,arr);
				}
			}
		}
	}

}
