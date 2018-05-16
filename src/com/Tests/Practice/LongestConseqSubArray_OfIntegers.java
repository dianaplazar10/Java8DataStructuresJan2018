package com.Tests.Practice;

//needs an array
//

import java.util.HashSet;
import java.util.Set;

 public class LongestConseqSubArray_OfIntegers{
	     public static void main(String args[]){
	         //define an array
	         int[] intArr = {100,4,200,1,3,2,6,7,9};
	         int arrLength = intArr.length; // 9
	         
	         LongestConseqSubArray_OfIntegers longestSeqClass = new LongestConseqSubArray_OfIntegers();
	        //pass this array to the function
	        int longestSeqCount = longestSeqClass.longestSeqCount(intArr);
	        System.out.println("longest consecutive elements sequence" + longestSeqCount);
	    }
    
    
    public int longestSeqCount(int[] intArr){
        //return 0 for empty array
        if(intArr.length==0){
            return 0;
        }
        
        //set a variable to 1, indicating that if no sequence, return this variable
        int maxConseqSequenceCount =1;
        
        //we need to sort the array first.. is another way. However, here, that is not required
        Set<Integer> set = new HashSet<Integer>();
        
        for(int item:intArr){
            set.add(item);
        }
        
        //check for each item to see if the previous n the post elements are in the set
        for(int item :intArr)
        {
            int counter=1;
            int leftItem = item-1;
            int rightItem = item+1;
            
            //check for previous item
            while(set.contains(leftItem))
            {
                counter++;
                set.remove(leftItem);
                leftItem--;
            }
            
            //check for post item
            while(set.contains(rightItem))
            {
                counter++;
                set.remove(rightItem);
                rightItem++;
            }
            maxConseqSequenceCount = Math.max(counter,maxConseqSequenceCount);
        }
        return maxConseqSequenceCount;
    }//End Function
     
}//EndClass