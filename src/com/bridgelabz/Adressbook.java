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
        System.out.println("Contact added successfully.\n");
        System.out.println(addressbooklist);
    }

    /* edit the contact */
    void editContactDetails() {
        System.out.println("Enter the Firstname of the contact which you want to edit :  ");
        String name = scanner.next();
        boolean flag = false;

        for(int person = 0; person < addressbooklist.size(); person++) {   			//for all the contacts in the arraylist
            if(addressbooklist.get(person).getFirstName().equals(name)) {
                flag = true;
                System.out.println("Please select any one option(1-8) to change the contact details" + "\n" + "PRESS1 to edit FirstName" + "\n" + "PRESS2 to edit Lastname" + "\n" +"PRESS3 to edit Address"
                        + " + \nPRESS4 to edit City" + "\n" + "PRESS5 to edit State" + "\n" + "PRESS6 to edit zip" + "\n" + "PRESS7 to edit PhoneNumber" + "\n" + "PRESS8 to edit Email");
                int choiceEdit = scanner.nextInt();

                switch (choiceEdit) {
                    case 1:
                        System.out.println("Enter new FirstName : ");
                        addressbooklist.get(person).setFirstName(scanner.next());
                        break;
                    case 2:
                        System.out.println("Enter new Lastname : ");
                        addressbooklist.get(person).setLastName(scanner.next());
                        break;
                    case 3:
                        System.out.println("Enter new Address : ");
                        addressbooklist.get(person).setAddress(scanner.next());
                        break;
                    case 4:
                        System.out.println("Enter new City : ");
                        addressbooklist.get(person).setCity(scanner.next());
                        break;
                    case 5:
                        System.out.println("Enter new State :  ");
                        addressbooklist.get(person).setState(scanner.next());
                        break;
                    case 6:
                        System.out.println("Enter new ZIP : ");
                        addressbooklist.get(person).setZip(scanner.next());
                        break;
                    case 7:
                        System.out.println("Enter new PhoneNumber : ");
                        addressbooklist.get(person).setPhoneNumber(scanner.next());
                        break;
                    case 8:
                        System.out.println("Enter new Email : ");
                        addressbooklist.get(person).setEmail(scanner.next());
                        break;
                    default:
                        System.out.println("Wrong choice!!!! Please try again later. ");
                        return;
                }
                System.out.println("Details of the contact after edited: ");
                System.out.println(addressbooklist.get(person));
                return;
            }
        }
        if (flag == false)
            System.out.println("Sorry!!! There is no such contact present. Please check the firstname and try again.");

    }

    /* Delete a contact*/
    void deleteContact() {
        System.out.println("Enter the firstname of teh contact which you want to delete : ");
        String name = scanner.next();
        for(int person = 0; person < addressbooklist.size(); person++) {
            if(addressbooklist.get(person).getFirstName().equals(name)) {
                addressbooklist.remove(person);
                System.out.println("Contact deleted.");
                return;
            }else {
                System.out.println("Contact NOT FOUND with '" + name + "'. Please check again and retry.");
            }
        }
    }

    /* Add Multiple contacts */
    void addMultipleContacts() {
        System.out.println("How many contacts do you want to add now : ");
        int number = scanner.nextInt();
        if(number <= 0) {
            System.out.println("Invalid Input!!!");
        }else {
            for(int i = 1; i <= number; i++) {
                addcontactdetail();
                System.out.println("( " + i + " Contact added. )");
            }
        }
    }
}

