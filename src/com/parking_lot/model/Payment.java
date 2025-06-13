package com.parking_lot.model;

public class Payment {
	private String paymentId;
	private double amount;
	private PaymentMethod method;
	
	public Payment(String paymentId, double amount, PaymentMethod method) {
		super();
		this.paymentId = paymentId;
		this.amount = amount;
		this.method = method;
	}

	public void processPayment() {
		System.out.println("Payment Completed");
	}
}
