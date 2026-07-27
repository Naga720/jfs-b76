package com.javaintro;

public class Department {
	
	int DepartmentNumber = 101;
	String DepartmentName = "computer science";
	String Location = "Hyderabad";
	 int TotalEmployees = 50;
	 String hodName = "Ramesh";
	void hello() {
		System.out.println("DepartmentNumber = " + DepartmentNumber);
		System.out.println("DepartmentName = " + DepartmentName);
		System.out.println("Location = " + Location);
		System.out.println("TotalEmployees = " + TotalEmployees);
		System.out.println("HODName = " + hodName);
		
	}
	static void department() {
		System.out.println("my name is kodari nagaraju");
	}

	public static void main(String[] args) {
		Department d1 = new Department();
		
		d1.hello();
      department();
	}

}
