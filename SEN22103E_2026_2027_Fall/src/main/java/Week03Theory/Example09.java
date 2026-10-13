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
public class Example09 {
    public static void main(String[] args) {
        // get umber from end user and dispay on screen until end user enter -1
        Scanner s=new Scanner(System.in);
        int i;
        System.out.print("Enter a number=");
        while ((i=s.nextInt())!=-1){    
            System.out.println("User entered "+i); 
        }
        System.out.println("Ended");
    }
}
