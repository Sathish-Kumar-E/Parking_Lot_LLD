package com.parking_lot.service;

import java.util.UUID;
import java.time.LocalDateTime;

import com.parking_lot.model.Ticket;
import com.parking_lot.model.Vehicle;
import com.parking_lot.model.ParkingSlot;
import com.parking_lot.model.EntryGate;

public class TicketService {
	public static Ticket issueTicket(Vehicle vehicle, ParkingSlot slot, EntryGate entryGate) {
		return new Ticket(UUID.randomUUID().toString(), vehicle, slot, LocalDateTime.now(), entryGate);
	}
}
