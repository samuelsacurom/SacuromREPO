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
public class Sacurom_Mod3_Problem9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first integer: ");
        int a = scan.nextInt();
        System.out.println("Enter second integer: ");
        int b = scan.nextInt();

        System.out.print("AND = " + (a&b) + "; ");
        System.out.print("OR = " + (a|b) + "; ");
        System.out.print("XOR = " + (a^b) + "; ");
        
        System.out.print("NOT a = " + (~a)+ "; ");
        System.out.print("a << 1 = " + (a << 1) + "; ");
        System.out.print("a >> 1 = " + (a >> 1) + "; ");

        scan.close();
    }
}

