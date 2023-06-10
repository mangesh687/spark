package com.collection.type;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapNew1 {

	public static void main(String[] args) {
      Map<Integer, String> name=new HashMap<>();
      //adding elemnet to map
      name.put(23, "rahul");
      name.put(45, "yugal");
      name.put(44, "jai");
      name.put(66, "mangesh");
      //elemnts can traverse in any order 
      for(Map.Entry<Integer, String> m:name.entrySet()) {
			System.out.println(m.getKey()+":"+m.getValue());
			
		}
		
	}
}
