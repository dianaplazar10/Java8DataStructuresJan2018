package com.string;

//Given string :  '(', ')', '{', '}', '[' and ']'
//valid if : close in the correct order, "()" and "()[]{}"
//invalid if :"(]" and "([)]"

import java.util.Stack;

public class CheckForValidStringWithCorrectlyClosedBraces{
    public static void main(String arg[]){
        String str = "(){}[]";
        String str2=  "(]){)}[(]";
        CheckForValidStringWithCorrectlyClosedBraces checkStringValidity = new CheckForValidStringWithCorrectlyClosedBraces();
        boolean validityStatus1 = checkStringValidity.checkIfValidString(str);
        boolean validityStatus2 = checkStringValidity.checkIfValidString(str2);
        System.out.println(validityStatus1);
        System.out.println(validityStatus2);
    }
    
    public boolean checkIfValidString(String str)
    {
    	String string =  str.replaceAll("[a-zA-Z0-9]", "").toLowerCase();
        int length = string.length();
        //need to analyse each character.. hence
        char[] array = string.toCharArray();
        
        if(length==0) return true;//empty string is still a valid string;
        
        Stack<Character> stack = new Stack<Character>();
        for(int i =0; i<length;i++)
        {
            if(array[i]=='(' || array[i]=='[' || array[i]=='{' )
            {
                stack.push(array[i]);
            }
            
            if(array[i]==')' || array[i]==']' || array[i]=='}' )
            {
               if(stack.isEmpty()) return false;
               
               char temp = stack.pop();
               if((temp=='(' && array[i]==')')  || (temp=='[' && array[i]==']') || (temp=='{' && array[i]=='}'))
	               continue;
               else
            	   return false;
            }
        }
        if(!stack.isEmpty()) return false;
        
        return true;
    }
}