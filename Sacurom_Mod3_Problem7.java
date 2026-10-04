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
public class Sacurom_Mod3_Problem7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int a = scan.nextInt();

        System.out.print("Enter the second integer: ");
        int b = scan.nextInt();

        System.out.print("Enter the third integer: ");
        int c = scan.nextInt();

        int largest = (a >= b) ? ((a >= c) ? a:c):((b >= c) ? b:c);

        System.out.println("Largest number: " + largest);

        scan.close();
    }
}

