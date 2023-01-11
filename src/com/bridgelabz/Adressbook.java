package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class Adressbook {

   static Scanner scanner = new Scanner(System.in);

    ArrayList<Contact1> addressbooklist = new ArrayList<>();
    Contact1 Contact = new Contact1();

    void addcontactdetail() {

        System.out.println("enter first name");
        String firstname= scanner.next();
        System.out.println("enter last name");
        String lastname= scanner.next();
        System.out.println("enter your address");
        String address= scanner.next();
        System.out.println("enter your state");
        String state= scanner.next();
        System.out.println("enter your city");
        String city=scanner.next();
        System.out.println("enter zip code");
        String zip=scanner.next();
        System.out.println("enter email address");
        String email=scanner.next();

        Contact.setFirstName(firstname);
        Contact.setLastName(lastname);
        Contact.setAddress(address);
        Contact.setState(state);
        Contact.setCity(city);
        Contact.setZip(zip);
        Contact.setEmail(email);
        addressbooklist.add(Contact);


    }
}