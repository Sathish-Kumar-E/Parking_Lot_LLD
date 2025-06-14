package com.parking_lot.service;

import java.time.Duration;

import com.parking_lot.model.Ticket;

public class PaymentService {
	public static void processPayment(Ticket ticket) {
		long hours = Duration.between(ticket.getEntryTime(), ticket.getExitTime()).toHours();
		double amount = 10 + (hours * 5);
		System.out.println("Paid $" + amount + " for Ticket : " + ticket.getTicketId());
	}
}
