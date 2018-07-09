package Lambdas_Java8.map_flatmap_examples;

public class Employee {
    
    private String name;
    private Integer age;
    private String city;
    private String state; 
//    private Department department;
 
    public Employee() {
        // TODO Auto-generated constructor stub
    }
    
    public Employee( String name, Integer age, String city, String state){
        this.name = name;
        this.age=age;
        this.city=city;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}