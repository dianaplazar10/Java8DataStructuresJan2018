package com.other;


//This example caches the intermediate fib values, since cached, O[n]
//Page -52 i CCI

public class CCI_fibonacci_withCache {

	public CCI_fibonacci_withCache() {}
	
	private int valAtNthLocationInfibonacci(int n,int cache[]){
		if(n==0) return 0;
		else if(n==1) return 1;
		else if(cache[n]>0) return cache[n];
		else {
			cache[n]=valAtNthLocationInfibonacci(n-1,cache)+valAtNthLocationInfibonacci(n-2,cache);
			return cache[n];
		}			
	}
	
	public static void main(String[] args) {
		CCI_fibonacci_withCache fibClass=new CCI_fibonacci_withCache();
		int n =3;
		int[] cache = new int[n+1];
		for (int i = 0; i < n; i++) {
			System.out.println(fibClass.valAtNthLocationInfibonacci(i, cache));
		}
	}

}

//If no cache, as in below, the time complexity is = O[2^n]

class CCI_fibonacci_withOutCache {

	public CCI_fibonacci_withOutCache() {}
	
	private int valAtNthLocationInfibonacci(int n){//,int cache[]){
		if(n==0) return 0;
		else if(n==1) return 1;
//		else if(cache[n]>0) return cache[n];
		else {
//			cache[n]=valAtNthLocationInfibonacci(n-1,cache)+valAtNthLocationInfibonacci(n-2,cache);
//			return cache[n];
			return valAtNthLocationInfibonacci(n-1)+valAtNthLocationInfibonacci(n-2);	
		}			
	}
	
	public static void main(String[] args) {
		CCI_fibonacci_withOutCache fibClass=new CCI_fibonacci_withOutCache();
		int n =3;
//		int[] cache = new int[n+1];
		for (int i = 0; i < n; i++) {
			System.out.println(fibClass.valAtNthLocationInfibonacci(i));//, cache));
		}
	}

}
