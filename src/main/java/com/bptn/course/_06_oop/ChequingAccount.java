package com.bptn.course._06_oop;

class ChequingAccount extends BankAccount {
	
	private double overDraftLimit;// we just declare variable thats not provided by the parent class
// constructor
	public ChequingAccount(String accountNumber, double initialBalance, double overDraftLimit) {
		super(accountNumber, initialBalance);
		this.overDraftLimit = overDraftLimit;
	}
	
	@Override
	public void withdraw(double amount) {
		if(amount>0 && amount<=(getBalance() + overDraftLimit)) {
			super.withdraw(amount);
		}
	}

}