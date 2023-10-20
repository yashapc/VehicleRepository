package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Vehicle;
import com.cg.service.VehicleService;

@RestController
@RequestMapping("/vehicleapi")
public class VehicleController {

	@Autowired
	private VehicleService vservice;

	@PostMapping("/")
	public String add(@RequestBody Vehicle vehicle) {

		return vservice.addVehicle(vehicle);

	}

	@GetMapping("/")
	public List<Vehicle> getAll() {

		return vservice.getAllVehicle();

	}

}