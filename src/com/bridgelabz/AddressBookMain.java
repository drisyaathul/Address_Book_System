package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {

    ArrayList <AddressBook> contactDetails = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void AddNewContact(){

        AddressBook newContacts = new AddressBook();

        System.out.println("Enter the FirstName : ");
        newContacts.setFirstName(scanner.nextLine());
        System.out.println("Enter the Second Name : ");
        newContacts.setSecondName(scanner.nextLine());
        System.out.println("Enter the Address : ");
        newContacts.setAddress(scanner.nextLine());
        System.out.println("Enter the City : ");
        newContacts.setCity(scanner.nextLine());
        System.out.println("Enter the State : ");
        newContacts.setState(scanner.nextLine());
        System.out.println("Enter the Zip : ");
        newContacts.setZip(scanner.nextLine());
        System.out.println("Enter the Phone Number : ");
        newContacts.setPhoneNumber(scanner.nextLine());
        System.out.println("Enter the E-mail id : ");
        newContacts.seteMail(scanner.nextLine());
        contactDetails.add(newContacts);
    }
    public void displayDetails(){
        System.out.println(contactDetails);
    }
    public static void main(String[] args) {
        System.out.println("**** Welcome to ADDRESS BOOK PROGRAM ****");

        AddressBookMain person = new AddressBookMain();
        person.AddNewContact();
        person.displayDetails();
    }
}
