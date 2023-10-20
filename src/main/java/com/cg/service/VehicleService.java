package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.VehicleDao;
import com.cg.entity.Vehicle;

@Service
public class VehicleService implements VehicleDao {
	@Autowired
	
	VehicleRepository vr;

//	public String addEmployee(Vehicle vmp) {
//		vr.save(vmp);
//		return "Employee added....";
//	}
//
//	public List<Vehicle> getAllEmployee() {
//		return vr.findAll();
//
//	}

	@Override
	public String addVehicle(Vehicle v) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Vehicle> getAllVehicle() {
		// TODO Auto-generated method stub
		return null;
	}

}
