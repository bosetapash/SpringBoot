package com.tkb.springjpa.model;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="BMW")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String color;
	private String modelNo;
	private double price;
	private Date dop;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModelNo() {
		return modelNo;
	}
	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getDop() {
		return dop;
	}
	public void setDop(Date dop) {
		this.dop = dop;
	}
	@Override
	public String toString() {
		return "Vehicle [getId()=" + getId() + ", getColor()=" + getColor() + ", getModelNo()=" + getModelNo()
				+ ", getPrice()=" + getPrice() + ", getDop()=" + getDop() + "]";
	}
	public Vehicle() {
		super();
	}
	
	
}
