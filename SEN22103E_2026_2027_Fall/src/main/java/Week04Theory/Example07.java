/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04Theory;

/**
 *
 * @author MyComputer
 */
public class Example07 {
    public static void main(String[] args) {
        int i=0;
        //int k;
        while(i<5){
            int k=i; // remove variable definition from the loop because it is static
            i++;
        }
    }
}
