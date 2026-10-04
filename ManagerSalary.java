/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop;

/**
 *
 * @author Sacurom
 */
import java.util.Scanner;
public class ManagerSalary {
    public static void main(String[] args) {
       Scanner scanner = new Scanner (System.in); 
       Manager manager = new Manager();
        System.out.print("Enter manager name: ");
        manager.setName(scanner.nextLine());
        System.out.print("Enter basic salary: ");
        manager.setSalary(scanner.nextDouble());

        System.out.print("Enter bonus: " );
        manager.setBonus(scanner.nextDouble());
        if (manager.getBonus()<0){
            System.out.println("Invalid Bonus");
        }else{
            System.out.println("Manager: "+manager.getName());
            System.out.printf("Total Salary: %.2f%n",manager.calculateSalary());
        }
       scanner.close();
    }
}
