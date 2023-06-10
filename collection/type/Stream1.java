package com.collection.type;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Stream1 {

	public static void main(String[] args) {
       List<Integer> now=new ArrayList<>();
       now.add(22);
       now.add(44);
       now.add(77);
       now.add(66);
       Stream s=now.stream().filter(i -> i%2==0);
       s.forEach(x -> System.out.println(x));
	}

}
