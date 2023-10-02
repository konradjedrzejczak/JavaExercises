package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class ContactMenager {

     ArrayList<Contact> contacts = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ContactMenager contactMenager = new ContactMenager();

        while (true) {

            System.out.println("Podaj imie kontaktu");
            String name = scan.nextLine();

            System.out.println("Podaj numer kontaktu");
            String phoneNumber = scan.nextLine();

            if (name.equalsIgnoreCase ("exit") || phoneNumber.equalsIgnoreCase("exit")){
                break;
            }
            Contact newContact = new Contact(name, phoneNumber);
            contactMenager.contacts.add(newContact);

            contactMenager.contacts.stream().map(Objects::toString).forEach(System.out::println);
        }

    }

}
