package com.lambdas;

import java.util.Arrays;
import java.util.List;

public class K_Streams {

	public static void main(String[] args) {
//		 Streams : sequence of elements , supporting sequential and parallen aggregate operations
		
		List<E_Person> personsList = Arrays.asList(
				new E_Person("3afirst","3last",3),
				new E_Person("1afirst","1last",1),
				new E_Person("2first","2last",2),
				new E_Person("12first","12last",12)
				);
		
		//loop through the list and filter through with a condition and perform an operation
		
//		stream().FOREACH- takes in a consumer, example as below
		personsList.stream().
			forEach(System.out::println);// prints each list element
		
		System.out.println("-------------------------------------------------");
		
		
//		stream().FILTER- takes in a consumer, example as below
		personsList.stream().
			filter((p)->p.getLastName().startsWith("1")).
			forEach(System.out::println);
		
		System.out.println("-------------------------------------------------");
		
//		stream().FILTER.....COUNT- takes in a consumer, example as below
		int count = (int) personsList.stream().
			filter((p)->p.getLastName().startsWith("1")).
			count();	
		
		System.out.println(count);
		
	}

}
