package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        Book book1 = new Book("Adventures of Tom Sawyer", "Mark Twain");
        Book book2 = new Book("Ben Hur", "Lewis Wallace");
        Book book3 = new Book("Time Machine", "H.G. Wells");
        Book book4 = new Book("Anna Karenina", "Leo Tolstoy");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);


        library.getBooksStream().
                forEach(book -> System.out.println(book.getTitle() + "" + book.getAuthor()));


    }
}