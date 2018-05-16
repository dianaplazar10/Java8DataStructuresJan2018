package com.DS;

/*
 * Whats a stack? What operations can be performed on it?
 * Ans: FILO(First in Last Out) datastructure 
 * With 3 main operations,
 * 1)push(add(arr(++top))) 
 * 2)pop( remove(arr(top--)) 
 * 3)peek(displayTopMost element(arr(top))
 * 
 * stack is EMPTY if (top==-1)
 * stack is FULL if(top==maxSize-1)
 * Refer: https://www.careercup.com/question?id=5665746450382848
 */

public class stackOperations {
	private int arr[];
	private int maxSize;
	private int top = -1;
	//private int bottom = 0;
	
	stackOperations(int s){
		maxSize = s;
		arr = new int[maxSize];
		top = -1;
	}
	
	public void push(int elm){
		arr[++top] = elm;
	}
	
	public int pop(){
		return arr[top--];
	}
	
	public int peekArray(){
		return arr[top];
	}
	
	public boolean isEmpty(){
		return (top == -1);
	}
	
	public boolean isFull(){
		return (top == maxSize-1);
	}
	
	
	public static void main(String args[]){
		stackOperations stack = new stackOperations(5);
		stack.push(10);
		stack.push(12);
		stack.push(13);
		stack.push(15);
		stack.push(14);
		while(!stack.isEmpty()){
			System.out.println(stack.pop());
			if(stack.isEmpty()) ;//do othing
			else System.out.println(stack.peekArray());
			System.out.println();
		}
		
	}
}
