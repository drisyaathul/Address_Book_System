package com.bridgelabz;

public class AddressBookMain {

    public static void main(String[] args) {
        System.out.println("**** Welcome to ADDRESS BOOK PROGRAM ****");

        AddressBook contacts = new AddressBook();
        contacts.setFirstName("Drisya");
        System.out.println(contacts.getFirstName());
        contacts.setSecondName("Athul");
        System.out.println(contacts.getSecondName());
        contacts.setAddress("Sreyas House");
        System.out.println(contacts.getAddress());
        contacts.setCity("Calicut");
        System.out.println(contacts.getCity());
        contacts.setState("Kerala");
        System.out.println(contacts.getState());
        contacts.setZip("673501");
        System.out.println(contacts.getZip());
        contacts.setPhoneNumber("0112345250");
        System.out.println(contacts.getPhoneNumber());
        contacts.seteMail("drisyak809@gmail.com");
        System.out.println(contacts.geteMail());
    }
}
