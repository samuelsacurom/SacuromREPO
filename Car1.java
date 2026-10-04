/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop;

/**
*
* @author hadjitejuco
*/
public class Car1 extends Vehicle1 {
    public Car1(String brand){
        super(brand);
    }
    @Override
     public void move(){
        System.out.println("Car: ["+ brand + " Driving on the highway");
    }
}
