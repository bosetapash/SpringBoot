package com.tkb.springjpa.dao;

import java.util.List;

import com.tkb.springjpa.model.Vehicle;

public interface VehicleDao {
	List<Vehicle> get();
	Vehicle get(int id);
	void remove(int id);
	void save(Vehicle vehicle);
}
