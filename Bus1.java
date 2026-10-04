/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop;

/**
*
* @author hadjitejuco
*/
public class Bus1 extends Vehicle1{
    private int passengerCapacity;
    public Bus1 (String brand, int capacity){
        super(brand);
        this.passengerCapacity = capacity;
    }
    @Override
     public void move(){
        System.out.println("Bus: ["+ brand + " Transporting "+passengerCapacity);

    }
}
