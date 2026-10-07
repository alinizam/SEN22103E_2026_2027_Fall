/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week02Theory;

/**
 *
 * @author ali.nizam
 */
public class Example10 {

    public static void main(String[] args) {
        int grade = 77;
        if (grade >= 45 && grade <= 100) {
            System.out.println("Passed");
        } else if (grade < 45 && grade > 0) {
            System.out.println("Failed");
        } else {
            System.out.println("Grade error");
        }

    }
}
