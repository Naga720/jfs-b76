package com.javaintro;

public class Student {
	
	int rollNo = 101;
	String Name = "Nagaraju";
	int empid = 102;
	String name = "shiva";
	int salary = 100;
	void Display() {
		
		System.out.println("rollNo = " + rollNo);
		System.out.println("Name = " + Name);
		System.out.println("empid = " + empid);
		System.out.println("name = " + name);
		System.out.println("salary = " + salary);
		
	}
	static void student() {
		System.out.println("My name  is kodari nagaraju");
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		
		s1.Display();
		student();
		

	}

}
