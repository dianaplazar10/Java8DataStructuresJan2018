package com.other;

//refer: http://javarevisited.blogspot.com/2016/10/how-to-find-square-root-of-number-in-java-algorithm.html#more
import java.util.Scanner;

public class SqRootOfANum {

	public static float sqrt(int number) {
		if (number < 0)
			return -1;
		if (number == 0 || number == 1)
			return number;
		float start = 0.0f;
		float end = number;
		float precision = 0.001f;
		float middle = start;
		float difference = (float) Math.abs(Math.pow(middle, 2) - number);
		while (difference >= precision) {
			middle = (start + end) / 2.0f;
			if (Math.pow(middle, 2) > number) {
				end = middle;
			} else {
				start = middle;
			}
			difference = (float) Math.abs(Math.pow(middle, 2) - number);
		}
		return middle;
	}

	public static int root(int number) {
		if (number < 0)
			return -1;
		if (number == 0 || number == 1)
			return number;
		float root = 0.0f;
		float precision = 0.1f;
		float square = root;
		while (square < number) {
			root = root + precision;
			square = root * root;
		}
		return (int) root;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int userInputFloat = sc.nextInt();
		SqRootOfANum sqRoot = new SqRootOfANum();
//		System.out.println(sqRoot.sqrt(userInputFloat));
		System.out.println(sqRoot.root(userInputFloat));//Less PRECISION compared to above
	}

}
