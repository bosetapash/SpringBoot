package com.tkb.springjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tkb.springjpa.model.Vehicle;
import com.tkb.springjpa.service.VehicleService;

@RestController
@RequestMapping("/api")
public class VehicleController {
	@Autowired
	private VehicleService vehicleService;
	
	@GetMapping("/vehicle")
	public List<Vehicle> get(){
		return vehicleService.get();
	}
	
	@PostMapping("/vehicle")
	public Vehicle save(@RequestBody Vehicle vehicle){
		 vehicleService.save(vehicle);
		 return vehicle;
	}
	
	@GetMapping("/vehicle/{id}")
	public Vehicle get(@PathVariable int id){
		return vehicleService.get(id);
	}
	
	@DeleteMapping("/vehicle/{id}")
	public void delete(@PathVariable int id){
		vehicleService.remove(id);
	}
	
	@PutMapping("/vehicle")
	public Vehicle update(@RequestBody Vehicle vehicle){
		 vehicleService.save(vehicle);
		 return vehicle;
	}

}
 