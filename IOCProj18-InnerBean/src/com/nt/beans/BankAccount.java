package com.nt.beans;

public class BankAccount {
	private long  acno;
	private String holderName;
	private float balance;
	private  boolean NRIBankingEnabled;
	
	public BankAccount() {
		
		System.out.println("BankAccount:: 0-param constructor");
	}
	
	public void setAcno(long acno) {
		this.acno = acno;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public void setNRIBankingEnabled(boolean nRIBankingEnabled) {
		NRIBankingEnabled = nRIBankingEnabled;
	}
	
	public float  showBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "BankAccount [acno=" + acno + ", holderName=" + holderName + ", balance=" + balance
				+ ", NRIBankingEnabled=" + NRIBankingEnabled + "]";
	}
	
	

}
