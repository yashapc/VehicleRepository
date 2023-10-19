package com.cg.dao;

import java.util.List;

import com.cg.entity.Vehicle;

public interface VehicleDao {

	String addVehicle(Vehicle v);

	List<Vehicle> getAllVehicle();

}
