package com.lambdas;

public class E_Person {
	private String firstName;
	private String lastName;
	public E_Person(String string, String string2, int i) {
		this.firstName = string;
		this.lastName = string2;
		this.age=i;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private int age;
	
	@Override
	public String toString() {
//		return super.toString();
		return "Person[firstName:" + firstName + ". lastName: " +lastName +". age: " +age+"]";
	}

}
