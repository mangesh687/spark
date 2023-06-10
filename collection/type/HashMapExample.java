package com.collection.type;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
     HashMap<Integer, String> name=new HashMap<>();
     name.put(10, "rahul");
     name.put(8, "rahul");
     name.put(3, "rahul");
     name.put(22, "rahul");
     name.put(133, "rahul");
     for(Map.Entry m : name.entrySet()){
    	   System.out.println(m.getKey()+" "+m.getValue());  
     }
    	   }  
	}


