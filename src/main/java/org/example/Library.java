package org.example;
import java.util.ArrayList;
public class Library {
    ArrayList<Book> list = new ArrayList<>();
    public void addBook(Book b) {
        list.add(b);
    }
    public Book findBook(int id) throws MyException {
                for (Book b : list) {
            if (b.getBookId() == id) {
                return b;
            }}
        throw new MyException("Book not found");
    }
    public void issueBook(int id) {
        try {
            Book b = findBook(id);

            if (!b.isAvailable()) {
                throw new MyException("Already issued");
            }
            b.setAvailable(false);
            System.out.println("Book issued");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
    public void returnBook(int id) {
        try {
            Book b = findBook(id);
            if (b.isAvailable()) {
                throw new MyException("Invalid return");
            }
            b.setAvailable(true);
            System.out.println("Book returned");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
    public void displayAvailableBooks() {
        for (Book b : list) {
            if (b.isAvailable()) {
                System.out.println(b);
            }
        }}
}