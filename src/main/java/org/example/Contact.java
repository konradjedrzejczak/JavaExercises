package org.example;

import java.io.IOException;

public class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return ("Contact" + name + "phone number" + phoneNumber);
    }

    public boolean hasName(String nameToCheck) {
        return this.name.equalsIgnoreCase(nameToCheck);
    }

    public boolean hasPhoneNumber(String phoneNumberToCheck) {
        return this.phoneNumber.equals(phoneNumberToCheck);
    }

}
