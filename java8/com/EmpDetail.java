package com.java8.com;

public class EmpDetail {
	private String emmName;
	private int empID;
	public EmpDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmpDetail(String emmName, int empID) {
		super();
		this.emmName = emmName;
		this.empID = empID;
	}
	public String getEmmName() {
		return emmName;
	}
	public void setEmmName(String emmName) {
		this.emmName = emmName;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	@Override
	public String toString() {
		return "EmpDetail [emmName=" + emmName + ", empID=" + empID + "]";
	}
	

}
