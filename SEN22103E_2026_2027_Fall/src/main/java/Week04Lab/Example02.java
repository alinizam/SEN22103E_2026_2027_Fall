/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04Lab;

/**
 *
 * @author ali.nizam
 */
public class Example02 {

    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        while(sum+i<3000){ //option a not allow exiding
        //while (sum < 3000) {   option b allow exiding
            sum = sum + i;
            System.out.println("i=" + i + "sum =" + sum);
            i++;
        }

    }
}
