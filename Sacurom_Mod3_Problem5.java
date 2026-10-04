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

public class Sacurom_Mod3_Problem5 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your quiz grade: ");
        Double quiz = scan.nextDouble();
        
        System.out.println("Enter your project grade: ");
        Double project = scan.nextDouble();
        
        System.out.println("Enter your exam grade: ");
        Double exam = scan.nextDouble();
        
        System.out.println("Final Grade: " + ((quiz * 0.30)+(project * 0.30)+(exam * 0.40)));
             
    }
         
}
