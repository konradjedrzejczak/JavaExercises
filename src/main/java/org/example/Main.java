package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookManager bookManager = new Library();
        Scanner scan = new Scanner(System.in);

        Author author1 = new Author("Tolkien",1994);
        Author author2 = new Author("SIenkiewicz", 1992);

        Book book1 = new Book("Władca Pierścieni", author1, 1954);
        Book book2 = new Book("Harry Potter", author2, 1997);

        bookManager.addBook(book1);
        bookManager.addBook(book2);
        bookManager.displayBooks();

        String find = scan.next();
        bookManager.findBook(find);
    }
}