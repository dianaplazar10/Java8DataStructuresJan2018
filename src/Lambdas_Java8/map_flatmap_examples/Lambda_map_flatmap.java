package Lambdas_Java8.map_flatmap_examples;

//Reference link: https://www.javacodegeeks.com/2018/07/java-8-map-flatmap-examples.html

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lambda_map_flatmap {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<Employee>();
        
        employeeList.add(new Employee("name1",21,"Fremont","CA"));
        employeeList.add(new Employee("name2",22,"Fremont2","CA"));
        employeeList.add(new Employee("name3",23,"Fremont3","CA"));
        employeeList.add(new Employee("name4",24,"Fremont4","CA"));
        Set<String> cities = new HashSet<String>();
        for (Employee emp : employeeList) {
            cities.add(emp.getCity());
        }

        //Get all DISTINCT CITIES for the list of Employee objects
        List<String> citiesList = employeeList.stream()
                                          .map(Employee::getCity).collect(Collectors.toList());
//                                          .distinct()
//                                          .collect(Collectors.toList());
        try {
            Stream<String> lineStream = Files.lines(Paths.get("C:\\Work\\EclipseWorkspaces\\workspace_Mar22nd_2017\\Java8DataStructuresJan2018\\src\\Lambdas_Java8\\map_flatmap_examples\\data.txt"), Charset.defaultCharset());

            /*
             * Get List of ALL words in the document
             */
            List<String> wordStreamAll = lineStream.flatMap(line -> Arrays.stream(line.split(" ")))//.collect(Collectors.toList());
                                                   .distinct()
                                                   .collect(Collectors.toList());

            System.out.println(wordStreamAll.toString());
            /*
             * Get List of EACH LINE of strings, use Stream.map, Example above
             * else if you want ALL of the file, then user Stream.flatMap
             */
            //List<Stream<String>> wordStreamLinewise = lineStream.map(line -> Arrays.stream(line.split(" ")))
            //                                                      .collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }
        /*
         * flatMap() :
         * method which can be used to merge or flatten few streams into a single stream.
         */
    }
}
