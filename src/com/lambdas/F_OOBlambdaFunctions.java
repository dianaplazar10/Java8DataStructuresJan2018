package com.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class F_OOBlambdaFunctions {

	public static void main(String[] args) {
		List<E_Person> personsList = Arrays.asList(
				new E_Person("3afirst","3last",3),
				new E_Person("1afirst","1last",1),
				new E_Person("2first","2last",2),
				new E_Person("12first","12last",12)
				);
		
		//sort list by last name, ie.. custom ordering
		/*Collections.sort(personsList, new Comparator<E_Person>() {

			@Override
			public int compare(E_Person o1, E_Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});*/
		
		//Similarly, using Collections.sort for sorting the list can be done without new Comprataor,using a lambda as code below that
		Collections.sort(personsList, (p1,p2)->p1.getLastName().compareTo(p2.getLastName()));
		
		System.out.println("----------------------");
		
		
		//create a method that prints all elements in the list
		printAll(personsList, p -> System.out.println(p.toString()));
		System.out.println("----------------------" );
		
		
		printLastNameStartsWithC(personsList,(p)->((E_Person) p).getLastName().startsWith("1"), p -> System.out.println(p.toString()));
		
	}


	//-(a) can be replaced with a lambda function. Refere slide #14
	private static void printAll(List<E_Person> personsList, Consumer consumer) {
		for(E_Person p : personsList){
			consumer.accept(p);
		}
	}
	
	private static void printLastNameStartsWithC(List<E_Person> personsList, Predicate predicate, Consumer consumer) {
		for(E_Person p : personsList){
			if(predicate.test(p)) // --(a)
				consumer.accept(p);;
		}
	}

}