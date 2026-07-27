package com.javaintro;

public class Bank {
	//static 
	static String branchname = "hyderabad";
	static int balence = 2000;
	static String IFSC = "KKBK0000811";
	
	//instance
	
	 long Accountnumber;
	 String  holdername; 
	 {
	Accountnumber = Accountnumber+1;
	 }
	 void show(){
		   System.out.println("holdername = " + holdername);
		   System.out.println("balence = " + balence);
		   System.out.println("IFSC = " + IFSC);
		   System.out.println("branchname = " + branchname);
		   System.out.println("Accountnumber = " + Accountnumber);
		   
	 }
		 
	public static void main(String[] args) {
	
	  
	   Bank b1 = new Bank();
	   b1.holdername = "Nagaraju";
	   b1.Accountnumber = 6047430213l;
	   System.out.println("b1.holdername = " + b1.holdername);
	   System.out.println("b1.Accountnumber = " + b1.Accountnumber);  
	   b1.show();
	   
	   Bank b2 = new Bank();
	   b2.holdername = "Shiva";
	   b2.Accountnumber = 6047430214l;
	   System.out.println("b2.holdername = " + b2.holdername);
	   System.out.println("b2.Accountnumber = " + b2.Accountnumber);  
	   b2.show();
	   
	   Bank b3 = new Bank();
	   b3.holdername = "Saikumar";
	   b3.Accountnumber = 7659872534l;
	   System.out.println("b3.holdername = " + b3.holdername);
	   System.out.println("b3.Accountnumber = " + b3.Accountnumber);
	   b3.show();
	}

}
