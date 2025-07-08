/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fawry.quantumbookstore;

/**
 *
 * @author Mohamed
 */
public class PaperBook extends Book {

    private int stock;

    public PaperBook(String isbn, String title, String author, int year, Double price ,int stock) {
        super(isbn, title, author, year, price);
        this.setStock(stock);
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock < 0){
            throw new IllegalArgumentException("Stock can't be negative");
        }
        this.stock = stock;
    }

    public void decreaseStock(int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be positive and greater than Zero");
        }
        if (quantity > stock) {
            throw new IllegalArgumentException("Not enough stock");
        }
        stock -= quantity;
    }

    @Override
    public boolean isAvailable(int quantity) {
        return quantity <= stock;
    }

    @Override
    public void deliver(String address) {
        if (address == null || address.isBlank()) {
            throw new IllegalArgumentException("Address can't be null or empty");
        }
        if (ShippingService.ship(this, address)){
            System.out.println("Book " + this.getTitle() + " shipping to Address " + address);
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", stock = " + stock + '}';
    }
}
