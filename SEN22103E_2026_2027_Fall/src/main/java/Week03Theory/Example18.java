/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week03Theory;

/**
 *
 * @author ali.nizam
 */
public class Example18 {

    public static void main(String[] args) {
        // i+j is ecxeed a given value or not (boolean)
        // 0 1 2 
        // 1  
        // 2 
        int value = 3;
        int n = 121213213;
        outer:
        for (int i = 0; i < n; i++) {
            inner:
            for (int j = 0; j < n; j++) {
                System.out.println(i + ":" + j);
                if (i + j > value) {
                    System.out.println(i + ":" + j + " the value is exceeded");
                    break outer;
                }
            } 
        } 
    }
}
