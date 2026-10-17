/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04Lab;

import java.text.Normalizer;

/**
 *
 * @author ali.nizam
 */
public class Example03_1 {
   
    public static void main(String[] args) {
         int n=24;
         for (int i = n/2; i >= 1; i--) {
            if (n%i==0){
               System.out.println(i);
            }
        }
    }
}
