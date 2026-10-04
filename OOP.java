/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oop;

/**
 *
 * @author Sacurom
 */
import java.util.Scanner;

class Product {
    // Private fields for encapsulation
    private String name;
    private String category;
    private double price;

    public Product(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }
}

public class OOP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Product[] products = {
            new Product("Laptop", "electronics", 35000),
            new Product("Smartphone", "electronics", 15000),
            new Product("Milk", "grocery", 95),
            new Product("Bread", "grocery", 60),
            new Product("T-Shirt", "clothing", 350)
        };

        System.out.print("Enter product category: ");
        String searchCategory = scanner.nextLine().toLowerCase();

        String handling;

        switch (searchCategory) {
            case "electronics":
                handling = "Fragile - Keep away from water";
                break;

            case "grocery":
                handling = "Perishable - Check expiration date";
                break;

            case "clothing":
                handling = "Store in a dry place";
                break;

            default:
                handling = "Unknown category";
        }

        boolean productFound = false;

        System.out.println("\nSearch Results:");

        for (Product product : products) {
            if (product.getCategory().equalsIgnoreCase(searchCategory)) {
                System.out.println("Product: " + product.getName());
                System.out.println("Price: ₱ " + product.getPrice());
                System.out.println("Handling: " + handling);
                System.out.println();

                productFound = true;
            }
        }

        if (!productFound) {
            System.out.println("No products found in this category.");
            System.out.println("Handling: " + handling);
        }

        scanner.close();
    }
}