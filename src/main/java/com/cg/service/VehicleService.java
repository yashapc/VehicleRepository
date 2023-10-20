package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.VehicleDao;
import com.cg.entity.Vehicle;
import com.cg.repository.VehicleRepository;

@Service
public class VehicleService implements VehicleDao {

	@Autowired
	VehicleRepository vr;

	public String addVehicle(Vehicle v) {

		vr.save(v);

		return "Vehicle added.....";
	}

	public List<Vehicle> getAllVehicle() {

		return vr.findAll();
	}

}
