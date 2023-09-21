package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Library {

    private ArrayList< Book > books = new ArrayList<>();

    public void addBook (Book book){
        books.add(book);
    }

    public void removeBook (Book book){
        books.remove(book);
    }

    public Stream<Book> getBooksStream() {
        return books.stream();
    }

}
