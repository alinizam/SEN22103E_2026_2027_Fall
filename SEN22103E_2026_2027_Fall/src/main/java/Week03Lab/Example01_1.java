/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week03Lab;

/**
 *
 * @author ali.nizam
 */
public class Example01_1 {

    public static void main(String[] args) {
        int grade = 40;
        String result = "";
        if (grade <= 100 && grade >= 70) {
            result = "AA";
        } else if (grade < 70 && grade >= 45) {
            result = "CC";
        } else if (grade < 45 && grade >= 0) {
            result = "FF";
        }
        System.out.println(result);
    }
}
