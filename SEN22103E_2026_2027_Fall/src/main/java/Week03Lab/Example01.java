/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week03Lab;

/**
 *
 * @author ali.nizam
 */
public class Example01 {
    public static void main(String[] args) {
        int grade=40;
        String result="";
        result=(grade<=100 && grade>=70)?"AA":result;
        result=(grade<70 && grade>=45)?"CC":result;
        result=(grade<45 && grade>=0)?"FF":result;
        System.out.println(result);
    }
}
