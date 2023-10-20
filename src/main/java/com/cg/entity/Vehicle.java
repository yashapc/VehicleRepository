package com.cg.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vehicle {
	@Id
	String vehicleName;
	String vehicleNumber;

	public Vehicle() {
	}

	public Vehicle(String vehicleName, String vehicleNumber) {
		super();
		this.vehicleName = vehicleName;
		this.vehicleNumber = vehicleNumber;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleName=" + vehicleName + ", vehicleNumber=" + vehicleNumber + "]";
	}

}
