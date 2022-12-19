package com.day9.address;
import com.day9.address.AddressBook;

public class AddressBook_uc4 extends AddressBook {
    public static void main(String[] args) {
        System.out.println("welcome AddressBook program");
        AddressBook add = new AddressBook();
        add.addContact();
        System.out.println(add.display());
        add.editContact();
        System.out.println(add.display());
        add.deleteContact();
        System.out.println(add.display());
    }
}
