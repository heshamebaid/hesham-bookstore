package model;

import service.MailService;

public class EBook extends Book {
    private String fileType;

    public EBook(String isbn, String title, String author, int year, double price, String fileType) {
        super(isbn, title, author, year, price);
        this.fileType = fileType;
    }

    @Override
    public double buy(int quantity, String email, String address) {
        if (!isForSale()) throw new IllegalStateException("Hesham's Bookstore: EBook is not for sale.");
        MailService.sendTo(email);
        return price * quantity;
    }

    @Override
    public boolean isForSale() {
        return true;
    }
}
