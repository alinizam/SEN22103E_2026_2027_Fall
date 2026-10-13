/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week03Theory;

/**
 *
 * @author ali.nizam
 */
public class Example03 {

    public static void main(String[] args) {
        // write numbers from start to end if the number is divided by 3
        int i;
        int start = 5, end = 15;
        i = start;
        while (i <= end) {
            if (i%3==0){
                System.out.println(i);
            }
            i++;
        }

    }
}
