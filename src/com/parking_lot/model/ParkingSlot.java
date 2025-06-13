package com.parking_lot.model;

public class ParkingSlot {
	private String slotNumber;
	private SlotType type;
	private boolean isOccupied;
	private Vehicle vehicle;
	
	public ParkingSlot(String slotnumber, SlotType type) {
		this.slotNumber = slotNumber;
		this.type = type;
	}
	
	public boolean parkVehicle(Vehicle vehicle) {
		if(!isOccupied) {
			this.vehicle = vehicle;
			this.isOccupied = true;
			return true;
		}
		return false;
	}
	
	public void unparkVehicle() {
		this.vehicle = null;
		this.isOccupied = false;
	}
	
	public String getSlotNumber() {
		return slotNumber;
	}
	
	public SlotType getType() {
		return type;
	}
	
	public boolean isOccupied() {
		return isOccupied;
	}
	
	public Vehicle getVehicle() {
		return vehicle;
	}
}
