package com.parking_lot.model;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.LinkedList;

public class Floor {
	private int floorNumber;
	private Map<SlotType, List<ParkingSlot>> slots;
	
	public Floor(int floorNumber) {
		this.floorNumber = floorNumber;
		this.slots = new HashMap<>();
	}
	
	public void addParkingSlot(ParkingSlot slot) {
		this.slots.putIfAbsent(slot.getType(), new LinkedList<>());
		this.slots.get(slot.getType()).add(slot);
	}
	
	public boolean removeParkingSlot(String slotNumber, ParkingSlot slot) {
		List<ParkingSlot> slotList = this.slots.get(slot.getType());
		if(slotList != null) {
			for(int i = 0 ; i < slotList.size() ; i++) {
				if(slotList.get(i).getSlotNumber().equals(slotNumber)) {
					slotList.remove(i);
					return true;
				}
			}
		}
		return false;
	}
	
	public ParkingSlot getAvailableSlot(SlotType type) {
		List<ParkingSlot> slotList = this.slots.get(type);
		for(int i = 0 ; i < slotList.size() ; i++) {
			if(!slotList.get(i).isOccupied()) {
				return slotList.get(i);
			}
		}
		
		return null;
	}
	
	public int getFlootNumber() {
		return this.floorNumber;
	}
}
