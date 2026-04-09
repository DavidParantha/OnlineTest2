package org.example;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBook(new Book(1, "Java Basics", "David", true));
        lib.addBook(new Book(2, "Data Structures", "Suman Sir", true));
        lib.addBook(new Book(3, "Operating Systems", "Akash", true));
        lib.addBook(new Book(4, "Computer Networks", "Mehere", true));
        lib.addBook(new Book(5, "DBMS Concepts", "Ravi", true));
        System.out.println("Available Books:");
        lib.displayAvailableBooks();
        System.out.println("\nIssued book 2:");
        lib.issueBook(2);
        System.out.println("\nIssu book 2 again:");
        lib.issueBook(2);
        System.out.println("\nReturn book 2:");
        lib.returnBook(2);
        System.out.println("\nReturn book 2 again:");
        lib.returnBook(2);
        System.out.println("\nIssue invalid book:");
        lib.issueBook(10);
        System.out.println("\nAvailable Books now:");
        lib.displayAvailableBooks();
    }
}