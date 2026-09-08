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

public class Sacurom_Mod3_Problem6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter grade: ");
        double grade = scan.nextDouble();

        String result = (grade >= 75) ? "PASSED" : "FAILED";

        System.out.println("Result: " + result);

        scan.close();
    }
}
