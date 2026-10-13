/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week03Theory;

import java.util.Scanner;

/**
 *
 * @author ali.nizam
 */
public class Example08 {
    public static void main(String[] args) {
        // get umber from end user and dispay on screen until end user enter -1
        Scanner s=new Scanner(System.in);
        int i;
        do{
            System.out.print("Enter a number=");
            i=s.nextInt(); 
            System.out.println("User entered "+i);
        }while (i!=-1);
        System.out.println("Ended");
    }
}
