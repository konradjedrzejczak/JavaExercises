package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Library implements BookManager{

    private List<Book> books = new ArrayList<>();

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public void deleteBook(String title) {
        books.removeIf(book -> book.getTitle().equals(title));
    }

    @Override
    public void displayBooks() {
        System.out.println("BOoks list:");
        books.forEach(book -> System.out.println((book.getTitle()) + " - " +
                book.getAuthor() + " - " + book.getPublicationYear() + ")"));
    }

    @Override
    public void findBook(String title) {
        books.contains(title);
    }

    @Override
    public void sortBooksByTitle() {
        Collections.sort(books, Comparator.comparing(Book::getTitle));
    }

    @Override
    public void sortBooksByAuthor(){
        Collections.sort(books, Comparator.comparing(Author::getName));
    }

}
