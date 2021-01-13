package com.capgemini.abstractkeyword;

public class Current extends Account {
	private double overDraft;
	
	public Current() {
		
	}
	
	public Current(int accountId, String holderName, double balance, double overDraft) {
		super(accountId, holderName, balance);
		this.overDraft = overDraft;
	}
	@Override
	public void showAccount() {
		System.out.println("Account Number: "+getAccountId());
		System.out.println("Holder Name: "+getHolderName());
		System.out.println("Balance: "+getBalance());
		System.out.println("Over draft limit: "+overDraft);
	}
}
