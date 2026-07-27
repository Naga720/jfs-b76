package com.javaintro;

public class Movie {
  String movieName;
  int releasedyear;
  static double ticketprice;
 
	public static void main(String[] args) {
		
		Movie ab = new Movie();
		
		ab.movieName = "peddi";
		ab.releasedyear = 2026;
		ab.ticketprice = 300;
		System.out.println("ab.MovieName:= " + ab.movieName);
		System.out.println("ab.releasedyear:= " + ab.releasedyear);
		System.out.println("ab.ticketprice:= " + ab.ticketprice);
		
	   Movie pb = new Movie();
	    pb.movieName = "lenin";
	    pb.releasedyear = 2026;
	    pb.ticketprice = 400;
	    System.out.println("pb.MovieName: = "+ pb.movieName);
	    System.out.println("pb.releasedyear: = "+ pb.releasedyear);
	    System.out.println("pb.ticketpricee: = "+ pb.ticketprice);

	}

}
