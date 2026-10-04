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

public class Topic1_InheritanceDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter no of developers: ");

        int count = scanner.nextInt();

        scanner.nextLine();

        Developer[] devs = new Developer[count];

        for (int i = 0; i<count;i++){

            System.out.println("Developer: "+(i+1));

            System.out.print("Name: ");

            String name = scanner.nextLine();

            System.out.print("Base Salary: ");

            double salary = scanner.nextDouble();

            System.out.print("Line of Codes/day: ");

            int loc = scanner.nextInt();

            devs[i] = new Developer(name, salary, loc);


        }

        System.out.println("===Summary==");

        for (int i = 1; i<devs.length;i++){

            System.out.println("Developer "+(i+1)+ ": " +devs[i].name);

            devs[i].work();

            System.out.println("Salary "+devs[i].calculateSalary());

        }

        scanner.close();

    }

}

 