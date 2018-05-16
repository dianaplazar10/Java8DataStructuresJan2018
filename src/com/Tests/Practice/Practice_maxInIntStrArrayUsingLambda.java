package com.Tests.Practice;

import java.util.HashMap;
import java.util.Map;

//Write a function which takes an array and emits the majority element (if it exists), otherwise prints NONE as follows:
//I/P : 3 3 4 2 4 4 2 4 4
//O/P : 4 

public class Practice_maxInIntStrArrayUsingLambda {
	
	public static void main(String[] args) {
		int[] intArr = {3,3,4,2,4,4,2,4,4};
//		int[] intArr = {3,3,3,3,3,4,2,4,4,2,4,4};
		
		String str = "whats the new World?";
		str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();//remove all special character
		char[] arr = str.toCharArray();
		
		Practice_maxInIntStrArrayUsingLambda practice = new Practice_maxInIntStrArrayUsingLambda();
		practice.emitMajorityOfIntArr(intArr);
		practice.emitMajorityOfStrArr(arr);
	}
	
	void emitMajorityOfIntArr(int[] arr)
	{
		Map<Integer,Integer> intMap = new HashMap<>();
		for(int arrSingles : arr)
		{
			intMap.put(arrSingles, intMap.containsKey(arrSingles) ? intMap.get(arrSingles)+1 : 1);
		}

		int maxValue = intMap.entrySet().stream().max((entry1, entry2) -> entry1.getValue() - entry2.getValue()).get().getKey();//.getValue();
		System.out.println(maxValue);
	}
	
	void emitMajorityOfStrArr(char[] arr)
	{
		Map<Character,Integer> strMap = new HashMap<>();
		
		for(char ch : arr)
		{
			strMap.put(ch, strMap.containsKey(ch) ? strMap.get(ch)+1 : 1);
		}

		char maxChar = strMap.entrySet().stream().max((entry1, entry2) -> entry1.getValue() - entry2.getValue()).get().getKey();//.getValue();
		System.out.println(maxChar);
	}
	
	
//	emitMajorityOfIntArr() --  OldWay
	//Code test conducted by Capital One.. by consultant(ITPRO)
	
//	 private void printElementMax(int[] arr){
//	        HashMap<Integer,Integer> intMap = new HashMap<>();
//	           for(int i =0; i<arr.length;i++)
//	           {
//	           int item = arr[i];
//	               if(intMap.containsKey(arr[i]))
//	               {
//	                   intMap.put(item, intMap.get(item)+1);
//	               }
//	               else
//	               {intMap.put(item,1);}
//	           }
//	           
//	           int lengthToCheck = arr.length/2;
//	           int max = 0;
//	           for(int i =0; i<arr.length;i++)
//	           {
//	               int item = arr[i];
//	               if(intMap.get(item)>=lengthToCheck)
//	                   {
//	                       max = Math.max(max,item);
//	                   }
//	           }
//	           System.out.println(max);
//	       }

}
