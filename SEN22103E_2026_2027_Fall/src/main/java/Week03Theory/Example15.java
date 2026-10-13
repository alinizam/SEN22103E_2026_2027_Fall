/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week03Theory;

/**
 *
 * @author ali.nizam
 */
public class Example15 {

    /* 1 2 3 
       4 5 6
       7 8 9 
     */
    public static void main(String[] args) {
        int n = 6;
        int x = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(x + " "); 
                x++;
            }
            System.out.println("");
        }
    }
}
