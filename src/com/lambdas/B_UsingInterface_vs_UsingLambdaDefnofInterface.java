package com.lambdas;

//INCOMPLETE

public class B_UsingInterface_vs_UsingLambdaDefnofInterface {

	public static void main(String[] args) {
		
		Print_LambdaInterface p_li = ()->System.out.println("print from lambda interface");
		p_li.foo2();
		
		A_Child_PrintInterfaceImpl c_pli = new A_Child_PrintInterfaceImpl();
		c_pli.foo2();
		
		//Both can be used the same way.
		//Now, lets see implementing the lambda as an abstract class
		A_Print_RegularInterface p_li2 = new A_Print_RegularInterface() {
			
			@Override
			public void foo2() {
				System.out.println("print from Print_RegularInterface");				
			}
		};
		
		B_UsingInterface_vs_UsingLambdaDefnofInterface ui_vs_uld = new B_UsingInterface_vs_UsingLambdaDefnofInterface();
//		ui_vs_uld.(p_li);
	}
	
	void printhere(A_Print_RegularInterface p_ri){
		p_ri.foo2();
	}
}

interface Print_LambdaInterface {
	void foo2();

}
