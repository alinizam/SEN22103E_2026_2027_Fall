/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Week04Theory;

/**
 *
 * @author MyComputer
 */
public class Example01 {

    public static void main(String[] args) {
        //decide a number is prime or not
        int n=2;
        boolean isPrime=true;
        for (int i = 2; i < n/2; i++) {
            if(n%i==0){
                isPrime=false;
                break;
            }
            System.out.println(n+":"+i);
        }
        if (isPrime)
            System.out.println("The number is prime");
        else
            System.out.println("The number is non prime");
    }
}
