package com.encaps.inter;

public class BOA extends BankMain{
	
		public BOA(int accountNumber, String accountHolderName, double initialDeposit) {
		super(accountNumber, accountHolderName, initialDeposit);
		
	}
		
	public void  printBOAInfo() {
		System.out.println("THis is from printBOAInfo");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BOA bm= new BOA(123,"BOA",100);
		BankMain bm2= new BOA(235,"DEF",200);
		System.out.println(bm.getAccountHolderName());
		bm.printAccountInfo();
		bm.depositAmount(250);
		bm.printAccountInfo();
		bm.depositAmount(0);
		bm.printAccountInfo();
		bm2.printAccountInfo();
		((BOA) bm2).printBOAInfo(); //casting to BOA reference as bm3 is a BankMain type object
		
	}

}
