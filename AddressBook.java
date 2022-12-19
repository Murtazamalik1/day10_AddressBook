package day100;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    ArrayList<Contacts> list = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    void addContact() {
        Contacts contact = new Contacts();
        System.out.println("Enter first name");
        contact.setFirstName(scanner.next());
        System.out.println("Enter last name");
        contact.setLastName(scanner.next());
        System.out.println("Enter city");
        contact.setCity(scanner.next());
        System.out.println("Enter state");
        contact.setState(scanner.next());
        System.out.println("Enter address :");
        scanner.nextLine();
        contact.setAddress(scanner.nextLine());
        System.out.println("Enter zipCode");
        contact.setZip(scanner.nextInt());
        System.out.println("Enter phone Number");
        contact.setPhoneNumber(scanner.nextLong());
        System.out.println("Enter email");
        contact.setEmail(scanner.next());
        list.add(contact);
    }

    void editContact() {
        System.out.println("Enter first name to edit");
        String firstName = scanner.next().toLowerCase();

        boolean found = false;
        for (Contacts contact : list) {
            if (firstName.equals(contact.getFirstName().toLowerCase())) {
                System.out.println("Edit the details of person");
                System.out.println("Enter first name:");
                contact.setFirstName(scanner.next());

                System.out.println("Enter last name");
                contact.setLastName(scanner.next());

                System.out.println("Enter city");
                contact.setCity(scanner.next());

                System.out.println("Enter state");
                contact.setState(scanner.next());

                System.out.println("Enter address :");
                scanner.nextLine();
                contact.setAddress(scanner.nextLine());

                System.out.println("Enter zipCode");
                contact.setZip(scanner.nextInt());

                System.out.println("Enter phone Number");
                contact.setPhoneNumber(scanner.nextLong());

                System.out.println("Enter email");
                contact.setEmail(scanner.next());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No contact found");
        }
    }


    void deleteContact() {
        System.out.println("Enter first name of person to delete");
        String firstName = scanner.next().toLowerCase();
        boolean found = false;
        for (Contacts contact : list) {
            if (firstName.equals(contact.getFirstName().toLowerCase())) {
                list.remove(contact);
                found = true;
                System.out.println("Contacts deleted Successfully");
                break;
            }
        }
        if (!found) {
            System.out.println("No contact found");
        }
    }

    void displayContacts() {
        if (list.isEmpty()) {
            System.out.println("No contacts to display");
        } else {
            for (Contacts contacts : list) {
                System.out.println(contacts);
            }
        }
    }
}
