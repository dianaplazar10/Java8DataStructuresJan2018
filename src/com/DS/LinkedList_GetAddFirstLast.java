package com.DS;

//refer: https://www.tutorialspoint.com/javaexamples/data_element.htm

import java.util.LinkedList;

public class LinkedList_GetAddFirstLast {
   public static void main(String[] args) {
      LinkedList<String> lList = new LinkedList<String>();
      lList.add("100");
      lList.add("200");
      lList.add("300");
      lList.add("400");
      lList.add("500");
      lList.addFirst("500");
      lList.addLast("5000");
      System.out.println("First element of LinkedList is : " + lList.getFirst());
      System.out.println("Last element of LinkedList is : " + lList.getLast());
   }
}