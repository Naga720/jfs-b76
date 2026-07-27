package com.javaintro;

public class HelloWorld {
 static void m1() {
	 m2();
	 System.out.println("Method 1 called");
	 }
		static void m2() {
			System.out.println("method 2 called");
			//HelloWorld s1 = new HelloWorld();
			//s1.Hello();
		}
	/*void Hello() {
			System.out.println("method 3 started");
			Hello1();
		}
		void Hello1() {
			System.out.println("method 4 started");
		}*/
	 
	public static void main(String[] args) {
	//System.out.println("my name kodari nagaraju");
	m1();
	
	

	}

}
