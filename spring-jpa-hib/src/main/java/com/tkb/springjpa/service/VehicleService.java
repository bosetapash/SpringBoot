package com.tkb.springjpa.service;

import java.util.List;

import com.tkb.springjpa.model.Vehicle;

public interface VehicleService {
	List<Vehicle> get();
	Vehicle get(int id);
	void remove(int id);
	void save(Vehicle vehicle);
}
