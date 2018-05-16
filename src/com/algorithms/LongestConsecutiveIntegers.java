package com.algorithms;

import java.util.HashSet;
import java.util.Set;

//needs an array
//
public class LongestConsecutiveIntegers{
   public static void main(String args[]){
       //define an array
       int[] intArr = {100,4,200,1,3,2,6,7,9};
       //int arrLength = intArr.length; // 9
       int intstr = longestConsecutive(intArr);
       System.out.println(intstr);
       
   }
   
   public static int longestConsecutive(int[] num) {
		// if array is empty, return 0
		if (num.length == 0) {
			return 0;
		}
	 
		Set<Integer> set = new HashSet<Integer>();
		int max = 1;
	 
		for (int e : num)
			set.add(e);
	 
		for (int e : num) {
			int left = e - 1;
			int right = e + 1;
			int count = 1;
	 
			while (set.contains(left)) {
				count++;
				set.remove(left);
				left--;
			}
	 
			while (set.contains(right)) {
				count++;
				set.remove(right);
				right++;
			}
	 
			max = Math.max(count, max);
		}
		//set.stream().forEach((Integer)->System.out.println(Integer));
		return max;
	}
   }
