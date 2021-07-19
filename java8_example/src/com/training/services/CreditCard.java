package com.training.services;

public class CreditCard {

	private long cardNumber;
	private String cardHolderName;
	private long phoneNumber;
	private double creditLimit;
	
	public CreditCard() {
		super();
	}
	public CreditCard(long cardNumber, String cardHolderName, long phoneNumber, double creditLimit) {
		super();
		this.cardNumber = cardNumber;
		this.cardHolderName = cardHolderName;
		this.phoneNumber = phoneNumber;
		this.creditLimit = creditLimit;
	}
	public int getCreditLimit() {
		// TODO Auto-generated method stub
		return 0;
	}
}
