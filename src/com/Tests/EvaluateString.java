package com.Tests;

/*
 * refe: https://gist.github.com/beginor/94c426cccc6d3c6ebb5543421acf6699
 * 
 *  A Java program to evaluate a given expression where tokens are separated 
by space.
Test Cases:
	"10 + 2 * 6"		 ---> 22
	"100 * 2 + 12"		 ---> 212
	"100 * ( 2 + 12 )"	 ---> 1400
	"100 * ( 2 + 12 ) / 14" ---> 100 
*/
import java.util.Stack;

public class EvaluateString
{
	public static int evaluate(String expression)
	{
		char[] tokens = expression.toCharArray();

		// Stack for numbers: 'values'
		Stack<Integer> values = new Stack<Integer>();

		// Stack for Operators: 'ops'
		Stack<Character> ops = new Stack<Character>();

		for (int i = 0; i < tokens.length; i++)
		{
			// Current token is a whitespace, skip it
			if (tokens[i] == ' ')
				continue;

			// Current token is a number, push it to stack for numbers
			if (tokens[i] >= '0' && tokens[i] <= '9')
			{
				StringBuffer sbuf = new StringBuffer();
				// There may be more than one digits in number, so 
				//append to a strbuf and 
				//increment i++, as you append
				//also, check for valid token index within while.
				while (i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9')
					sbuf.append(tokens[i++]);
				values.push(Integer.parseInt(sbuf.toString()));
			}

			// Current token is an opening brace, push it to 'ops'
			else if (tokens[i] == '(')
				ops.push(tokens[i]);

			// Closing brace encountered, solve entire brace
			else if (tokens[i] == ')')
			{
				while (ops.peek() != '(')
				values.push(applyOp(ops.pop(), values.pop(), values.pop()));
				ops.pop();
			}

			// Current token is an operator.
			else if (tokens[i] == '+' || tokens[i] == '-' ||
					tokens[i] == '*' || tokens[i] == '/')
			{
				// While top of 'ops' has same or greater precedence to current
				// token, which is an operator. Apply operator on top of 'ops'
				// to top two elements in values stack
				while (!ops.empty() && hasPrecedence(tokens[i], ops.peek()))
				values.push(applyOp(ops.pop(), values.pop(), values.pop()));

				// Push current token to 'ops'.
				ops.push(tokens[i]);
			}
		}

		// Entire expression has been parsed at this point, apply remaining
		// ops to remaining values
		while (!ops.empty())
			values.push(applyOp(ops.pop(), values.pop(), values.pop()));

		// Top of 'values' contains result, return it
		return values.pop();
	}

	// Returns true if 'op2' has higher or same precedence as 'op1',
	// otherwise returns false.
	public static boolean hasPrecedence(char op1, char op2)
	{
		if (op2 == '(' || op2 == ')')
			return false;
		if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
			return false;
		else
			return true;
	}

	// A utility method to apply an operator 'op' on operands 'a' 
	// and 'b'. Return the result.
	public static int applyOp(char op, int b, int a)
	{
		switch (op)
		{
		case '+':
			return a + b;
		case '-':
			return a - b;
		case '*':
			return a * b;
		case '/':
			if (b == 0)
				throw new
				UnsupportedOperationException("Cannot divide by zero");
			return a / b;
		}
		return 0;
	}

	// Driver method to test above methods
	public static void main(String[] args)
	{
		System.out.println(EvaluateString.evaluate("10 + 2 * 6"));
		System.out.println(EvaluateString.evaluate("100 * 2 + 12"));
		System.out.println(EvaluateString.evaluate("100 * ( 2 + 12 )"));
		System.out.println(EvaluateString.evaluate("100 * ( 2 + 12 ) / 14"));
	}
}

//---------------------------------------------------------------------
//package com.Tests;
//
//import java.util.Stack;

////refer: http://www.geeksforgeeks.org/expression-evaluation/
////refer2: http://www.programcreek.com/2014/06/leetcode-basic-calculator-java/
//
////Implement a basic calculator to evaluate a simple expression string
//
///*
//String contains only non-negative integers, +, -, *, / operators and empty spaces. The integer division should truncate toward zero
//You may assume the given expression is always valid
//*/
//
///*
//Examples:
//""3+2*2- = 6
//"" 8/3  = 2
//" 3+5 / 2 " = 5
//*/
//
////Implement a basic calculator to evaluate a simple expression string


//public class SimpleStrExpressioCalc{
// public static void main(String[] args)
// {
////     String str = "3+2*c2-6/4ab";
////     String noLetterStr = str.replaceAll("[a-zA-Z]", "");//32*2-6/4
////     String noLetterStr = str.replaceAll("[^a-zA-Z]", "");//cab
//	 
//	 String str = "3+2*2-6/4";
//     SimpleStrExpressioCalc srcCal = new SimpleStrExpressioCalc();
//     int answer = srcCal.evalStrExp(str);
// }
// 
// 
// public int evalStrExp(String str)
// {
//     str = str.replaceAll(" ","");//Remove whiteSpaces
//     
//     Stack<Character> operators = new Stack<Character>();//operators
//     Stack<Integer> values = new Stack<Integer>();//integers
//     int value=0;
//     char[] arr = str.toCharArray();
//     for(int i=0;i<arr.length;i++)
//     {
//         // "45+78*90/32"
//         // 32, 90, 78, 45 
//         // /, *, +
//         
//         //if number, push to Number stack
//         if(arr[i]>='0' && arr[i]<'9')
//         {
//             StringBuffer strBuf = new StringBuffer();
//             while(i<arr.length && arr[i]>='0' && arr[i]<='9')
//                 strBuf.append(arr[i++]);//handles number with more than 1 digit
//             values.push(Integer.parseInt(strBuf.toString()));
//         }
//         else if(arr[i]=='+'||arr[i]=='-'||arr[i]=='*'||arr[i]=='/' )
//         {
//        	 operators.push(arr[i]);
//             values.push(performEval(operators.pop(), values.pop(),values.pop()));
//         }
//     }
//	return value;
//     
//     // 90 / 32 * 78 + 45
// }
// 
// 
// public int performEval(char operator,int operand1, int operand2)
// {
//     switch(operator)
//     {
//         case '+' : return (operand1+operand2);
//         case '-' : return (operand1-operand2);
//         case '*' : return (operand1*operand2);
//         case '/' : return (operand1/operand2);
//     }
//     return 0;
// }
// 
// 
// 
//}












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
