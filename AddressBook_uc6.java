package com.oops.concept;

import java.util.ArrayList;

public class AddressBook {
    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private int phone_no;
    public String city;
    public int zip;
    public int state;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(int phone_no) {
        this.phone_no = phone_no;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "AddressBook{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", phone_no=" + phone_no +
                ", city=" + city +
                ", zip=" + zip +
                ", state=" + state +
                '}';
    }

    public static void main(String[] args) {
        System.out.println("welcome to addressBook problem");
        AddressBook addressBook = new AddressBook();
       addressBook.firstName = "murtaza";
       addressBook.lastName = "Ahmed";
       addressBook.address = "kishtwar";
       addressBook.phone_no = 676368389;
       addressBook.email = "malik@123";
       addressBook.city =  "kashmir";
       addressBook.zip = 2356677;
       System.out.println(addressBook);

       AddressBook addressBook1 = new AddressBook();
       addressBook1.firstName = "shahyeem";
       addressBook1.lastName = "malik";
       addressBook1.email = "shayeem@123";
       addressBook1.city = "jammu";
       addressBook1.city = "doda";
       addressBook1.zip = 6573893;
       addressBook1.phone_no = 984674899;
       System.out.println(addressBook1);
    }
}
