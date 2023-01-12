package com.bridgelabz;

import java.util.Scanner;

public class AddressBookmain {

    public static void main(String[] args) {
        System.out.println("welcome to addressbook system");
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
        adressbook.addcontactdetail();
        System.out.println(adressbook.addressbooklist);
        System.out.println( adressbook.Contact.getFirstName());
        System.out.println(adressbook.Contact.getLastName());
        System.out.println(adressbook.Contact.getAddress());
        System.out.println(adressbook.Contact.getState());
        System.out.println(adressbook.Contact.getCity());
        System.out.println(adressbook.Contact.getEmail());
        System.out.println(adressbook.Contact.getZip());
        boolean flag = true;
        while(flag) {
            Scanner scanner=new Scanner(System.in);

            System.out.println("\n*** Total Contacts present : " + adressbook.addressbooklist.size() + " ***");
            System.out.println("\n\nPRESS 1 for Adding Contact   ||   PRESS 2 for Editing Contact   ||   PRESS 3 for DELETEing  Contact   ||  PRESS 4 to SEE all contacts || PRESS 5 to adding  multiple Contacts");
            int choice =scanner.nextInt();

            switch (choice) {
                case 1:
                    adressbook.addcontactdetail();
                    break;
                case 2:
                    adressbook.editContactDetails();
                    break;
                case 3:
                    adressbook.deleteContact();
                    break;
                case 4:
                    System.out.println(adressbook.addressbooklist);
                    break;
                case 5:
                    adressbook.addMultipleContacts();
                    break;
                default:
                    System.out.println("Invalid Input!!!! Please try again.");
                    break;
            }
        }
    }



}
    
    
