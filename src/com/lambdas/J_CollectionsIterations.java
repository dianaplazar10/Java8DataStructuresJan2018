package com.lambdas;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class J_CollectionsIterations {

	public static void main(String[] args) {
		List<E_Person> personsList = Arrays.asList(
				new E_Person("3afirst","3last",3),
				new E_Person("1afirst","1last",1),
				new E_Person("2first","2last",2),
				new E_Person("12first","12last",12)
				);
	
		//USING For loop:
		for (int i =0;i<=personsList.size();i++) {
			System.out.println(personsList.get(i));
		}
		
		//USING For In/For each loop:
		for(E_Person p :personsList){
			System.out.println(p);
		}
		
		//USING internal iterators, giving them the control, rather than controlling it ourselves.. as in upto how many iterations, etc
//		personsList.forEach(p->System.out.println(p));
//		(or)
		personsList.forEach(System.out::println);
		//foreach takes in a Consumer, meaning... perform something on what is consumed.So here,each item in the personList is consumed ;
	}

}
