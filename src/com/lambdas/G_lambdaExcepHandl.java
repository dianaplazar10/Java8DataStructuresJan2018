package com.lambdas;

import java.util.function.BiConsumer;

public class G_lambdaExcepHandl {
	
	public static void main(String[] args) {
		int[] scorenumbers = {1,2,3,4};
		int key=0;
		
		process(scorenumbers, key, (v,k)->System.out.println(v/k));
	}

	private static void process(int[] scorenumbers, int operation, BiConsumer<Integer, Integer> biconsumer) {
		for(int i : scorenumbers){
			biconsumer.accept(i, operation);
		}
		
	}
	
	private static BiConsumer<Integer, Integer> process( BiConsumer<Integer, Integer> biconsumer) {
		return (v,k)-> {
			try{
				biconsumer.accept(v,k);
			} catch(Exception ex) {
				System.out.println(ex.getMessage());
			}
		};
	}

}
