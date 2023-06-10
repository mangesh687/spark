package com.example1.app;

public class Student {
	private int studentid;
	private String studentName;
	private String studentAddress;
	private String emailid;
	private int age;
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	Student(){
		
	}
	public Student(int studentid, String studentName, String studentAddress, String emailid, int age) {
		super();
		this.studentid = studentid;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.emailid = emailid;
		this.age = age;
	}
	

}
