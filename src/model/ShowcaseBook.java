package model;

public class ShowcaseBook extends Book {
    public ShowcaseBook(String isbn, String title, String author, int year, double price) {
        super(isbn, title, author, year, price);
    }

    @Override
    public double buy(int quantity, String email, String address) {
        throw new UnsupportedOperationException("Hesham's Bookstore: Showcase books are not for sale.");
    }

    @Override
    public boolean isForSale() {
        return false;
    }
}
