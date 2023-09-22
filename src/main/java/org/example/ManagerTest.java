package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class ManagerTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What size of pizza? ");
        String input = scan.next().toUpperCase();
        try {
            Size size = Size.valueOf(input);
            System.out.println("Rozmiar: " + size);
            System.out.println("Skrót: " + size.getabbrevation());
        } catch (IllegalArgumentException e) {
            System.out.println("Nieprawidłowy rozmiar");
        }

    }
}