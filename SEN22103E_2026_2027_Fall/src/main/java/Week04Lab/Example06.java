/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04Lab;

/**
 *
 * @author ali.nizam
 */
public class Example06 {
    public static void main(String[] args) {
        int number=1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i==j){
                    System.out.print("x ");
                }else{
                    
                    number+=2;
                    System.out.print(number+" ");
                }
            }
            System.out.println("");
        }
    }
}
