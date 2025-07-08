import model.*;
import service.Inventory;

public class HeshamBookstoreTest {
    static Inventory inventory = new Inventory();

    public static void main(String[] args) {
        testAddBooks();
        testRemoveOutdatedBooks();
        testBuyPaperBook();
        testBuyEBook();
        testBuyShowcaseBook();
        testBuyOutOfStock();
    }

    static void testAddBooks() {
        System.out.println("Hesham's Bookstore: Testing addBooks() ...");
        inventory.addBook(new PaperBook("PB001", "Java Basics", "Hesham Ebaid", 2015, 100, 5));
        inventory.addBook(new EBook("EB001", "AI Guide", "Hesham Ebaid", 2021, 50, "PDF"));
        inventory.addBook(new ShowcaseBook("SB001", "The Ancient Tome", "Hesham Ebaid", 1900, 0));
        inventory.listBooks();
    }

    static void testRemoveOutdatedBooks() {
        System.out.println("Hesham's Bookstore: Testing removeOutdatedBooks() ...");
        inventory.removeOutdated(10, 2025);
    }

    static void testBuyPaperBook() {
        System.out.println("Hesham's Bookstore: Testing buyPaperBook() ...");
        try {
            double amount = inventory.buyBook("PB001", 2, "heshamebaid@gmail.com", "123 Nile St");
            System.out.println("Hesham's Bookstore: Paid amount = " + amount);
        } catch (Exception e) {
            System.out.println("Hesham's Bookstore: " + e.getMessage());
        }
    }

    static void testBuyEBook() {
        System.out.println("Hesham's Bookstore: Testing buyEBook() ...");
        try {
            double amount = inventory.buyBook("EB001", 1, "heshamebaid@gmail.com", "");
            System.out.println("Hesham's Bookstore: Paid amount = " + amount);
        } catch (Exception e) {
            System.out.println("Hesham's Bookstore: " + e.getMessage());
        }
    }

    static void testBuyShowcaseBook() {
        System.out.println("Hesham's Bookstore: Testing buyShowcaseBook() ...");
        try {
            inventory.buyBook("SB001", 1, "heshamebaid@gmail.com", "");
        } catch (Exception e) {
            System.out.println("Hesham's Bookstore: " + e.getMessage());
        }
    }

    static void testBuyOutOfStock() {
        System.out.println("Hesham's Bookstore: Testing buyOutOfStock() ...");
        try {
            inventory.buyBook("PB001", 1000, "heshamebaid@gmail.com", "456 Main St");
        } catch (Exception e) {
            System.out.println("Hesham's Bookstore: " + e.getMessage());
        }
    }
}
