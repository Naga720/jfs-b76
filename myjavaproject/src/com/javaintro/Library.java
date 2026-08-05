package com.javaintro;

public class Library {
	    static String libraryname="vcube library";
	    static String librarianname= "srikanth sir";
	    
	    int bookid;
	    String booktitle;
	    String authorname;
	    int availablecopies;
	    
	    void Bookdetails() {
	    System.out.println("bookid is: "+bookid);
	    System.out.println("booktitle is: "+booktitle);
	    System.out.println("authorname is: "+authorname);
	    System.out.println("availablecopies is: "+availablecopies);
	    }
	    
	    void issuebook() {
	    	availablecopies=availablecopies-1;
	    }
	    
	    static void librarydetails() {
	    System.out.println("libraryname is: "+libraryname);
	    System.out.println("libraianname is: "+librarianname);
	    }
	    
	    static void changelibraian() {
	    	librarianname = "viswanath sir";
	    }

	public static void main(String[] args) {
   
	Library l1 = new Library();
	Library l2 = new Library();
	l1.bookid = 12;
	l1.booktitle = "slice";
	l1.authorname = "siva";
	l1.availablecopies = 30;
	l1.Bookdetails();
	l1.issuebook();
	l1.librarydetails();
	
	l1.changelibraian();
	l1.Bookdetails();
	l1.librarydetails();
	
	l2.bookid=14;
	l2.booktitle = "english";
l2.authorname = "nagaraju";
l2.availablecopies = 40;
	l2.changelibraian();
	l2.Bookdetails();
	l2.librarydetails();
	}

}
