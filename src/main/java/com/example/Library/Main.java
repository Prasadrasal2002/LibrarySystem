package com.example.library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LibraryService library = new LibraryService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Library Management System");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book by Title");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author Name: ");
                    String author = scanner.nextLine();
                    library.addBook(title, author);
                    System.out.println("Book added successfully.");
                    break;

                case 2:
                    System.out.println("Books in Library:");
                    for (Book book : library.viewAllBooks()) {
                        System.out.println(book);
                    }
                    break;

                case 3:
                    System.out.print("Enter Book Title to Search: ");
                    String searchTitle = scanner.nextLine();
                    Book foundBook = library.searchBookByTitle(searchTitle);
                    if (foundBook != null) {
                        System.out.println("Book Found: " + foundBook);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
