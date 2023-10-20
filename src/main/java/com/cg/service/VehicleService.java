package com.cg.service;

import java.util.ArrayList;
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

	List<Vehicle> list = new ArrayList<>();

	public String addVehicle(Vehicle v) {

		list.add(v);

		return "Vehicle added.....";
	}

	public List<Vehicle> getAllVehicle() {

		return list;
	}

}
