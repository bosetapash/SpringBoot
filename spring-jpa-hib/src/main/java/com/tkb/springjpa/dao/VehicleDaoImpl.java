package com.tkb.springjpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tkb.springjpa.model.Vehicle;

@Repository
public class VehicleDaoImpl implements VehicleDao{
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Vehicle> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query query = currentSession.createQuery("from Vehicle");
		List<Vehicle> list = (List<Vehicle>)query.getResultList();
		return list;
	}

	@Override
	public Vehicle get(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		return currentSession.get(Vehicle.class, id);
	}

	@Override
	public void remove(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Vehicle vehicle = currentSession.get(Vehicle.class, id);
		currentSession.delete(vehicle);
		
	}

	@Override
	public void save(Vehicle vehicle) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(vehicle);
		
	}

}
