package com.lambdas;

public class H_thisReference {

	public static void main(String[] args) {

//refer slide # 20
		//this reference from within an inner class refers to the inner class. 
		//and it is possible to use 'this' even inside a static method, from within an inner class in that static method.
		
		//however, reference to this in a lambda, refers to the enclosed class. 
		//'this' can be used in a lambda definition from within a non-static method
	}

}
