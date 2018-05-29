package com.lambdas;

public class A_lambdasMain {

	public static void main(String[] args) {
//		MyLambda myLambda = ()->	System.out.println("print from first Lambda function");
//		PrintLambdaInterface myLambda = () -> System.out.println("print from first Lambda function"); //--(a)
	}

}

//either write an interface with methods that match the lambda function operation as in the code above,

//interface MyLambda{
//	void foo();	
//}

//else, it would be sufficient to even use an existing interface(PrintLambdaInterface),
//with the matching method definition,
//but, its needs to have JUST ONE UNIMPLEMENTED METHOD, with same signature as the expression in --(a)

//meaning, the definition of a lambda should be only of a "FUNCTIONAL INTERFACE"
