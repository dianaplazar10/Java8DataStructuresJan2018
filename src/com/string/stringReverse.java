package com.string;
//Take an input string from the user and print its reverse 


import java.util.Scanner;

public class stringReverse {

		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			String str = sc.nextLine();

			//Solution 1.//for loop and save as reverse string.. ie. i=(length-1) and i++
//			int l=str.length();
//			String reverse="";
//			for(int i=l-1;i>=0;i--)
//				reverse= reverse + str.charAt(i);
//			System.out.println(reverse);

			//Soultion 2.
			/*
			StringBuilder sb= new StringBuilder(str);
			reverse = sb.reverse().toString();
			System.out.println(reverse);
			 */
			
			//Soultion 5.//using char[] -MOST OPTIMAL for larger strings
//			/*
			char[] letters = str.toCharArray();
			//int l2=str.length();
			char[] lettersReversed = new char[letters.length];
			for(int i=0;i<letters.length;i++)
				lettersReversed[i]= letters[(letters.length-1)-i];
			System.out.println(new String(lettersReversed));
//			*/
	}
		
		
		//reverse using recursion
		   public static String reverseRecursively(String str) {
		        //base case to handle one char string and empty string
		        if (str.length() < 2) {
		            return str;
		        }
		        return reverseRecursively(str.substring(1)) + str.charAt(0); //RECURSIVE 1-liner...
		    }
		


}
