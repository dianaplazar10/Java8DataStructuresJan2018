package com.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class I_MethodReference2 {
	
		public static void main(String[] args) {
			List<E_Person> personsList = Arrays.asList(
					new E_Person("3afirst","3last",3),
					new E_Person("1afirst","1last",1),
					new E_Person("2first","2last",2),
					new E_Person("12first","12last",12)
					);
			
//			printAll(personsList, p -> System.out.println(p.toString())); // --(1)
			//In our previous example, we call a static method of a class,like in I_MethodReference2 --(a): 
			//here, we are calling a non-static method of a class. Class being 'System'
			//hence here --(1) can also be written as:
			printAll(personsList, System.out::println);
			System.out.println("----------------------" );
		}


		//-(a) can be replaced with a lambda function. Refere slide #14
		private static void printAll(List<E_Person> personsList, Consumer consumer) {
			for(E_Person p : personsList){
				consumer.accept(p);
			}
		}
	}
