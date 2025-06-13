package com.parking_lot.model;

public class Vehicle {
	private String id;
	private VehicleType type;
	private String owner;
	
	public Vehicle(String id, VehicleType type, String owner) {
		super();
		this.id = id;
		this.type = type;
		this.owner = owner;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public VehicleType getType() {
		return type;
	}
	
	public void setType(VehicleType type) {
		this.type = type;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
}
