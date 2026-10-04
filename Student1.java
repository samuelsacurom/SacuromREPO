/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**

*

* @author hadjitejuco

*/
 
import java.util.Scanner;
 
public class Student1 {

    private String name;

    private int yearLevel;

    private static int totalStudents = 0; 

    //Constructor 

    public Student1(String name,int yearLevel){

        this.name = name;

        this.yearLevel= yearLevel;

        totalStudents++;

    }

    //Getters and Setters 

    public String getName(){

        return name;

    }

    public int getYearLevel(){

        return yearLevel;

    }

    //4 year level

    //Freshman, Sophomore, Junior, Senior

    public void setYearLevel(int yearLevel){

        if (yearLevel >0 && yearLevel <=5)

            this.yearLevel = yearLevel;

    }

    public static int getTotalStudents(){

        return totalStudents;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        Student1[] students = new Student1[3];

        //loop for user input

        for (int i = 0; i<students.length;i++){

            System.out.println("Enter details for Student "+(i+1)+" : ");

            System.out.print("Name: ");

            String name = scanner.nextLine();

            System.out.println("Enter Year Level");

            int year = scanner.nextInt();

            scanner.nextLine();

            students[i] = new Student1(name, year);

        }

        System.out.println("\n--Summary Report--");

        for (int i = 0; i<students.length;i++){

            Student1 s = students[i];

            System.out.println(s.getName()+" - Year"+s.getYearLevel()+ "Status: ");

                switch(s.getYearLevel()){

                    case 1:

                        System.out.println("Freshman");

                        break;

                    case 2:

                        System.out.println("Sophomore");

                        break;

                    case 3:

                        System.out.println("Junior");

                        break;

                    case 4:

                        System.out.println("Senior");

                        break;

                    default:

                        System.out.println("Graduate/Super Senior");    

                }

        }  

        System.out.println("Total Count "+ Student1.getTotalStudents());

        scanner.close();

    }


}

 