package com.java8.apps;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpersionFilter {
int id;
String name;
int salary;

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

public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}

	public LambdaExpersionFilter(int id, String name, int salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}

	public LambdaExpersionFilter() {
	super();
	// TODO Auto-generated constructor stub
}

	public static void main(String[] args) {
   List<LambdaExpersionFilter> name=new ArrayList<>();
   name.add(new LambdaExpersionFilter(2,"rohit",56000));
   name.add(new LambdaExpersionFilter(5,"sakshi",58000));
   name.add(new LambdaExpersionFilter(9,"amit",87000));
 // using filter data 
 //  Stream<LambdaExpression> filtered_data = name.Stream().filter(p -> p.price > 20000); 
		 
	}

}
