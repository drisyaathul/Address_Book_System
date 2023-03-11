package com.bridgelabz;

public class AddressBook {
    private String firstName, secondName, address, city, state, zip, phoneNumber, eMail;

    public void AddressBook(String firstName, String secondName, String address, String city, String state, String zip, String phoneNumber, String eMail) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.eMail = eMail;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getSecondName() {
        return secondName;
    }
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getZip() {
        return zip;
    }
    public void setZip(String zip) {
        this.zip = zip;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String geteMail() {
        return eMail;
    }
    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
    public String toString() {
        return ("FirstName:" + firstName + " SecondName:" + secondName + " Address:" + address + " City:" + city + " State:" + state +
                " Zip:" + zip + " PhoneNumber:" + phoneNumber + " EmailId:" + eMail);
    }
}