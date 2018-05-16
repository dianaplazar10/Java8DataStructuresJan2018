package JUnitTesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class TS4_for_Timeout {

	@Test(timeout=1000)//1 sec = 1000 milliseconds
	public void test() {
		TS4_for_Timeout timeoutLoop = new TS4_for_Timeout();
		int testIntVar = timeoutLoop.isInfiniteLoop();
		assertEquals(8, testIntVar,0);//since timeout in annotation, if the method takes more than 1sec(1000 milliseconds) then test fails.
	}
	
	

	private int isInfiniteLoop() {
		int i =1;
		while(i==1) i=1;
		//the exception hits in teh above while().. 
		//n calls the timeout failure in teh test method
		return 8;
	}

}
