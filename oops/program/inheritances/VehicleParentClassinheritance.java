package com.oops.program.inheritances;

public class VehicleParentClassinheritance {
private int vehicleid;
private String vehicleName;
private int vehiclepersonNo;
private String vehicleFetures;
private int vehiclePrice;
private String vehicleType;
public VehicleParentClassinheritance() {
	super();
}
public VehicleParentClassinheritance(int vehicleid, String vehicleName, int vehiclepersonNo, String vehicleFetures, int vehiclePrice,
		String vehicleType) {
	super();
	this.vehicleid = vehicleid;
	this.vehicleName = vehicleName;
	this.vehiclepersonNo = vehiclepersonNo;
	this.vehicleFetures = vehicleFetures;
	this.vehiclePrice = vehiclePrice;
	this.vehicleType = vehicleType;
}
public int getVehicleid() {
	return vehicleid;
}
public void setVehicleid(int vehicleid) {
	this.vehicleid = vehicleid;
}
public String getVehicleName() {
	return vehicleName;
}
public void setVehicleName(String vehicleName) {
	this.vehicleName = vehicleName;
}
public int getVehiclepersonNo() {
	return vehiclepersonNo;
}
public void setVehiclepersonNo(int vehiclepersonNo) {
	this.vehiclepersonNo = vehiclepersonNo;
}
public String getVehicleFetures() {
	return vehicleFetures;
}
public void setVehicleFetures(String vehicleFetures) {
	this.vehicleFetures = vehicleFetures;
}
public int getVehiclePrice() {
	return vehiclePrice;
}
public void setVehiclePrice(int vehiclePrice) {
	this.vehiclePrice = vehiclePrice;
}
public String getVehicleType() {
	return vehicleType;
}
public void setVehicleType(String vehicleType) {
	this.vehicleType = vehicleType;
}

}
