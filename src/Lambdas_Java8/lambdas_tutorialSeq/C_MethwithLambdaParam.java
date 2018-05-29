package com.lambdas;

//Passing lambdaFunction as method param
//This is s TypeInference example, as 
public class C_MethwithLambdaParam {

	public static void main(String[] args) {
//		StringLenLambdaInterface slli = (s)->s.length();
//		 System.out.println(slli.getLenth("stringOne"));
//		(OR)
		
		printStrLen(s->s.length());// --(a)
	}
	
	static void printStrLen(StringLenLambdaInterface lambdafunc){
		System.out.println(lambdafunc.getLenth("HelloWorld"));
	}
	
	interface StringLenLambdaInterface{
		int getLenth(String str); // --(b)
	}

}

//OUTPUT:
//10

//So, whats happening here is, the method of lambda at (b) is defined at (a)..
//ie, since its not explicitly saying what the lambda function definition at call in (a), its inferred to be (b)