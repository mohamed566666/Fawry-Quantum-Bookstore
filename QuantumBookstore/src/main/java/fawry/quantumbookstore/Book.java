/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fawry.quantumbookstore;

import java.time.LocalDate;

/**
 *
 * @author Mohamed
 */
public abstract class Book {

    protected String isbn;
    protected String title;
    protected String author;
    protected int year;
    protected Double price;

    public Book(String isbn, String title, String author, int year, Double price) {
        this.setIsbn(isbn);
        this.setTitle(title);
        this.setAuthor(author);
        this.setYear(year);
        this.setPrice(price);
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        if (isbn == null || isbn.isBlank()) {
            throw new IllegalArgumentException("ISBN cannot be null or empty");
        }
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Title cannot be null or empty");
        }
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author == null || author.isBlank()) {
            throw new IllegalArgumentException("Author cannot be null or empty");
        }
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 0 || year > LocalDate.now().getYear()) {
            throw new IllegalArgumentException("Year must be positive and not in the future");
        }
        this.year = year;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        if (price != null && price < 0) {
            throw new IllegalArgumentException("Price can't be negative");
        }
        this.price = price;
    }

    public abstract void deliver(String method);
    
    public abstract void buy(int quantity , String method);

    public abstract boolean isAvailable(int quantity);

    @Override
    public String toString() {
        return "Book{"
                + "ISBN = " + isbn
                + " , Title = '" + title
                + " , Author = '" + author
                + " , Year = " + year
                + " , Price = " + ((getPrice() != null) ? getPrice() : "No Price") + " }";
    }
}
