package com.javaintro;

public class Hello {
	
	void congratulations() {
		
		System.out.println("my name is kodari nagaraju");
	}
	
	 static void welcome() {
	
	System.out.println("good morning have a nice day");
}
	public static void main(String[] args) {
		System.out.println("Main method started");
		welcome();
		Hello nag = new Hello();
		nag.congratulations();
		System.out.println("main method is ended");
		System.out.println("Main method ended");
		
	}

}
