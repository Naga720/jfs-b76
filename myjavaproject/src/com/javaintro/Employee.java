package com.javaintro;

public class Employee {
	int monthlysalary;
	String employeename;
	int monthlygst;
	int monthlypf;
	int netmonthlysalary;
	int annualgst;
	int annualpf;
	int annualnetsalary;
	
	void calculatemonthlypf() {
	monthlypf =(monthlysalary * 2)/100;
	}
	
	void calculatemonthlygst() {
	monthlygst =(monthlysalary * 3)/100;	
	}
	
	void calculatenetmonthlysalary() {
	netmonthlysalary =(monthlysalary-monthlygst-monthlypf);	
	}
	
	void calculateannualgst() {
	annualgst =(monthlygst*12);	
	}
	
	void calculateannualpf() {
	annualpf =(monthlypf*12);
	}
	void calculateannualnetsalary() {
	annualnetsalary=(netmonthlysalary*12);	
	}
	
	void employeedetails() {
	System.out.println("monthlysalary is: "+monthlysalary);
	System.out.println("emplyeename is: "+employeename);
	System.out.println("monthlygst is: "+monthlygst);
	System.out.println("monthlypf is: "+monthlypf);
	System.out.println("netmonthlysalary is: "+netmonthlysalary);
	System.out.println("annualgst is: "+annualgst);
	System.out.println("annualpf is: "+annualpf);
	System.out.println("annualnetsalary is: "+annualnetsalary);
		
	}
	

	public static void main(String[] args) {
    Employee p1 = new Employee();
    Employee p2 = new Employee();
    p1.monthlysalary = 5000;
    p1.employeename ="Nagaraju";
    p1.calculatemonthlypf();
    p1.calculatemonthlygst();
    p1.calculatenetmonthlysalary();
    p1.calculateannualgst();
    p1. calculateannualpf();
    p1. calculateannualnetsalary();
    p1.employeedetails();
    System.out.println("------------------------------------");
    p2.monthlysalary = 6000;
    p2.employeename ="Shiva";
    p2.calculatemonthlypf();
    p2.calculatemonthlygst();
    p2.calculatenetmonthlysalary();
    p2.calculateannualgst();
    p2. calculateannualpf();
    p2. calculateannualnetsalary();
    p2.employeedetails();

	}

}
