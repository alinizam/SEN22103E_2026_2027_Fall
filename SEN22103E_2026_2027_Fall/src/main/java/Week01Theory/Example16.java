/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week01Theory;

/**
 *
 * @author ali.nizam
 */
public class Example16 {
    public static void main(String[] args) {
        int i=1;
        int x=2*(i++)+(++i);
        System.out.println("x = " + x);
        
        i+=5;  //i=i+5;
        System.out.println(i);
    }
}
