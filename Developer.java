/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.oop;

/**
*
* @author hadjitejuco
*/
class Developer extends Employee1{
    //programmer -> write 
    private int lineOfCodePerDay;
    public Developer (String name,double baseSalary,int lineOfCodePerDay ){
        super(name, baseSalary);
        this.lineOfCodePerDay = lineOfCodePerDay;
    }
    @Override
    public void work(){
        super.work();
        System.out.println("-> Specialization is writing codes " +lineOfCodePerDay );
    }
    @Override 
    public double calculateSalary(){
        return baseSalary + (lineOfCodePerDay*15.0);
    }
}
