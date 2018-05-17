package com.Tests;
//Test by accenture.. for google

import java.util.Arrays;
import java.util.stream.IntStream;

public class CountIslands{

	public static void main(String args[])
	{
		CountIslands countIslands = new CountIslands();
		int[][] arr = //new int[4][4];
			{{1,1,0,0},
					{0,1,1,1},
					{0,1,1,1},
					{0,1,1,1}};
//		countIslands.printIslandCount(arr);
		int maxSizeof1sMatrix=maxsizeOf1fullSQUARE(arr);
		System.out.println(maxSizeof1sMatrix);
		
//		System.out.println(Arrays.toString(arr));
//		
//		System.out.println();
//		System.out.println(Arrays.deepToString(arr));
	}


	//https://www.youtube.com/watch?v=FO7VXDfS8Gk
//	This methods 
	private static int maxsizeOf1fullSQUARE(int[][] arr){
		int [][] arrclone=arr.clone();
		for(int i=0; i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				if(i==0 || j==0){
				} else if(arr[i][j] >0){
					arrclone[i][j]=getMinOf3(arrclone[i][j-1],arrclone[i-1][j-1],arrclone[i-1][j]) + arrclone[i][j];
				}				
			}
		}
//		Arrays.sort(arrclone);//throws exception	
		IntStream stream = Arrays.stream(arrclone).flatMapToInt(Arrays::stream);
		int max = stream.max().getAsInt();
//		int min = stream.min().getAsInt();
		return max;
	}

	private static int getMinOf3(int i, int j, int k) {
		int min = 0;
		min = (i<j)?i:j;
		min = (min<k)?min:k;
		return min;
	}
	
	int getLastEleOfArray(int[][] arr){
		return arr[arr.length-1][arr.length-1];
	}

}
