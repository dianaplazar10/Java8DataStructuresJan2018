package Lambdas_Java8.filter_examples;

//Reference link: https://www.javacodegeeks.com/2018/07/filter-method-java-8.html

public class Dish {

    private String name;
    private Boolean vegetarian;
    private Integer calaries;
    private Type type;

    public Dish(String name, Boolean vegitarian, Integer calaries, Type type) {
         super();
         this.name = name;
         this.vegetarian = vegitarian;
         this.calaries = calaries;
         this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(Boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public Integer getCalaries() {
        return calaries;
    }

    public void setCalaries(Integer calaries) {
        this.calaries = calaries;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public enum Type { MEAT, FISH, OTHER };
}
