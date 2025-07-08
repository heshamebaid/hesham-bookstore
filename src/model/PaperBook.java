package model;

import service.ShippingService;

public class PaperBook extends Book {
    private int stock;

    public PaperBook(String isbn, String title, String author, int year, double price, int stock) {
        super(isbn, title, author, year, price);
        this.stock = stock;
    }

    @Override
    public double buy(int quantity, String email, String address) {
        if (!isForSale()) throw new IllegalStateException("Hesham's Bookstore: Paper book is not for sale.");
        if (quantity > stock) throw new IllegalArgumentException("Hesham's Bookstore: Not enough stock.");
        stock -= quantity;
        ShippingService.sendTo(address);
        return price * quantity;
    }

    @Override
    public boolean isForSale() {
        return stock > 0;
    }
}
