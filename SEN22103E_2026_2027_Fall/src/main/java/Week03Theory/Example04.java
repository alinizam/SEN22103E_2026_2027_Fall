/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week03Theory;

/**
 *
 * @author ali.nizam
 */
public class Example04 {
    public static void main(String[] args) {
        // take the sum of number between a range
        int i;
        int start =1, end = 10;
        i = start;
        int sum=0;
        while (i <= end) {          
            sum=sum+i;
            System.out.println(i +":"+sum);
            i++;
        }
        System.out.println("Sum = "+ sum);

    }
}
