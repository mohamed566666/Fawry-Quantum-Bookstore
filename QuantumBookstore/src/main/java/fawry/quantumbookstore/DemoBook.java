/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fawry.quantumbookstore;

/**
 *
 * @author Mohamed
 */
public class DemoBook extends Book {

    public DemoBook(String isbn, String title, String author, int year, Double price) {
        super(isbn, title, author, year, price);
    }

    @Override
    public boolean isAvailable(int quantity) {
        return false;
    }

    @Override
    public void deliver(String method) {
        throw new UnsupportedOperationException("DemoBook can't be delivered");
    }

    @Override
    public String toString() {
        return super.toString() + " [Demo Version]";
    }
}
