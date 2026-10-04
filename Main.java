/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.oop;

import java.util.Scanner;

/**
 *
 * @author Sacurom
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of patient records to enter: ");
        int count = getValidInt(scanner, "Invalid count. Enter a positive integer: ");

        // Dynamic array sized based on user input
        InPatient[] patients = new InPatient[count];

        // For loop to capture sequential user entries
        for (int i = 0; i < count; i++) {
            System.out.println("\n--- Patient " + (i + 1) + " Entry ---");

            System.out.print("Enter Patient ID: ");
            String id = scanner.next();

            System.out.print("Enter Patient Name: ");
            scanner.nextLine(); // Clear buffer
            String name = scanner.nextLine();

            System.out.print("Enter Age: ");
            int age = getValidNonNegativeInt(scanner, "Age cannot be negative. Enter valid age: ");

            System.out.print("Enter Days Stayed: ");
            int days = getValidNonNegativeInt(scanner, "Days stayed cannot be negative. Enter valid days: ");

            System.out.print("Enter Daily Rate (php): ");
            double rate = getValidNonNegativeDouble(scanner, "Daily rate cannot be negative. Enter valid rate: ");

            System.out.print("Enter Medication Cost (php): ");
            double medCost = getValidNonNegativeDouble(scanner, "Medication cost cannot be negative. Enter valid cost: ");

            System.out.print("Has Insurance? (true/false): ");
            while (!scanner.hasNextBoolean()) {
                System.out.print("Invalid input. Enter true or false: ");
                scanner.next();
            }
            boolean hasInsurance = scanner.nextBoolean();

            patients[i] = new InPatient(id, name, age, days, rate, medCost, hasInsurance);
        }

        // For loop to generate and render the final formatted tabular billing report
        // Loop to print final results as a plain list
System.out.println("\n--- FINAL BILLING REPORT ---");
for (int i = 0; i < patients.length; i++) {
    InPatient p = patients[i];
    System.out.println("Patient #" + (i + 1));
    System.out.println("ID: " + p.getPatientId());
    System.out.println("Name: " + p.getName());
    System.out.println("Age: " + p.getAge());
    System.out.println("Days Stayed: " + p.getDaysStayed());
    System.out.println("Room Charges: php" + String.format("%.2f", p.calculateRoomCharges()));
    System.out.println("Medication Cost: php" + String.format("%.2f", p.calculateDiscountedMedication()));
    System.out.println("Gross Total: php" + String.format("%.2f", p.calculateGrossTotal()));
    System.out.println("Insurance Coverage: -php" + String.format("%.2f", p.calculateInsuranceDeduction()));
    System.out.println("Final Bill: php" + String.format("%.2f", p.calculateFinalBill()));
    System.out.println(); // Blank line between records
}

        scanner.close();
    }

    // Helper methods for non-negative validation
    private static int getValidInt(Scanner scan, String errorMsg) {
        int val;
        while (true) {
            if (scan.hasNextInt()) {
                val = scan.nextInt();
                if (val > 0) return val;
            } else {
                scan.next();
            }
            System.out.print(errorMsg);
        }
    }

    private static int getValidNonNegativeInt(Scanner sc, String errorMsg) {
        int val;
        while (true) {
            if (sc.hasNextInt()) {
                val = sc.nextInt();
                if (val >= 0) return val;
            } else {
                sc.next();
            }
            System.out.print(errorMsg);
        }
    }

    private static double getValidNonNegativeDouble(Scanner sc, String errorMsg) {
        double val;
        while (true) {
            if (sc.hasNextDouble()) {
                val = sc.nextDouble();
                if (val >= 0) return val;
            } else {
                sc.next();
            }
            System.out.print(errorMsg);
        }
    }
}
