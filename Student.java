/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop;

/**
 *
 * @author Sacurom
 */
public class Student extends Person{
    String course;
    void displayStudent(){
        displayPerson();
        System.out.println("Course: "+course);
    }
}
