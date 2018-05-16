package com.other;

public class MATH_api {
	public static void main(String[] args) {
		System.out.println("Math.E		:" +Math.E);
		System.out.println("Note==>returns number closer to another other natural logs");
		System.out.println("--------------------------------------------------------------");
		System.out.println("Math.PI		:" +Math.PI);
		System.out.println("--------------------------------------------------------------");
		
		System.out.println("Math.addExact(3, -7)		:" +Math.addExact(3,-7)+"	//adds arguments");
		System.out.println("Math.subtractExact(3,-7)	:" +Math.subtractExact(3,-7)+"	//subtracts arguments");
		System.out.println("Math.decrementExact(4)		:" +Math.decrementExact(4) +"	//decrement argument by 1");
		System.out.println("Math.incrementExact(4)		:" +Math.incrementExact(4)+":	//increments argument by 1");		
		System.out.println("Math.multiplyExact(3,4)		:" +Math.multiplyExact(3,4));		
		System.out.println("Math.negateExact(3)		:" +Math.negateExact(3));
		System.out.println("--------------------------------------------------------------");
		System.out.println("Math.cbrt(8)	:" +Math.cbrt(8));
		System.out.println("Math.sqrt(4)	:" +Math.sqrt(4));
		System.out.println("Math.abs(-32.54536)	:" +Math.abs(-32.54536) + "	//removes negation");
		System.out.println("Math.max(34, 34.2)	:" +Math.max(34, 34.2));
		System.out.println("Math.min(34, 34.2)	:" +Math.min(34, 34.2));
		System.out.println("Math.nextAfter(3, 5)	:" +Math.nextAfter(3, 5) + " ://returns closed of the first towards teh second");
		System.out.println("Math.pow(2, 3)	:" +Math.pow(2, 3));
		System.out.println("Math.random()	:" +Math.random());
		System.out.println("Math.round(3.569)	:" +Math.round(3.569));
		System.out.println("Math.rint(5.6)	:" +Math.rint(5.6));
		System.out.println("--------------------------------------------------------------");
		System.out.println("Math.ceil(3.4) :" +Math.ceil(3.4));
		System.out.println("Math.floor(3.4)	:" +Math.floor(3.4));
		System.out.println();
		System.out.println("Math.floorDiv(4, 3)	:" +Math.floorDiv(4, 3));
		System.out.println("Note==>returns [Math.floor(4/3)].. applies to int /long");
		System.out.println();
		System.out.println("Math.floorMod(4, 3)	:" +Math.floorMod(4, 3));
		System.out.println("Note==>returns [ 4 - (floorDiv(4,3) * 4) ] ");
		System.out.println("--------------------------------------------------------------");
		
		System.out.println("Math.copySign(30.34, -89.1)	:" +Math.copySign(30.34, -89.1));
		System.out.println();
		System.out.println("Note==>returns 1st argument with sign of 2nd ");
		System.out.println("--------------------------------------------------------------");
		
		System.out.println("Math.exp(1)	:" +Math.exp(1));
		System.out.println("Note==>*returns Eulers number(2.7182...Math.E) raised to power of argument");
		System.out.println();
		System.out.println("Math.expm1(1)	:" +Math.expm1(1));
		System.out.println("Note==>returns (Math.exp(argument) -1).. so, above.. returns (2.718...-1)");
		System.out.println("--------------------------------------------------------------");
		
		
		System.out.println("Math.hypot(3, 4)	:" +Math.hypot(3, 4) + "//returns [ sqroot (3^2 + 4^2) ] ");

		System.out.println("--------------------------------------------------------------");
		
		System.out.println("Math.getExponent(3)	:" +Math.getExponent(3));
		System.out.println("--------------------------------------------------------------");
		System.out.println("Math.log10(1)	:" +Math.log10(1));
		System.out.println("Math.log(2) : Math.log(1) ; -->" +Math.log(2) +":"+ Math.log(1));
		System.out.println("--------------------------------------------------------------");

	}

}
