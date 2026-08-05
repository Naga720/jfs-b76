package com.javaintro;

public class Shoppingcart {
 int items;
 int totalamount;
 String orderplaced;
 
 static String website = "Pizzahut";
 
 void additem(){
items++;
totalamount+=250;
 }
 
 void placeorder() {
	 String orderplaced = "ordered";
	 System.out.println("the orderplaced is: "+orderplaced);
 }
 
 void displaycart() {
	 System.out.println();
	 System.out.println("the website is: "+website);
	 System.out.println("the number of item is: "+items);
	 System.out.println("the totalamount is: "+totalamount);
	 System.out.println("the orderplaced is: "+orderplaced);
	 
 }
 static void changewebsite() {
	 website = "dominos";
	//System.out.println("the website is: "+website);
 }


	public static void main(String[] args) {

 Shoppingcart c1 = new Shoppingcart();
 Shoppingcart c2 = new Shoppingcart();
 c1.items = 4;
 c1.totalamount = 150;
 c1.orderplaced = "ordered";
 c1.additem();
 
 c1.placeorder();
 c1.displaycart();

 c2.items = 3;
 c2.totalamount = 170;
 c2.orderplaced = "ordered";
 
 c2.additem();
 c2.placeorder();

 c2.changewebsite();
 
 c1.displaycart();
 c2.displaycart();

	}

}
