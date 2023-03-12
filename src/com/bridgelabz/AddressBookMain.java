package com.bridgelabz;


import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {
        System.out.println("**** Welcome to ADDRESS BOOK PROGRAM ****");

        Scanner scanner = new Scanner(System.in);
        ContactPerson person = new ContactPerson();
        person.AddNewContact();
        person.displayDetails();

        System.out.println("-----------------------------------------------------");
        System.out.println("Enter the First Name for which you want to Edit the Details: ");
        String firstName = scanner.next();
        person.editContact(firstName);
        System.out.println("-----------------------------------------------------");
        person.deletePerson();

    }
}
