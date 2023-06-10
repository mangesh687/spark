package com.collection.type;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet1 {

	public static void main(String[] args) {
      Set<String> nameset=new LinkedHashSet<>();
      nameset.add("mangesh");
      nameset.add("rahul");
      nameset.add("sakshi");
      nameset.add("mangesh");// duplicated not allowd 
      System.out.println(nameset);// order maintained  as it print 
      Iterator<String> itr = nameset.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
      
	}

	}}
