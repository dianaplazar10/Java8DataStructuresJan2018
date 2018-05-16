package com.DS;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


// java.util.ConcurrentModificationException
//is the exception thrown to indicate a failfast  situation. 
//This happens when a new item is being tried to be created during iteration(for loop or iterator whie loop)

//A ConcurrentHashMap is used over a HashMap if we are to create over iteration, to be failsafe. 
//This is achieved, since ConcurrentHashMap iterates over a clone of the original map over the original iterating as is hashmap.


/**
 * Example of Fail Fast using Map.
 * @author javaQuery
 * @date 4th August, 2016
 * @Github: https://github.com/javaquery/Examples 
 */

public class FailFast_FailSafeExample {
	    public static void main(String[] args) {
	    	
	    	//FAILFAST DEMO SECTION BELOW
	    	
	        Map<String, Double> carPrice = new HashMap<String, Double>();
	        carPrice.put("Porsche", 100000D);
	        carPrice.put("Ferrari", 200000D);

	        /* Iterate over Map */
	        for(Map.Entry<String, Double> car : carPrice.entrySet()){
	            System.out.println("Car: " + car.getKey());
	            System.out.println("Price: " + car.getValue());
	            
	            /* Will cause java.util.ConcurrentModificationException ******************************************/
	           // carPrice.put("Lamborghini", 300000D);
	        }
	        //------------------------------
	        
	        //FAILSAFE DEMO SECTION BELOW
	        
	        Map<String, Double> carPrice_4FailSafe = new ConcurrentHashMap<String, Double>();
	        carPrice_4FailSafe.put("Porsche2", 100000D);
	        carPrice_4FailSafe.put("Ferrari2", 200000D);

	        /* Iterate over Map */
	        for (Map.Entry<String, Double> car : carPrice_4FailSafe.entrySet()) {
	            System.out.println("Car: " + car.getKey());
	            System.out.println("Price: " + car.getValue());

	            /* Will be added in original copy of Map but won't available in Iterator ***********************************/
	            carPrice_4FailSafe.put("Lamborghini", 300000D);
	        }
	        System.out.println("=== loop finished ===");
	        System.out.println("Car: Lamborghini" + ", Price: " + carPrice_4FailSafe.get("Lamborghini"));
	        
	        //------------------------------
	        
	    }
	
}