/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05Theory.Example02;

/**
 *
 * @author ali.nizam
 */
public class CarTest {
    public static void main(String[] args) {
        Car c1=new Car();
        Car c2=new Car();
        c1.maxSpeed=5;
        c2.maxSpeed=300;
        
        Car c3=c1;
        System.out.println(c3.maxSpeed);
        
        c3.maxSpeed=5;
        System.out.println(c1.maxSpeed);
        
        c2=c1;   // loosing the c2 reference
        
        System.out.println(c1.getCurrentSpeed());
        c1.increaseCurrentSpeed();
        c1.increaseCurrentSpeed();
        c1.increaseCurrentSpeed();
        c1.increaseCurrentSpeed();
        c1.increaseCurrentSpeed();
        c1.increaseCurrentSpeed();
        c1.increaseCurrentSpeed();
         
        System.out.println(c1.getCurrentSpeed());
        
        
    }
}
