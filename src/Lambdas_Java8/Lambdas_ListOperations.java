package Lambdas_Java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Lambdas_ListOperations {
	
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Gallen","Burchhill"),
				new Person("Allen","churchhill"),
				new Person("Alex","garten"),
				new Person("Sam","Batley"));
		
		//sortListWithCustomComparator(people);
//		Collections.sort(people,new Comparator<Person>(){			
//			@Override
//			public int compare(Person person1, Person person2) {
//				return person1.firstName.compareTo(person2.firstName);
//			};			
//		});
		//(OR)
		//sortListWithLambda
		Collections.sort(people,(person1,person2)-> person1.firstName.compareTo(person2.firstName));
		
		
//		System.out.println("-----------------PRINT all regular method");
		//printAllFromList(people);
//		for(Person person : people){
//			System.out.println(person.firstName);
//		}
		//(OR)
		System.out.println("-----------------PRINT all using Lambdas");
		printAllFromListUsingLambdas(people,(person1)->System.out.println(person1.firstName));
		
		
//		System.out.println("-----------------PRINT firstNames Startign with A");
//		printConditionally(people);
		//(OR)
		System.out.println("-----------------PRINT firstNames Startign with A,using LAMBDAS");
		printConditionallyUsingLambdas(people,
										person1->person1.firstName.startsWith("A"),
											person1->System.out.println(person1.firstName));
	}

	private static void printConditionallyUsingLambdas(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
		for(Person person1 : people){
			if(predicate.test(person1)) consumer.accept(person1);
		}
	}

	private static void printAllFromListUsingLambdas(List<Person> people, Consumer<Person> consumer) {
		for(Person person : people)
		{
			consumer.accept(person);
		}		
	}
	
	private static void printConditionally(List<Person> people) {
		for(Person person : people){
			if(person.firstName.startsWith("A")) System.out.println(person.firstName);
		}
	}
}

class Person{
	String firstName;
	String lastName;
	
	public Person(String firstName,String lastName) {
		this.firstName = firstName;
		this.lastName=lastName;
	}
	
	@Override
	public String toString() {
		return this.firstName+" "+this.lastName;
	}
}
