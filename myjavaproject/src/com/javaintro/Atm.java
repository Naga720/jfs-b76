package com.javaintro;

public class Atm {
	static String bankname = "kotak mahendra";

    long accountnumber = 6047430213l;
    int balence = 2500;
    
    void deposit() {
    balence=balence+200;
    System.out.println("bank balence after deposit = " +balence);
    }
    void withdraw() {
    	balence=balence+500;
    	System.out.println("bank balence after withdraw = "+balence);
    }
    void checkbalence() {
    	balence=balence+100;
    	System.out.println("bank balence after checkbalence = "+balence);
    }
	public static void main(String... args) {
	Atm b1 = new Atm();
	b1.accountnumber = 6047430213l;
	b1.balence = 2500;
	System.out.println("b1.accountnumber =" + b1.accountnumber);
    System.out.println("b1.balence ="+ b1.balence);
    b1.deposit();
    b1.withdraw();
    b1. checkbalence();
    Atm b2 = new Atm();
    b2.accountnumber = 6047430214l;
    b2.balence = 3000;
    System.out.println("b2.accountnumber =" + b2.accountnumber);
    System.out.println("b2.balence ="+ b2.balence);
    b2.deposit();
    b2.withdraw();
    b2. checkbalence();
	}

}
