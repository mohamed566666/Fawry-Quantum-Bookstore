/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fawry.quantumbookstore;

/**
 *
 * @author Mohamed
 */
public class EBook extends Book {

    private String fileType;

    public EBook(String isbn, String title, String author, int year, Double price , String fileType) {
        super(isbn, title, author, year, price);
        this.setFileType(fileType);
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        if (fileType == null || fileType.isBlank()) {
            throw new IllegalArgumentException("File type cannot be null or empty");
        }
        this.fileType = fileType;
    }

    @Override
    public void deliver(String email) {
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("Email can't be null or empty");
        }
        if (MailService.send(this, email)){
            System.out.println("Book " + this.getTitle() + " Sent to Email " + email);
        }
    }

    @Override
    public boolean isAvailable(int quantity) {
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + ", fileType = " + fileType + '}';
    }

    @Override
    public void buy(int quantity , String email) {
        this.deliver(email);
    }
}
