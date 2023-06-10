package com.collection.type;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
        // linkedList sore  doubly linked list internally
		LinkedList<String> Name=new LinkedList<String>();
		Name.add("ankit");
		Name.add("ankush");
		Name.add("Altaf");
		System.out.println(Name);
		Name.addFirst("rohit");
		
		Name.addLast("amir");
		System.out.println(Name);
		Name.add(1, "mangesh");// add in mid
		// remove 
		Name.removeFirst();
		System.out.println(Name);
		Name.removeLast();
		System.out.println(Name);
		
		Name.remove(1);
		System.out.println(Name);
		for(String str:Name) {
			System.out.println(str);
		}
		
		
	}

}
