/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week03Lab;

/**
 *
 * @author ali.nizam
 */
public class Example03 {
    public static void main(String[] args) {
        double number=9;
        int divisionCount=0;
        if (number%2==0){
            divisionCount++;
            number=number/2;
            if (number%2==0){
                divisionCount++;
                number=number/2;
                if (number%2==0){
                    divisionCount++;
                }
            }
        }
        System.out.println("Devision count = " + divisionCount);
        
    }
}
