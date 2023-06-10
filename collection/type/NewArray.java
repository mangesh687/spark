package com.collection.type;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class NewArray {

	public static void main(String[] args) {
		
		
   LinkedList<String> name=new LinkedList();
   // null value allow
   //duplicated  allow 
   // order
   // mostly use linkedlist use bacause doubly link list 
   
   name.add(null);
   name.add("rahul");
   name.add("rohit");
   name.add("amol");
   name.add("amol");
   Iterator<String> itr=name.iterator();
   while (itr.hasNext()) {
    System.out.println(itr.next());
	
}
	}

}
