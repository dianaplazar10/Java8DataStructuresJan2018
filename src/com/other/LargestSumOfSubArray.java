package com.other;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LargestSumOfSubArray {
	
	public static void main(String[] args) {
		
	int[] arr = {-1,3,2,0,1,2};
	LargestSumOfSubArray lsosa=new LargestSumOfSubArray();
	try{
	lsosa.printLargestSumOfSumArray(arr);
	}
	catch (NullPointerException e) {
		// TODO: handle exception
	}
	}

	/**
	 * @param arr
	 */
	public int printLargestSumOfSumArray(int[] arr) {
		//Iterate the above array and save the sum of aray values in a Map along with the index only if the value is greater than 0. else set the sum back to 0;
		Map<Integer, Integer> temp = new HashMap<Integer, Integer>();
		int sum=0;
		if(arr!=null)
		{
			for (int i = 0; i < arr.length; i++) {
				if(arr[i]<0) sum=0;
				else {
					sum = sum+arr[i];
					temp.put(i, sum);
				}
			}
		}
			
			Collection maxOfMapValues = temp.values(); //the max of the stored map values will be the largest sum
			
			int sumOfLargestSubArray = (int) Collections.max(maxOfMapValues);
			System.out.println(sumOfLargestSubArray);
			return sumOfLargestSubArray;
	}
	
	
			

}
