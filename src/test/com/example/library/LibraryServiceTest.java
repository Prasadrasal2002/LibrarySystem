package com.example.library;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryServiceTest {
    @Test
    public void testAddBook() {
        LibraryService library = new LibraryService();
        library.addBook("The Great Gatsby", "F. Scott Fitzgerald");
        assertEquals(1, library.viewAllBooks().size());
    }

    @Test
    public void testSearchBookByTitle() {
        LibraryService library = new LibraryService();
        library.addBook("To Kill a Mockingbird", "Harper Lee");
        Book book = library.searchBookByTitle("To Kill a Mockingbird");
        assertNotNull(book);
        assertEquals("To Kill a Mockingbird", book.getTitle());
    }

    @Test
    public void testSearchBookNotFound() {
        LibraryService library = new LibraryService();
        Book book = library.searchBookByTitle("Nonexistent Book");
        assertNull(book);
    }
}
