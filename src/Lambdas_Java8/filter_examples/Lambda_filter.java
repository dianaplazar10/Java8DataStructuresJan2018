package Lambdas_Java8.filter_examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda_filter {

    public static void main(String[] args) {
        /*
         * filter out only the vegetarian Dishes from a list of all Dishes
         */
        
        List<Dish> allDishes = new ArrayList<Dish>();
        allDishes.add(new Dish("NVeg1", false, 200, Dish.Type.MEAT));
        allDishes.add(new Dish("NVeg2", false, 30, Dish.Type.FISH));
        allDishes.add(new Dish("NVeg3", false, 300, Dish.Type.MEAT));
        allDishes.add(new Dish("Veg1", true, 200, Dish.Type.OTHER));
        allDishes.add(new Dish("Veg2", true, 200, Dish.Type.OTHER));
        
//        for(Dish d: allDishes) {
//           if(d.getVegetarian()) { 
//              vegetarianDishes.add(d);
//           } 
//        }
        
        List<Dish> vegDishes = allDishes.stream()
//                                        .filter(dish->(dish.getVegetarian()==true))
                                        .filter(Dish::getVegetarian)
                                        .collect(Collectors.toList());
        vegDishes.stream().forEach(vdish->System.out.println(vdish.getName()));

    }

}
