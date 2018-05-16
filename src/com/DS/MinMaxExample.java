package com.DS;

//Assume first element is max/ iterate and check over each elements if greater than max /return max.
//Assume first element is min and iterate and check over each elements if lesser than min and return min.

public class MinMaxExample { 
	 
	  public static void main(String args[]){
	    int array[] = new int[]{10, 11, 88, 2, 12, 120};
	 
	    // Calling getMax() method for getting max value
	    int max = getMax(array);
	    System.out.println("Maximum Value is: "+max);
	 
	    // Calling getMin() method for getting min value
	    int min = getMin(array);
	    System.out.println("Minimum Value is: "+min);
	  }

	// Method for getting the minimum value
	private static int getMin(int[] array) {
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if(array[i] > min) min=array[i];
		}
		return min;
	}

	// Method for getting the maximum value
	private static int getMax(int[] array) {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if(array[i] > max) max=array[i];
		}
		return max;
	}
	 
	}
