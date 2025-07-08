/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fawry.quantumbookstore;

/**
 *
 * @author Mohamed
 */
public class PrintReceiptService {
    public static void print (int quantity , String bookName , Double totalAmount){
        System.out.println("\nReceipt");
        System.out.println("-----------------------------");
        System.out.println(quantity + "X " + bookName + "    " + totalAmount);
        System.out.println("-----------------------------\n");
    }
}
