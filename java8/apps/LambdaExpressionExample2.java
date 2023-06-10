package com.java8.apps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class LambdaExpressionExample2 {

	int id;
	String name;
	int  price;
     public LambdaExpressionExample2() {
		super();
		// TODO Auto-generated constructor stub
	}

public LambdaExpressionExample2(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}





	public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

	public static void main(String[] args) {
		List<LambdaExpressionExample2> name=new ArrayList<>();
		name.add(new LambdaExpressionExample2(1,"name",2500));
		name.add(new LambdaExpressionExample2(2,"life",56000));
		name.add(new LambdaExpressionExample2(3,"ooo",90000));
		 System.out.println("Sorting on the basis of name...");  
		 Collections.sort(name,(p1,p2)->{
			 return p1.name.compareTo(p2.name);
		 });
		 for(LambdaExpressionExample2 p:name) {
			 System.out.println(p.id+" "+p.name+" "+p.price);
		 }
		 }
		 
		 
//		 Collections.sort(name,(p1,p2)->{  
//		        return p1.name.compareTo(p2.name);  
//		        });  
//		        for(LambdaExpressionExample2 p:name){  
//		            System.out.println(p.id+" "+p.name+" "+p.price);  
//		        }  
       
	}


