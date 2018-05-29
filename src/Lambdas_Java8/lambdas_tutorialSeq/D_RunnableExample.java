package com.lambdas;

public class D_RunnableExample {

	public static void main(String[] args) {
		
		//--------an inline anonymous class(Runnable())----------------
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("print from RunnableExample");
				
			}
		});
		thread.run();
		//------------------------
		
		//The above steps is a classis case of creating a lambda
		
		//--------an inline lambda as an equivalent to the above----------------
		Thread thread2 = new Thread(()->System.out.println("print from RunnableExample"));
		thread2.run();
		//run is accepted as the methodName, as its a method with same method definition as the lambda in the line above, which is,... ()->System.out.println("print from RunnableExample")
	}

}
