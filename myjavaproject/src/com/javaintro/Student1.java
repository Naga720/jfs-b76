package com.javaintro;

public class Student1 {
	static String collegename = "Sreenidhi institute of science and technology";
	
	int studentid;
	String studentname;
	int englishmarks;
	int telugumarks;
	int hindimarks; 
	int totalmarks;
	int percentage;
	int maxmarks=300;
	void calculateTotal() {
	totalmarks=englishmarks+telugumarks+hindimarks;
		System.out.println("Total subject marks is " + totalmarks);
	}
	void calculatepercentage() {
		percentage=(totalmarks*100)/maxmarks;
		System.out.println("percentage of subjects"+percentage);
	}
	void displaystudent() {
		System.out.println("student id is: "+studentid);
		System.out.println("student name is: "+studentname);
		System.out.println("college name is: "+collegename);
		System.out.println("telugu marks is: "+telugumarks);
		System.out.println("english marks is: "+englishmarks);
		System.out.println("hindi marks is: "+hindimarks);
		System.out.println("total marksis: "+totalmarks);
		System.out.println("percentage is: "+percentage);
	}
	public static void main(String[] args) {
		Student1 s1 = new Student1();
		s1.studentid=22311414;
		s1.studentname="Nagaraju";
		s1.englishmarks=30;
		s1.telugumarks=40;
		s1.hindimarks=50;
		s1.totalmarks=120;
		s1.calculateTotal();
		s1.calculatepercentage();
		s1.displaystudent();
		
		
		Student1 s2 = new Student1();
		s2.studentid=22311492;
		s2.studentname="rakesh";
		s2.englishmarks=20;
		s2.telugumarks=40;
		s2.hindimarks=60;
		s2.totalmarks=300;
		s2.calculateTotal();
		s2.calculatepercentage();
		s2.displaystudent();
		
	}
}


