package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {


        System.out.println("**** Welcome to ADDRESS BOOK PROGRAM ****");

        ContactPerson person = new ContactPerson();
        person.AddNewContact();
        person.displayDetails();
        System.out.println("-----------------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Name for which you want to Edit the Details: ");
        String firstName = scanner.next();
        person.editContact(firstName);
        System.out.println("-----------------------------------------------------");
        person.deletePerson();
        }
    }
