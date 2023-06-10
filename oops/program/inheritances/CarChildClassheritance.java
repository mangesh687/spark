package com.oops.program.inheritances;

public class CarChildClassheritance extends VehicleParentClassinheritance {
private String carModelNo;
private String carCompany;
private String carName;
private int noofWheels;
public CarChildClassheritance() {
	super();
	// TODO Auto-generated constructor stub
}
public CarChildClassheritance(String carModelNo, String carCompany, String carName, int noofWheels) {
	super();
	this.carModelNo = carModelNo;
	this.carCompany = carCompany;
	this.carName = carName;
	this.noofWheels = noofWheels;
}
public String getCarModelNo() {
	return carModelNo;
}
public void setCarModelNo(String carModelNo) {
	this.carModelNo = carModelNo;
}
public String getCarCompany() {
	return carCompany;
}
public void setCarCompany(String carCompany) {
	this.carCompany = carCompany;
}
public String getCarName() {
	return carName;
}
public void setCarName(String carName) {
	this.carName = carName;
}
public int getNoofWheels() {
	return noofWheels;
}
public void setNoofWheels(int noofWheels) {
	this.noofWheels = noofWheels;
}

}
