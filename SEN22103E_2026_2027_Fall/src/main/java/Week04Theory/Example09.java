/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04Theory;

/**
 *
 * @author MyComputer
 */
public class Example09 {
    /*
    1   
    1  2   
    3  5  8  
    */
    public static void main(String[] args) {
        
        int n=6,r=3,c=3; 
        int f=1,f1=1, f2=0; 
        for (int i = 0; i < r; i++) {
            for (int j = 0; j <= i ; j++) {
                f=f1+f2;
                System.out.print (f+" ");
                f2=f1;
                f1=f;
            }
            System.out.println("");    
        }
        
    }
    
    
}
