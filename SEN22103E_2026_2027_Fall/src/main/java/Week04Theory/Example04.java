/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04Theory;

/**
 *
 * @author MyComputer
 */
public class Example04 {

    public static void main(String[] args) {
        //write even number in a range
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                //100 LOC
            }
        }

        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                continue;
            }
            //100 LOC
            System.out.println(i);

        }
    }

}
