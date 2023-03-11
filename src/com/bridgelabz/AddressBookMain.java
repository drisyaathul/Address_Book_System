package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
    ArrayList<AddressBook> contactDetails = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void AddNewContact() {
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
    public void editContact(String searchFirstName) {
        for (AddressBook contact : contactDetails) {
            String name = contact.getFirstName();
            if (name.equals(searchFirstName)) {

                System.out.println("The Details of the Person:- ");
                System.out.println("1. First Name \n2. Last Name \n3. Address \n4. City \n5. State \n6. Zip Code \n7. Contact No \n8. Email");
                System.out.println("Enter the value to Edit : ");
                int num = scanner.nextInt();
                switch (num) {
                    case 1:
                        System.out.println("Enter the first name you want to edit");
                        String updatedFirstName = scanner.next();
                        contact.setFirstName(updatedFirstName);
                        displayDetails();
                        break;
                    case 2:
                        System.out.println("Enter the Second Name you want to edit");
                        String updatedSecondName = scanner.next();
                        contact.setSecondName(updatedSecondName);
                        displayDetails();
                        break;
                    case 3:
                        System.out.println("Enter the Address you want to edit");
                        String updatedAddress = scanner.next();
                        contact.setAddress(updatedAddress);
                        displayDetails();
                        break;
                    case 4:
                        System.out.println("Enter the City you want to edit");
                        String updatedCity = scanner.next();
                        contact.setCity(updatedCity);
                        displayDetails();
                        break;
                    case 5:
                        System.out.println("Enter the State you want to edit");
                        String updatedState = scanner.next();
                        contact.setState(updatedState);
                        displayDetails();
                        break;
                    case 6:
                        System.out.println("Enter the Zip code you want to edit");
                        String updatedZipCode = scanner.next();
                        contact.setZip(updatedZipCode);
                        displayDetails();
                        break;
                    case 7:
                        System.out.println("Enter the Contact number you want to edit");
                        String updatedContact = scanner.next();
                        contact.setPhoneNumber(updatedContact);
                        displayDetails();
                        break;
                    case 8:
                        System.out.println("Enter the email You want to edit");
                        String updatedEmail = scanner.next();
                        contact.seteMail(updatedEmail);
                        displayDetails();
                        break;
                    default:
                        System.out.println("Invalid number!");
                }
            } else {
                System.out.println("No record found!");
            }
        }
    }
    public void deletePerson() {

        System.out.println("Enter FirstName to Delete the Contact : ");
        String firstName = scanner.next();
        for (AddressBook contactPerson : contactDetails) {
            if (contactPerson.getFirstName().equalsIgnoreCase(firstName)) {
                System.out.println("confirm to delete (y/n)");
                if (scanner.next().equalsIgnoreCase("y")) {
                    contactDetails.remove(contactPerson);
                    System.out.println("contact deleted");
                }
                break;
            }
            if (contactPerson.getFirstName() != firstName){
                System.out.println("Contacts Not Found!!!");
            }
        }
    }
    public void displayDetails() {
        System.out.println(contactDetails);
    }
    public static void main(String[] args) {
        System.out.println("**** Welcome to ADDRESS BOOK PROGRAM ****");

        Scanner scanner = new Scanner(System.in);
        AddressBookMain person = new AddressBookMain();
        person.AddNewContact();
        person.displayDetails();

        System.out.println("-----------------------------------------------------");
        System.out.println("Enter the First Name for which you want to Edit the Details: ");
        String firstName = scanner.next();
        person.editContact(firstName);

        person.deletePerson();
    }
}
