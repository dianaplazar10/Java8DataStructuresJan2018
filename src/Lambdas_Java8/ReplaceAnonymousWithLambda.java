package Lambdas_Java8;
//Its a classic situation of using Lambda to replace 
//an anonymous class, with Only one method(a must condition)
public class ReplaceAnonymousWithLambda {
	
	public static void main(String[] args) {
		
		
		
		//Using Runnable anonymour inner class----------------------------------------------------------
		Thread thread = new Thread(new Runnable() {			
			@Override
			public void run() {
				System.out.println("run() executed from Runnable Anonymous inner class");
			}
		});
		//-----------------(A)----------------------------------------------------------
		
		
		thread.start();
		
		
		
		//Using Lambda function as a replacement for the Runnable anoynymous class-------------------------
		new Thread(()->System.out.println("contents as in run() method from Lambda expression")).start();
		//-----------------(B)----------------------------------------------------------
	}

}
