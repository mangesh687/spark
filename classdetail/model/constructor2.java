package com.classdetail.model;

public class constructor2 {
	private int id;
	private String empName;
	private String addrass;
	private String companyname;
	private int salary;
	private long mobileNo;
	public constructor2(int id, String empName, String addrass, String companyname, int salary, long mobileNo) {
		super();
		this.id = id;
		this.empName = empName;
		this.addrass = addrass;
		this.companyname = companyname;
		this.salary = salary;
		this.mobileNo = mobileNo;
	}
	constructor2(){
	}
	constructor2(int id,String empName,String addrass){
		this.id=id;
		this.empName=empName;
		this.addrass=addrass;
		
	}

}
