package Lambdas_Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//Using Streams() in java8
public class Java8StreamsToPrintList {
	
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Gallen","Burchhill"),
				new Person("Allen","churchhill"),
				new Person("Alex","garten"),
				new Person("Sam","Batley"));
		
		people.stream()
			.filter(person-> person.firstName.startsWith("A"))
			.forEach(person->System.out.println(person));
		
		System.out.println("---------------------------------");
		
		int numberOfPplStartsWithA = 
				(int) people.stream()
					.filter(person-> person.firstName.startsWith("A"))
					.count();
		System.out.println(numberOfPplStartsWithA);
		
		System.out.println("--------METHOD REFERENCE, equivalent-----------");
		//Using Method reference to print all values in List
		printAllPeople(people,System.out::println);//System.out::println is same as person->System.out.println(person)
	}

	private static void printAllPeople(List<Person> people, Consumer<Person> consumer) {
		for (Person person: people) {
			consumer.accept(person);
		}
		
	}


}

