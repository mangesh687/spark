package com.collection.type;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {
        TreeMap<String, Integer> now=new TreeMap<>();
        now.put("mangesh", 2302);
        now.put("rahul", 2322);
        now.put("mayur", 2304);
        now.put("pritam", 2399);
        for(Map.Entry a :now.entrySet()) 
        {
			System.out.println(a.getKey()+" "+a.getValue());
		}
        System.out.println(now.descendingMap());
		
	}

}
