/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Week04Theory;

/**
 *
 * @author MyComputer
 */
public class Example03 {

    public static void main(String[] args) {
        //decide a range whether contains a non-prime number or not.
        int start = 5, end = 1000000;
        boolean isPrime = true;
        //for number checking
        outer:
        for (int i = start; i < end; i++) {
            //5,6,7,...15
            //for prime checking
            for (int j = 2; j < i/2+1 ; j++) {
                System.out.println(i + ":" + j);
                if (i % j == 0) {
                    isPrime = false;
                    break outer;    
                } 
            } 
        }
         if (isPrime) {
                System.out.println("The range contains a prime number");
            } else {
                System.out.println("The range contain a mom-prime number");
            }
         
    }
}
