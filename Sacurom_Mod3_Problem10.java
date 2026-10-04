/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Sacurom
 */
import java.util.Scanner;
public class Sacurom_Mod3_Problem10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter product price: ");
        double productPrice = scan.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = scan.nextInt();

        System.out.print("Enter discount percentage: ");
        double Percentage = scan.nextDouble();

        System.out.print("Enter amount paid: ");
        double amountPaid = scan.nextDouble();

        double gross = productPrice * quantity;
        double discount = gross * (Percentage / 100);
        double discounted = gross - discount;
        double vat = discounted * 0.12;
        double finalBill = discounted + vat;
        double changeDifference = amountPaid - finalBill;

        String paymentStatus = amountPaid >= finalBill ? "SUFFICIENT PAYMENT" : "INSUFFICIENT PAYMENT";

        System.out.print("\nGross Amount=" + gross);
        System.out.print("; Discount=" + discount);
        System.out.print("; After Discount=" + discounted);
        System.out.print("; VAT=" + vat);
        System.out.print("; Final Bill=" + finalBill);
        System.out.print((amountPaid >= finalBill ? "; Change=" : "; Difference=") + changeDifference);
        System.out.print("; Payment Status: " + paymentStatus);

        scan.close();
    }
}

