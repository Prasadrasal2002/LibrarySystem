package com.example.library;

import java.util.ArrayList;
import java.util.List;

public class LibraryService {
    private final List<Book> books;

    public LibraryService() {
        books = new ArrayList<>();
    }

    public void addBook(String title, String author) {
        books.add(new Book(title, author));
    }

    public List<Book> viewAllBooks() {
        return books;
    }

    public Book searchBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }
}
