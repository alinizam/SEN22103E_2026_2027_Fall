/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week03Lab;

/**
 *
 * @author ali.nizam
 */
public class Example04 {

    public static void main(String[] args) {
        char c = 'C';
        int ascii = (int) c;
        if (ascii >= 65 && ascii <= 90) {
            System.out.println("Upppercase");
        } else if (ascii >= 97 && ascii <= 122) {
            System.out.println("Lowercase");
        } else {
            System.out.println("Unknown");
        }
    }
}
