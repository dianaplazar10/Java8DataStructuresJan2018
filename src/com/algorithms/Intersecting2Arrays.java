package com.algorithms;

import java.util.HashSet;
import java.util.Set;

public class Intersecting2Arrays {
	public static void main(String[] args) {
	        char[] a = {'a', 'b', 'c', 'd'};
	        char[] b = {'c', 'd', 'e', 'f'};
	        System.out.println(intersect(a, b));
	    }
	
	    private static Set<Character> intersect(char[] a, char[] b) {
	        Set<Character> aSet = new HashSet<Character>();
	        Set<Character> intersection = new HashSet<Character>();
	        for (char c : a) {
	            aSet.add(c);
	        }
	        for (char c : b) {
	            if (aSet.contains(c)) {
	                intersection.add(c);
	            }
	        }
	        return intersection;
	    }
}

