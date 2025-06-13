package com.parking_lot.model;

import java.time.LocalDateTime;

public class Ticket {
	private String ticketId;
	private Vehicle vehicle;
	private ParkingSlot slot;
	private LocalDateTime entryTime;
	private LocalDateTime exitTime;
	private EntryGate entryGate;
	private ExitGate exitGate;
	
	public Ticket(String ticketId, Vehicle vehicle, ParkingSlot slot, LocalDateTime entryTime, EntryGate entryGate) {
		super();
		this.ticketId = ticketId;
		this.vehicle = vehicle;
		this.slot = slot;
		this.entryTime = entryTime;
		this.entryGate = entryGate;
	}
	
	public void setExitTime(LocalDateTime exitTime) {
		this.exitTime = exitTime;
	}
	
	public void setExitGate(ExitGate exitGate) {
		this.exitGate = exitGate;
	}
	
	public String getTicketId() {
		return ticketId;
	}
	
	public Vehicle getVehicle() {
		return vehicle;
	}
	
	public ParkingSlot getSlot() {
		return slot;
	}
	
	public LocalDateTime getEntryTime() {
		return entryTime;
	}
	
	public LocalDateTime getExitTime() {
		return exitTime;
	}
	
	public EntryGate getEntryGate() {
		return entryGate;
	}
	
	public ExitGate getExitGate() {
		return exitGate;
	}
}
