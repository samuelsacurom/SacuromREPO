/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop;

/**
*
* @author hadjitejuco
*/
import java.util.Scanner;
public class Topic2_Polymorphism {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Vehicle1[] fleet = new Vehicle1[3];
        for (int i = 0; i<fleet.length;i++){
            System.out.println("Select Vehicle");
            System.out.println("1. Car\n2. Bus\n3. Truck");
            System.out.println("Enter Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter brand ");
            String brand = scanner.nextLine();
            if (choice == 1){
                fleet[i] = new Car1(brand);
            }else if (choice == 2) {
                System.out.println("Enter passenter capacity ");
                int cap = scanner.nextInt();
                fleet[i]=new Bus1(brand,cap);
            }else{
                System.out.println("Enter Weight: ");
                double weight = scanner.nextDouble();
                fleet[i] = new Truck1(brand, weight);
            }
            System.out.println("Output");
            for (Vehicle1 v : fleet) {
                    v.move();
            }
        }
        scanner.close();
    }
}