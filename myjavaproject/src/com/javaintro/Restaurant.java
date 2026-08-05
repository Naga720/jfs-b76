package com.javaintro;

public class Restaurant {
	int tablenumber;
	int seat;
	String reserved;
	
	static String restaurantname = "pista house";
	
	void reservetable() {
	System.out.println("the table reserved is:"+tablenumber);
	System.out.println("the table status is:"+reserved);
	
	}
	
	void cancelreservation() {
	System.out.println("reserved cancelled for tablenumber: "+tablenumber);
	}
	
	void tabledetails() {
	System.out.println("tablenumber is: "+ tablenumber);
	System.out.println("seatnumber is: "+ seat);
	System.out.println("reserved is: "+ reserved);
	System.out.println("restaurantname is : "+restaurantname );
	}
	
	
	static void restaurantname() {
	System.out.println("The restaruantname is:"+restaurantname);
	}
	
	static void changerestaurantname() {
		String restaurantname = "mehfil";	
		}

	public static void main(String[] args) {
	Restaurant r1 = new Restaurant();
	Restaurant r2 = new Restaurant();
	r1.tablenumber = 12;
	r1.seat = 30;
	r1.reserved = " not reserved";
	
	r1.tablenumber = 15;
	r1.seat = 35;
	r1.reserved = "reserved";
	
	r1.reservetable();
	r1.cancelreservation();
	r1.tabledetails();
	
	r1.changerestaurantname();
	
	r2.reservetable();
	r2.cancelreservation();
	r2.tabledetails();
	
	

}
}
