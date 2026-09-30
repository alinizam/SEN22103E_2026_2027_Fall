/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week02Lab;

/**
 *
 * @author ali.nizam
 */
public class Example02 {

    public static void main(String[] args) {
        int a = 2, b = 5, c = 1;
        int min;
        min = (a < b) ? a : b;
        min = (min < c) ? min : c;
        System.out.println("Min= " + min);

    }
}
