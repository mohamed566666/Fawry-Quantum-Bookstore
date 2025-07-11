/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package fawry.quantumbookstore;

/**
 *
 * @author Mohamed
 */
public class QuantumBookstore {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Book book1 = new PaperBook("1" , "Java Book" , "Gosling" , 2006 , 150.00 , 15);
        inventory.addBook(book1);
        inventory.buyBook("1", 1,"Cairo"); // Succesful
//        inventory.buyBook("1", 15, "Cairo"); // Failed , this book not Available with this quantity
        inventory.removeAndReturnOutdatedBooks(5); // delete book1
//        inventory.buyBook("1", 2,"Cairo"); // failed , book1 not available now

        Book book2 = new EBook("2" , "Compiler" , "Knuth" , 1998 , 350.00 ,"PDF");
        inventory.addBook(book2);
        inventory.buyBook("2", 1, "mg285281@gmail.com");
        
//        Book book3 = new DemoBook("3" , "Math" , "Gauss" , 1835 , null);
//        inventory.addBook(book3);
//        inventory.buyBook("3", 1, "mg285281@gmail.com"); // Failed , Demo book cannot be sold
    }
}
