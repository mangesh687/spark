package com.collection.type;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet1 {

	public static void main(String[] args) {
      Set<Integer> sc=new HashSet<>();
      sc.add(23);
      sc.add(34);
      sc.add(43);
      sc.add(33);
      sc.add(23);// no duplicated allowd
      System.out.println(sc); // print in unorder
      System.out.println(sc.size());
      System.out.println(sc.contains(23));// true or false
      sc.remove(34);
      System.out.println(sc);
      Iterator<Integer> itr= sc.iterator();
      while(itr.hasNext()) {
    	  System.out.println(itr.next());
      }
	}

}
