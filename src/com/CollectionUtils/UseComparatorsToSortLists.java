package com.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.CustomObjects.Person;

public class UseComparatorsToSortLists {

	public static void main(String[] args) {
		
//		sortListOfString();
//		sortListOfIntegers();
//		sortListOfObjectsUsingId();
		sortListOfObjectsUsingName();
	}

	private static void sortListOfString() {
		List<String> listOfAnimals = new ArrayList<String>();
		
		listOfAnimals.add("dog");
		listOfAnimals.add("cat");
		listOfAnimals.add("ant");
		listOfAnimals.add("zebra");
		
		System.out.println("withoutSorting>>>>>>>>>>");
		System.out.println("listOfAnimals : "+listOfAnimals);
		
		Collections.sort(listOfAnimals, new CustomComparator_reverseAlphabetical());
		System.out.println("withoutSorting>>>>>>>>>>");
		System.out.println("listOfAnimals : "+listOfAnimals);
	}
	//Output:
	/*withoutSorting>>>>>>>>>>
	listOfAnimals : [dog, cat, ant, zebra]
	withoutSorting>>>>>>>>>>
	listOfAnimals : [ant, cat, dog, zebra]*/
	
	//with Custome Comparator:
	/*withoutSorting>>>>>>>>>>
	listOfAnimals : [dog, cat, ant, zebra]
	withoutSorting>>>>>>>>>>
	listOfAnimals : [zebra, dog, cat, ant]*/

	private static void sortListOfIntegers() {
		List<Integer> listOfIntegers = new ArrayList<Integer>();
		
		listOfIntegers.add(1);
		listOfIntegers.add(23);
		listOfIntegers.add(3);
		listOfIntegers.add(84);
		
		System.out.println("withoutSorting>>>>>>>>>>");
		System.out.println("listOfIntegers : "+listOfIntegers);
		
		Collections.sort(listOfIntegers);
		System.out.println("withoutSorting>>>>>>>>>>");
		System.out.println("listOfAnimals : "+listOfIntegers);
	}
	//Output:
	/*withoutSorting>>>>>>>>>>
	listOfIntegers : [1, 23, 3, 84]
	withoutSorting>>>>>>>>>>
	listOfAnimals : [1, 3, 23, 84]*/
	
	
	private static void sortListOfObjectsUsingId(){
		List<Person> listOfPersons = new ArrayList<Person>();
		
		listOfPersons.add(new Person(23, "p23name"));
		listOfPersons.add(new Person(1, "p1name"));
		listOfPersons.add(new Person(40, "p40name"));
		listOfPersons.add(new Person(84, "p84name"));
		
		System.out.println("withoutSorting>>>>>>>>>>");
		for (int i = 0; i < listOfPersons.size(); i++) {			
			System.out.println("listOfPersons : "+listOfPersons.get(i).getName() + ",");
		}
		
		Collections.sort(listOfPersons, new Comparator<Person>(){
				public int compare(Person p1, Person p2)
				{
					if(p1.getId()<p2.getId()) return -1;
					else if(p1.getId()>p2.getId()) return 1;
					else
					return 0;
					
				}
				}
				);
		System.out.println("withoutSorting>>>>>>>>>>");
		for (int i = 0; i < listOfPersons.size(); i++) {			
			System.out.println("listOfPersons : "+listOfPersons.get(i).getName() + ",");
		}
	}
	//Output:
	/*withoutSorting>>>>>>>>>>
	listOfPersons : p23name,
	listOfPersons : p1name,
	listOfPersons : p40name,
	listOfPersons : p84name,
	withoutSorting>>>>>>>>>>
	listOfPersons : p1name,
	listOfPersons : p23name,
	listOfPersons : p40name,
	listOfPersons : p84name,*/
	
	private static void sortListOfObjectsUsingName(){
		List<Person> listOfPersons = new ArrayList<Person>();
		
		listOfPersons.add(new Person(23, "p23name"));
		listOfPersons.add(new Person(1, "p1name"));
		listOfPersons.add(new Person(40, "p40name"));
		listOfPersons.add(new Person(84, "p84name"));
		
		System.out.println("withoutSorting>>>>>>>>>>");
		for (int i = 0; i < listOfPersons.size(); i++) {			
			System.out.println("listOfPersons : "+listOfPersons.get(i).getName() + ",");
		}
		
		Collections.sort(listOfPersons, new Comparator<Person>(){
				public int compare(Person p1, Person p2)
				{
					return p1.getName().compareTo(p2.getName());
					
				}
				}
				);
		System.out.println("withoutSorting>>>>>>>>>>");
		for (int i = 0; i < listOfPersons.size(); i++) {			
			System.out.println("listOfPersons : "+listOfPersons.get(i).getName() + ",");
		}
	}
	//Output:
	/*withoutSorting>>>>>>>>>>
	listOfPersons : p23name,
	listOfPersons : p1name,
	listOfPersons : p40name,
	listOfPersons : p84name,
	withoutSorting>>>>>>>>>>
	listOfPersons : p1name,
	listOfPersons : p23name,
	listOfPersons : p40name,
	listOfPersons : p84name,*/
}


//Collections.sort(listOfAnimals); -- > used to sort any List Implementation

//Custom Sorting can be achieved by adding a custom comparator(a class that implements 
//the Comparator Interface n implements compare() )
//And as a next step, add that as another attribute to
//Collections.sort(listOfAnimals,new MyCustomComparator)

//compareTo() is a method of Comparable Interface. used to compare 2 strings. s1.compareTo(s2) --> ro sort strings in alphabetical order
//This method is used while creating our custom Comparator class, within the compare() method implementation