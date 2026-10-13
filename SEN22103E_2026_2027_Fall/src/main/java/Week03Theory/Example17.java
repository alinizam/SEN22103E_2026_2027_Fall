/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week03Theory;

/**
 *
 * @author ali.nizam
 */
public class Example17 {
    public static void main(String[] args) {
        //check a number in a range or not
        int number=6;
        int start=5,end=1000000000;
        boolean isInside=false;
        for (int i = start; i <= end; i++) {
            if (number==i){
                isInside=true;
                break;
            }
        }
        if (isInside==true){
            System.out.println("Is inside");
        }else{
            System.out.println("Not inside");
        }        
    }
}
