/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop;
/**
*
* Truck1 - Weight
*/
public class Truck1 extends Vehicle1{
    private double cargoWeight;
    public Truck1 (String brand, double cargoWeight){
        super(brand);
        this.cargoWeight = cargoWeight;
    }
}