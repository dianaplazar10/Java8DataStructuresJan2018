package com.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class E_passingLambdasOnMethCall {

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
		
		System.out.println("----------------------" +personsList);
		
		
		//create a method that prints all elements in the list
		printAll(personsList);
		
		//create a method that prints all people that have last name beginning with letter 'c'
		/*printLastNameStartsWithC(personsList, new Condition(){
			@Override
			public boolean test(E_Person p) {
				return p.getLastName().startsWith("C");
			}
			
		});*/
		
		printLastNameStartsWithC(personsList,(p)->p.getLastName().startsWith("C"));
		
	}


	//-(a) can be replaced with a lambda function. Refere slide #14
	private static void printAll(List<E_Person> personsList) {
		for(E_Person p : personsList){
			System.out.println(p.toString());
		}
	}
	
/*	private static void printLastNameStartsWithC(List<E_Person> personsList) {
		for(E_Person p : personsList){
			if(p.getLastName().startsWith("c") ||p.getLastName().startsWith("C")) // --(a)
				System.out.println(p.toString());
		}
	}
*/

	private static void printLastNameStartsWithC(List<E_Person> personsList, Condition condition) {
		for(E_Person p : personsList){
			if(condition.test(p)) // --(a)
				System.out.println(p.toString());
		}
	}
	
	//With the below interface defined, the method printLastNameStartsWithC() can be entirely removed
	// and replaced as above
	interface Condition{
		boolean test(E_Person p);
	}

}


//The method printLastNameStartsWithC can be modified to use Predicate over Condition, 
//which is a predefined lambda function in the 
//lang.util.function api, which removes the need to define the Lambda function Condition
/*private static void printLastNameStartsWithC(List<E_Person> personsList, Predicate pred) {
for(E_Person p : personsList){
	if(pred.test(p)) // --(a)
		System.out.println(p.toString());
}
}*/