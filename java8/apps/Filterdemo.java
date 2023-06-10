package com.java8.apps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Filterdemo {

	public static void main(String[] args) {
     List<Integer>numberList=Arrays.asList(10,20,22,66);
//     List<Integer>evennuberList=new ArrayList<>();
//     
//  evennuberList=   numberList.stream().filter(n->n%2==0).collect(Collectors.toList());
//  System.out.println(evennuberList);
     
     numberList.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
	}

}
