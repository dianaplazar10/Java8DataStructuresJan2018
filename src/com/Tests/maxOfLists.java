package com.Tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class maxOfLists {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
			int a = sc.nextInt();
			int b=sc.nextInt();
			int k=sc.nextInt();
		int max = ReturnMax(n,a, b, k);
	}

	private static int ReturnMax(int n, int a, int b, int k) {
		List<Integer> list=new ArrayList<Integer>(Collections.nCopies(n, 0));
		for(int i =a;i<=b;i++){
			list.set(i,list.get(i) + k);
		}
		int max = list.stream().mapToInt(i -> i).max().getAsInt();
		return max;
	}

}
