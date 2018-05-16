package com.Tests;

import java.util.Stack;

//refer: http://www.geeksforgeeks.org/expression-evaluation/
//refer2: http://www.programcreek.com/2014/06/leetcode-basic-calculator-java/

//Implement a basic calculator to evaluate a simple expression string

/*
String contains only non-negative integers, +, -, *, / operators and empty spaces. The integer division should truncate toward zero
You may assume the given expression is always valid
*/

/*
Examples:
""3+2*2- = 6
"" 8/3  = 2
" 3+5 / 2 " = 5
*/

//Implement a basic calculator to evaluate a simple expression string


public class SimpleStrExpressioCalc{
 public static void main(String[] args)
 {
//     String str = "3+2*c2-6/4ab";
//     String noLetterStr = str.replaceAll("[a-zA-Z]", "");//32*2-6/4
//     String noLetterStr = str.replaceAll("[^a-zA-Z]", "");//cab
	 
	 String str = "3+2*2-6/4";
     SimpleStrExpressioCalc srcCal = new SimpleStrExpressioCalc();
     int answer = srcCal.evalStrExp(str);
 }
 
 
 public int evalStrExp(String str)
 {
     str = str.replaceAll(" ","");//Remove whiteSpaces
     
     Stack<Character> operators = new Stack<Character>();//operators
     Stack<Integer> values = new Stack<Integer>();//integers
     int value=0;
     char[] arr = str.toCharArray();
     for(int i=0;i<arr.length;i++)
     {
         // "45+78*90/32"
         // 32, 90, 78, 45 
         // /, *, +
         
         //if number, push to Number stack
         if(arr[i]>='0' && arr[i]<'9')
         {
             StringBuffer strBuf = new StringBuffer();
             while(i<arr.length && arr[i]>='0' && arr[i]<='9')
                 strBuf.append(arr[i++]);//handles number with more than 1 digit
             values.push(Integer.parseInt(strBuf.toString()));
         }
         else if(arr[i]=='+'||arr[i]=='-'||arr[i]=='*'||arr[i]=='/' )
         {
             values.push(performEval(operators.pop(), values.pop(),values.pop()));
         }
     }
	return value;
     
     // 90 / 32 * 78 + 45
 }
 
 
 public int performEval(char operator,int operand1, int operand2)
 {
     switch(operator)
     {
         case '+' : return (operand1+operand2);
         case '-' : return (operand1-operand2);
         case '*' : return (operand1*operand2);
         case '/' : return (operand1/operand2);
     }
     return 0;
 }
 
 
 
}












//..................
//if(arr[i]=='*')// * / %+ - 
//         {
//             stack.push(arr[i-1]);
//             stack.push(arr[i]);
//             stack.push(arr[i+1]);
//             value = performEval(stack);
//             stack.push(value);
//         }
//         if(arr[i]=='*')// * / %+ - 
//         {
//             stack.push(arr[i-1]);
//             stack.push(arr[i]);
//             stack.push(arr[i+1]);
//             value = performEval(stack);
//         }
