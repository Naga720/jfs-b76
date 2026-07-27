package com.javaintro;

public class Cricketer {

    int jerseyNo;
    String cricketerName;
    int countryID;
    String countryName;

    public static void main(String[] args) {

        Cricketer rohith = new Cricketer();
        rohith.jerseyNo = 50;
        rohith.cricketerName = "nagaraju";
        rohith.countryID = 92;
        rohith.countryName = "India";

        System.out.println(rohith.countryID);
        System.out.println(rohith.countryName);
        System.out.println(rohith.jerseyNo);
        System.out.println(rohith.cricketerName);
    }
}