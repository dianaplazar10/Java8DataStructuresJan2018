package Lambdas_Java8;

public class Lambdas {
	
	public static void main(String[] args) {
		
		PrintHalloLambdaInterface halloVarLambda = ()->System.out.println("hello");//	 --(A)
		halloVarLambda.PrintHalloMethod();
		
		AddParamsLambdaInterface addParams = (int a, int b)->a+b;// --(B)
		System.out.println(addParams.PrintSum(2, 3));
		
		StringLengthLambdaInterface strLenLambda = s ->s.length();//(String s)->s.length();//	 --(C)
		System.out.println(strLenLambda.PrintStrLength("StringLength"));
	}
	

	//Note on Lambda interface definitions:
	//A LambdaInterface can have only one abstract method(Functional Interface) that matches the lambda 
	 interface PrintHalloLambdaInterface{
		  void PrintHalloMethod(); //param not taken or returns- implemented body in --(A)
		}
	
	 interface AddParamsLambdaInterface{
	  int PrintSum(int a, int b);//2 int params taken and returns an int- implemented body in - --(B)
	}
 
	 interface StringLengthLambdaInterface{
		  int PrintStrLength(String str);//TYPE INFERENCE - Replacing "String s" with just "s" is valid in --(C)
		}
}
