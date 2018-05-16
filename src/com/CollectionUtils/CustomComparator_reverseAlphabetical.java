package com.CollectionUtils;

import java.util.Comparator;

//sort based on string length.. small to big
public class CustomComparator_reverseAlphabetical implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return -(s1.compareTo(s2)); 
		//while,  s1.compareTo(s2) returns 1 if alphabetical order of s1>s2 ==1, s1<s2 ==-1 and 0 otherwise
	}

}
