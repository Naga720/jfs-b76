package com.javaintro;

public class Student3 {
  static String collegename = "sreenidhi institute of science and technology";
  static String principalname = "satyam sir";
  
  int studentid;
  String studentname;
  String course;
  int marks;
  
  void studentdetails() {
	System.out.println("studentid is: "+studentid);
	System.out.println("studentname is: "+studentname);
	System.out.println("course is: "+course);
	System.out.println("marks is: "+marks);
  }
  
  void calculategrade() {
	  if (marks >= 90) {
          System.out.println("Grade : A+");
      }
      else if (marks >= 80) {
          System.out.println("Grade : A");
      }  
  }
  
  static void collegedetails() {
	System.out.println("collegename is: "+collegename);
	System.out.println("principalname is: "+principalname);
  }
  
  static void changeprincipal() {
	 principalname = "raju sir";
  }
	public static void main(String[] args) {
	Student3 s1 = new Student3();
	Student3 s2 = new Student3();
	
	s1.studentid = 121;
	s1.studentname = "nagaraju";
	s1.course = "ece";
	s1.marks = 100;
	

	s1.studentdetails();
	s1.calculategrade();
	s1.collegedetails();
	
	s1.changeprincipal();

	
	s2.studentid = 131;
	s2.studentname = "shiva";
	s2.course = "cse";
	s2.marks = 90;
	
	s2.studentdetails();
	s2.calculategrade();
	s2.collegedetails();
	
	s2.changeprincipal();
	
	

	}

}
