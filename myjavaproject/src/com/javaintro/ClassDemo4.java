package com.javaintro;

public class ClassDemo4 {
	
	static void b1() {
		int a = 20;
		int b = 30;
		System.out.println(a+b);	
	}
	static void b2() {
		int a = 20;
		int b = 30;
		System.out.println(a-b);
	}
	static ClassDemo4 t = new ClassDemo4();
	void b3(){
		int a = 20;
		int b = 30;
		System.out.println(a*b);	
	}
	
	void b4(){
		int a = 20;
		int b = 30;
		System.out.println(a/b);	
	}
public static void main(String[] args) {
		b1();
		b2();
       t.b3();
       t.b4();    
	}

}
