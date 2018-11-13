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
 
     System.out.println("LinkedList Elements:"+list);
//     OUTPUT:
//         LinkedList Elements:[AA, BB, CC, DD]

     
     list.add("NEW");
     System.out.println("LinkedList New Elements:"+list);
//      OUTPUT:
//      LinkedList New Elements:[AA, BB, CC, DD, NEW]
     
     
     // Adding element to front of LinkedList
     /* public boolean offerFirst(E e): Inserts the 
      * specified element at the front of this list.
      */
     list.offerFirst("NEW Element");
     System.out.println("LinkedList After Addition:"+list);
//      OUTPUT:
//      LinkedList After Addition:[NEW Element, AA, BB, CC, DD, NEW]
  }
}
