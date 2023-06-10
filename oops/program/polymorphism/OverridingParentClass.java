package com.oops.program.polymorphism;

public class OverridingParentClass {
private String dog;
private  int noofdog;
private int dailyexpence;
public String getDog() {
	return dog;
}
public void setDog(String dog) {
	this.dog = dog;
}
public int getNoofdog() {
	return noofdog;
}
public void setNoofdog(int noofdog) {
	this.noofdog = noofdog;
}
public int getDailyexpence() {
	return dailyexpence;
}
public void setDailyexpence(int dailyexpence) {
	this.dailyexpence = dailyexpence;
}
public OverridingParentClass(String dog, int noofdog, int dailyexpence) {
	super();
	this.dog = dog;
	this.noofdog = noofdog;
	this.dailyexpence = dailyexpence;
}
public OverridingParentClass() {
	super();
	// TODO Auto-generated constructor stub
}
}
