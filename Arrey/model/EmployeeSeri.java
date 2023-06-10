package com.Arrey.model;

import java.io.Serializable;

public class EmployeeSeri implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
//read and write 

	private int id;
	private String name;
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
	public EmployeeSeri(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public EmployeeSeri() {
		// TODO Auto-generated constructor stub
	}
	
}
