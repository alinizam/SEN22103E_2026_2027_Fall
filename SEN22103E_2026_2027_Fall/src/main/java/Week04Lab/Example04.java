/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04Lab;

/**
 *
 * @author ali.nizam
 */
public class Example04 {
    public static void main(String[] args) {
        int n=30,m=20;
        int i=1;
        int maxDivisor=1;
        while(i<=n || i<=m){
            if (n%i==0 && m%i==0){
                maxDivisor=i;
            }
            i++;
        }
        System.out.println("Max divisor ="+maxDivisor );
            
    }
}
