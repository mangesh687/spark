package com.collection.type;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
    Set<Integer> name= new TreeSet<>();
    name.add(25);
    name.add(11);
    name.add(55);
    name.add(11);// duplicated not allowed 
    System.out.println(name); // print in assending order 
    Iterator<Integer> itr = name.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	}
}
