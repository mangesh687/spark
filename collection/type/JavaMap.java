package com.collection.type;

import java.util.HashMap;
import java.util.Map;


public class JavaMap {

	public static void main(String[] args) {
     Map<Integer, String> empname= new HashMap<>();
     empname.put(5050, "arohi khan");
     empname.put(5051, "mansi magar");
     empname.put(5052, "ashutosh rana");
     empname.put(5053, "akshay patil");
     for(Map.Entry<Integer,String>aa:empname.entrySet()) {
    	 System.out.println(aa.getKey()+":"+aa.getValue());
     }
    	 System.out.println("========");
    	 empname.remove(5052);
    	 System.out.println("========");
    	 for(Map.Entry<Integer,String>aa2:empname.entrySet()) {
        	 System.out.println(aa2.getKey()+":"+aa2.getValue());
        	 
     }

	}

	}
