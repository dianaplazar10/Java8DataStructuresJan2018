package Lambdas_Java8;


//LambdaInterface (or) Lambda Expression passed as Method Argument
public class PassingLambdaAsMethodArgument {
	
	void printGreeting(GreetingLambdaInterface greetingLambdaInterface){
		System.out.println(greetingLambdaInterface.printGreetingStrLength("hallo") );//print the length of string "hallo"
	}
	
	public static void main(String[] args) {	
		PassingLambdaAsMethodArgument plafp = new PassingLambdaAsMethodArgument();
		
		//Pass lambda Interface object as method argument
		GreetingLambdaInterface gli = s->s.length();
		plafp.printGreeting(gli);
		
		//(OR) pass the lambda expression as method argument
		
		plafp.printGreeting(s->s.length());
	}
}

interface GreetingLambdaInterface{
	int printGreetingStrLength(String s);
}
