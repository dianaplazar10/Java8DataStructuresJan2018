package com.lambdas;

public class I_MethodReference {
//Passing a method call as a lambfa function definition as in --(a)
	public static void main(String[] args) {
		printMsg();
		Thread t = new Thread(()->printMsg()); //--(a)
		t.start();
		
		// --(a) is equivalent to calling the class's method, seperated by double :, like below:
		Thread t2 = new Thread(I_MethodReference::printMsg);
		t2.start();
	}
	
	public static void printMsg(){
		System.out.println("Hello");
	}

}
