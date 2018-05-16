package com.DS;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class DS_Queues {
	// (head) <-- ooooooo <- (tAil)
	//FIFO
	public static void main(String[] args) {
	
		Queue<Integer> queInt = new ArrayBlockingQueue<Integer>(3);
		queInt.add(10);
		queInt.add(20);
		queInt.add(30);
		try{
		queInt.add(10);// thorws an illegal State exception as it exceeds the capacity
		}
		catch(IllegalStateException exp){
			System.out.println(exp.toString());
		}
		
		Queue<Integer> queInt2 = new ArrayBlockingQueue<Integer>(3);
		queInt2.add(120);
		queInt2.add(220);
		queInt2.add(320);
		
		if(queInt2.offer(420) == false)
			System.err.println("Offer failed to add");
}
}


//.offer() --> if.add is replaced with .offer, and if the size exceeds the capacity, no exception is thrown.
//.poll() --> if . remove replaced with .pull(), and if returns null, no exception is thrown
//.peek() --> returns the last added item if the queue is not null, else returns null