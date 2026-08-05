package com.javaintro;

public class BankAccount {
	static String bankname = "kotakmahendra";
	static String branchname = "kukatpally";
	
	int accountnumber;
	String customername;
	int balence;
	int money;
	int deposit;
	int withdraw;
	
	void deposit() {
		deposit = money+balence;
		System.out.println("the deposit is: "+ deposit);
	}
	
	void withdraw() {
		withdraw = deposit-balence;
		System.out.println("the withdraw is: "+withdraw);
	}
	
	void accountdetails() {
	System.out.println("the bankname is: "+bankname);
	System.out.println("the branchname is: "+branchname);
	System.out.println("Balance is: "+balence);
	}
	 static void changebranch() {
		branchname = "hyderabad";
		System.out.println("branchname is: "+branchname);
		
	}

	public static void main(String[] args) {
	 BankAccount s = new BankAccount();
	 s.accountnumber=60474302;
	 s.customername="Nagaraju";
	 s.balence=5000;
	 s.money=500;
	 s.deposit=500;
	 s.withdraw=1000;
	 
	 s.deposit();
	 s.withdraw();
	 s.accountdetails();
	 s.changebranch();
	 System.out.println("-----------------------------------");
	 
	 BankAccount s1 = new BankAccount();
	 s1.accountnumber=60474304;
	 s1.customername="phani kumar";
	 s1.balence=5000;
	 s1.money=1000;
	 s1.deposit=500;
	 s1.withdraw=1000;
	 
	 s1.deposit();
	 s1.withdraw();
	 s1.accountdetails();
	
	 
		

	}

}
