/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04Theory;

/**
 *
 * @author MyComputer
 */
public class Example08 {

/* x 0 0 0 x
   0 x 0 x 0
   0 0 x 0 0
   0 x 0 x 0
   x 0 0 0 x */     

    public static void main(String[] args) {
        // FOR create five column
        for (int i = 0; i < 5; i++) {
            // FOR create five row
            for (int j = 0; j < 5; j++) {
                // IF column and row number is same then X
                // else write 0
                if (i==j || i+j==4) {
                    System.out.print("X ");
                }else{
                    System.out.print("0 ");
                }
            }
            // create new line
            System.out.println("");
                
        }
   
           
                
        
        
    }
    
}
