package com.java8.apps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaExpression {
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



	public LambdaExpression(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}



	public LambdaExpression() {
		super();
		// TODO Auto-generated constructor stub
	}



	public static void main(String[] args) {
List<LambdaExpression> name=new ArrayList<>();
name.add(new LambdaExpression(2,"hp",25000));
name.add(new LambdaExpression(3,"apple",45000));
name.add(new LambdaExpression(1,"rahul",75000));
// implemantation of lamba expression 
Collections.sort(name,(a,b)->{
	return a.name.compareTo(b.name);
}
);

for(LambdaExpression p:name) {
	System.out.println(p.id+" "+p.salary+" "+p.name);
}

	}

}
