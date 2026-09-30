/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week02Lab;

/**
 *
 * @author ali.nizam
 */
public class Example06 {
    public static void main(String[] args) {
        int i=18127;
        System.out.println("Last digit= "+(i%10));
        
        //tens digit

        int tensDigit=(i/10)%10;
        System.out.println("Tens = "+tensDigit);
        
    }
}
