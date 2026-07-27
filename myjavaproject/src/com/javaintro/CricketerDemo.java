package com.javaintro;

public class CricketerDemo {
int jerseyNo;
String countryName;
String cricketerName;
int age;
String boardName;
	public static void main(String[] args) {
		CricketerDemo rohith = new CricketerDemo();
		rohith.jerseyNo = 92;
		rohith.countryName = "India";
		rohith.cricketerName = "rohithsharma";
		rohith.age = 50;
	System.out.println("rohith.jerseyNo: = " + rohith.jerseyNo);
	System.out.println("rohith.countryName: = " + rohith.countryName);
	System.out.println("rohith.cricketerName: = " + rohith.cricketerName);
	System.out.println("rohith.age: = " + rohith.age);

    CricketerDemo vk = new CricketerDemo();
    
    vk.cricketerName = "viratkohli";
    vk.countryName = "bharath";
    System.out.println("vk.cricketername = " + vk.cricketerName);
    System.out.println("vk.countryname = " + vk.countryName);
   CricketerDemo ab = new CricketerDemo();
   ab.cricketerName = "sundar";
   ab.jerseyNo = 40;
   ab.age = 50;
   ab.countryName = "england";
   ab.boardName = "bcci";
   System.out.println("ab.jerseyNo: = " + ab.jerseyNo);
   System.out.println("ab.cricketerName: = " + ab.cricketerName);
   System.out.println("ab.countryName: = " + ab.countryName);
   System.out.println("ab.age: = " + ab.age);
	}

}
