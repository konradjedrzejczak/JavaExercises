package org.example;

import java.util.*;

public class ContactMenager {

     ArrayList<Contact> contacts = new ArrayList<>();
     private static ContactMenager contactMenager = new ContactMenager();
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        while (true) {
            System.out.println("Podaj imie kontaktu");
            String name = scan.nextLine();

            System.out.println("Podaj numer kontaktu");
            String phoneNumber = scan.nextLine();

            if ((name.equalsIgnoreCase("exit")) || (phoneNumber.equalsIgnoreCase("exit"))){
                break;
            }
            Contact newContact = new Contact(name, phoneNumber);
            contactMenager.contacts.add(newContact);

            System.out.println("Podaj imie do wyszukania");
            String searchName = scan.nextLine();
            contactMenager.searchContact(searchName);

            System.out.println("Podaj kontakt do usuniecia");
            String removeContact = scan.nextLine();
            contactMenager.removeContact(removeContact);

            contactMenager.sortContacts(Comparator.comparing(Contact::getName));
            contactMenager.contacts.stream().map(Objects::toString).forEach(System.out::println);

        }
    }
    public void sortContacts(Comparator<Contact> comparator){
        Collections.sort(contacts,comparator );
        System.out.println("Kontakty posrtotowane: ");
    }

    public void searchContact(String name){
        contactMenager.contacts.stream()
                .filter(contact -> contact.hasName(name))
                .findFirst()
                .ifPresentOrElse
                        (contact -> System.out.println("Znaleziono kontakt" + contact),()
                                ->System.out.println("nie znaleziono kontaktu o imieniu" + name));
    }

    public void removeContact(String name){
        contacts.removeIf(contact -> contact.getName().equalsIgnoreCase(name));
        System.out.println("Kontakt usuniety " + name);
    }



}
