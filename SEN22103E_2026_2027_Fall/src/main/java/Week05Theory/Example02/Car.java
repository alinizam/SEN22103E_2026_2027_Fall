/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05Theory.Example02;

/**
 *
 * @author ali.nizam
 */
public class Car {
    String brand, model;
    int maxSpeed;
    int currentSpeed;
    int getCurrentSpeed(){
        return currentSpeed;
    }
    void increaseCurrentSpeed(){
        if (currentSpeed+1<=maxSpeed)
            currentSpeed++;
        else
            System.out.println("can not increse more than max");
    }
}
