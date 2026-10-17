/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04Lab;

/**
 *
 * @author ali.nizam
 */
public class Example05_1 {
    public static void main(String[] args) {
        int i=12;  //0b1100
        //String s="";
        int number=0;
        int digit=1;
        while(i>0){ 
            number = (digit*(i%2))+number;
            digit*=10;
            //System.out.print(i%2);
            i=i/2;
        }
        System.out.println(number);
    }
}
