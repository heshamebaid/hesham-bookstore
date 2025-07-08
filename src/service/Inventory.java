package service;

import model.Book;
import java.util.*;

public class Inventory {
    private Map<String, Book> books = new HashMap<>();

    public void addBook(Book book) {
        books.put(book.getIsbn(), book);
        System.out.println("Hesham's Bookstore: Added book - " + book.getTitle());
    }

    public List<Book> removeOutdated(int yearsOld, int currentYear) {
        List<Book> removed = new ArrayList<>();
        for (Book book : new ArrayList<>(books.values())) {
            if (currentYear - book.getYear() > yearsOld) {
                books.remove(book.getIsbn());
                removed.add(book);
                System.out.println("Hesham's Bookstore: Removed outdated book - " + book.getTitle());
            }
        }
        return removed;
    }

    public double buyBook(String isbn, int quantity, String email, String address) {
        Book book = books.get(isbn);
        if (book == null)
            throw new IllegalArgumentException("Hesham's Bookstore: Book not found: " + isbn);
        return book.buy(quantity, email, address);
    }

    public void listBooks() {
        System.out.println("Hesham's Bookstore: Current inventory:");
        for (Book book : books.values()) {
            System.out.println(" - " + book.getTitle() + " by " + book.getAuthor() + " (" + book.getYear() + ")");
        }
    }
}
