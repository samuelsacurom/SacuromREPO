/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop;

/**
* * compute salary
* subclass -> Developer 
*/
//parent 
public class Employee1 {
    protected String name;
    protected double baseSalary;
    public Employee1 (String name,double baseSalary ){
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public void work(){
        System.out.println(name + " is performing general work ");
    }
    public double calculateSalary(){
        return baseSalary;
    }
}
