package Lambdas_Java8;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Person {

    public Person() {
        // TODO Auto-generated constructor stub
    }
    
    public Person(String name,Date birthday,Sex gender,String emailAddress, int age) {
        this.emailAddress=emailAddress;
        this.gender=gender;
        this.name=name;
        this.age=age;
    }
    
    public enum Sex {
        MALE, FEMALE
    }

    String name;
    Date birthday;
    Sex gender;
    String emailAddress;
    int age=0;
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getBirthday() {
        return birthday;
    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    public Sex getGender() {
        return gender;
    }
    public void setGender(Sex gender) {
        this.gender = gender;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public static List<Person> createRoster() {
        List<Person> personsList = new ArrayList<Person>();
        personsList.add(new Person("name1", new Date(), Sex.FEMALE, "female1@gmail.com",20));
        personsList.add(new Person("name2", new Date(), Sex.MALE, "male1@gmail.com",23));
        personsList.add(new Person("name3", new Date(), Sex.FEMALE, "female2@gmail.com",24));
        personsList.add(new Person("name4", new Date(), Sex.MALE, "male2@gmail.com",25));
        return personsList;
    }

    public void printPerson() {
        System.out.println(this.name + ":" + this.emailAddress);
    }
    
   
}