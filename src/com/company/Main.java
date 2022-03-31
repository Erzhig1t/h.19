package com.company;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Apartment apartment = new Apartment(8, "Bokonbaev street, 12");
        System.out.println("Apartment");
        System.out.println("\nNumber of family members is: "+apartment.getFamilyMember());
        System.out.println("Family address is: "+apartment.getAddress());
        apartment.live(); apartment.payUtilities();

        Hostel hostel = new Hostel(5, "Akunbaev str., 34");
        System.out.println(hostel.getFamilyMember());
        System.out.println(hostel.getAddress());
        hostel.payRent(); hostel.live();

        Hotel hotel = new Hotel(7, "Chuy str., 87");
        System.out.println(hotel.getFamilyMember());
        System.out.println(hotel.getAddress());
        hotel.payRent(); hotel.live();





        Family[] families = {apartment, hostel, hotel};
         for(Family a: families)
        System.out.println("Family members: "+ a.getFamilyMember());
         for(Family b:families)
        System.out.println("Family addresses: "+ b.getAddress());
    }
}


