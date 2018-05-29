package Lambdas_Java8;
//refer:https://www.javacodegeeks.com/2018/05/using-java-stream-summary-statistics.html
//    IntSummaryStatistics API
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class IntSummaryStats {

    public static void main(String[] args) {
        List<Person2> list = Arrays.asList(
                new Person2("John Blue", 28),
                new Person2("Anna Brown", 53),
                new Person2("Paul Black", 47)
        );

        int min = list.stream()
                .mapToInt(Person2::getAge)
                .min()
                .orElseThrow(NoSuchElementException::new);

        int max = list.stream()
                .mapToInt(Person2::getAge)
                .max()
                .orElseThrow(NoSuchElementException::new);

        System.out.println("min of age: " + min);
        System.out.println("max of age: " + max);
    }

}

class Person2 {

    String name="";
    int age;
    public Person2(String name, int age) {
        this.name=name;
        this.age=age;
    }
    
    public int getAge(){
        return this.age;
    }


}