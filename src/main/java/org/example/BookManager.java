package org.example;

public interface BookManager {

    void addBook(Book book);

    void deleteBook(String title);

    void displayBooks();

    void findBook(String title);

    void sortBooksByTitle();

    void sortBooksByAuthor();


}
