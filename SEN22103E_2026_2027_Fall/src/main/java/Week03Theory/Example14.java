/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week03Theory;

/**
 *
 * @author ali.nizam
 */
public class Example14 {
     /* * * * *
      * * * *
      * * *
      * *
      */
    // using only two print statements only one star inside
    public static void main(String[] args) {
        int n=3;
        for (int i = 0; i < n; i++) {   
           //for (int j = n; j > i; j--) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("* ");
            }
            System.out.println("");  
        } 
    }  
}
