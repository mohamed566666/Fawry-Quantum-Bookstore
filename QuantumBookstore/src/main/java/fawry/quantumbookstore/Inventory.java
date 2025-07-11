/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fawry.quantumbookstore;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.time.Year;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Mohamed
 */
public class Inventory {

    Map<String, Book> books;

    public Inventory() {
        this.books = new HashMap<>();
    }

    public Inventory(Map<String, Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        books.put(book.getIsbn(), book);
    }

    public List<Book> removeAndReturnOutdatedBooks(int numberOfYears) {
        int currYear = Year.now().getValue();
        List<Book> removedBooks = new ArrayList<>();
        Iterator<Map.Entry<String, Book>> iterator = books.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Book> currentBook = iterator.next();
            Book book = currentBook.getValue();
            if (currYear - book.getYear() > numberOfYears) {
                removedBooks.add(book);
                iterator.remove();
                System.out.println("Removed outdated book : " + book.toString());
            }
        }
        return removedBooks;
    }

    public Double buyBook(String isbn, int quantity, String methodOfDelivering) {
        if (!books.containsKey(isbn)) {
            throw new IllegalArgumentException("This book is not Available in inventory");
        }
        Book book = books.get(isbn);
        if (!book.isAvailable(quantity)) {
            throw new IllegalStateException("This book is not Available with this Quantity");
        }
        book.buy(quantity, methodOfDelivering);
        Double totalAmount = quantity * book.getPrice();
        PrintReceiptService.print(quantity, book.getTitle(), totalAmount);
        return totalAmount;
    }
}
