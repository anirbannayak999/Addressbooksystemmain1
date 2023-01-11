package com.bridgelabz;

import java.util.Scanner;

public class AddressBookmain {
Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("welcome to addressbook");
        Adressbook adressbook=new Adressbook();
        adressbook.addcontactdetail();
        System.out.println(adressbook.addressbooklist);
        System.out.println( adressbook.Contact.getFirstName());
        System.out.println(adressbook.Contact.getLastName());
        System.out.println(adressbook.Contact.getAddress());
        System.out.println(adressbook.Contact.getState());
        System.out.println(adressbook.Contact.getCity());
        System.out.println(adressbook.Contact.getEmail());
        System.out.println(adressbook.Contact.getZip());
    }
    
    
}
