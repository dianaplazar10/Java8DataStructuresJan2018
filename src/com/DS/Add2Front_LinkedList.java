package com.DS;


//list.offerFirst()   adds element to front in linkedList


import java.util.LinkedList;
public class Add2Front_LinkedList {

  public static void main(String[] args) {

     // create a LinkedList
     LinkedList<String> list = new LinkedList<String>();

     // Add elements
     list.add("AA");
     list.add("BB");
     list.add("CC");
     list.add("DD");
 
     // Display List element
     System.out.println("LinkedList Elements:"+list);

     
     list.add("NEW");
     
     // Display List element
     System.out.println("LinkedList New Elements:"+list);
     // Adding element to front of LinkedList
     /* public boolean offerFirst(E e): Inserts the 
      * specified element at the front of this list.
      */
     list.offerFirst("NEW Element");

     // Displaying List after adding element
     System.out.println("LinkedList After Addition:"+list);
  }
}
