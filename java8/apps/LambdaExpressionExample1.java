package com.java8.apps;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionExample1 {

	public static void main(String[] args) {
     List<String> list =new ArrayList<>();
     list.add("aniket");
     list.add("rahul");
     list.add("amit");
     list.add("payal");
     list.forEach((n)->System.out.println(n));
	}

}
