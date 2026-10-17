/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04Lab;

/**
 *
 * @author ali.nizam
 */
public class Example05 {
    public static void main(String[] args) {
        int i=12;  //0b1100
        String s="";
        while(i>0){ 
            s=i%2+s;
            //System.out.print(i%2);
            i=i/2;
        }
        System.out.println(s);
    }
}
