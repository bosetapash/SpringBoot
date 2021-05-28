package com.tkb.springjpa.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tkb.springjpa.dao.VehicleDao;
import com.tkb.springjpa.model.Vehicle;

@Service
public class VehicleServiceImpl implements VehicleService{

	@Autowired
	private VehicleDao vehicleDao;
	
	@Transactional
	@Override
	public List<Vehicle> get() {
		return vehicleDao.get();
	}
	@Transactional
	@Override
	public Vehicle get(int id) {
		return vehicleDao.get(id);
	}
	@Transactional
	@Override
	public void remove(int id) {
		vehicleDao.remove(id);
		
	}
	@Transactional
	@Override
	public void save(Vehicle vehicle) {
		vehicleDao.save(vehicle);
		
	}
	

	

}
