package com.encaps.inter;

public class BankMain {
	
	private int accountNumber;
	private String accountHolderName;
	private double initialDeposit;
	private double balanceAmount;
	private double deposit;
	private double withDraw;
	
	public BankMain() {
		
	}
	public BankMain(int accountNumber,String accountHolderName,double initialDeposit) {
		this.accountNumber= accountNumber;
		this.accountHolderName= accountHolderName;
		this.initialDeposit= initialDeposit;
		this.balanceAmount= initialDeposit;
	}
	
	public int  getAccountNumber() {
		return accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public double getBalanceAmount(){
		return balanceAmount;
	}
	
	public void depositAmount(double deposit) {
			if (deposit <=0) {
				System.out.println("Invalid amount");
			}
			balanceAmount = balanceAmount + deposit;
	}
	
	public void printAccountInfo() {
		System.out.println("AccountNumber:" + accountNumber + "\n"+ "AccountHolderName:" +accountHolderName+ "\n" + "Balance:" +balanceAmount );
	}
	
}
