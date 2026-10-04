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
public class StudentInheritance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Student student = new Student();
        System.out.print("Enter Name: ");
        student.name = scanner.nextLine();
        System.out.print("Enter Age: ");
        student.age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Course: ");
        student.course = scanner.nextLine();
        student.displayStudent();
        scanner.close();
    }
}
