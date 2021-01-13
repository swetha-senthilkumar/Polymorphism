package com.capgemini.abstractkeyword;

public class Saving extends Account {
	private double roi;
	
	public Saving() {
		
	}
	public Saving(int accountId, String holderName, double balance, double roi) {
		super(accountId, holderName, balance);
		this.roi = roi;
	}
	
	@Override
	public void showAccount() {
		System.out.println("Account Number: "+getAccountId());
		System.out.println("Holder Name: "+getHolderName());
		System.out.println("Balance: "+getBalance());
		System.out.println("Rate of interest: "+roi);
	}
	
}
