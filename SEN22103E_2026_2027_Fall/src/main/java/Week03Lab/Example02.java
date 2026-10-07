/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week03Lab;

/**
 *
 * @author ali.nizam
 */
public class Example02 {
    public static void main(String[] args) {
        double midtermGrade=45, midtermPercentage=0.3,
                finalGrade=33.4,finalPercentage=0.50,projectGrade=74,projectPercentage=0.20;
        
        double totalGrade=midtermGrade*midtermPercentage
                +projectGrade*projectPercentage
                +finalGrade*finalPercentage;
        System.out.println("Total Grade = "+totalGrade);
        
        
        String result = "";
        if (totalGrade <= 100 && totalGrade >= 70) {
            result = "AA";
        } else if (totalGrade < 70 && totalGrade >= 45) {
            result = "CC";
        } else if (totalGrade < 45 && totalGrade >= 0) {
            result = "FF";
        }
        if (result=="FF"){
            System.out.print("Failed with ");
        }else{
            System.out.print("Passed with ");
        }
        System.out.println(result);
    }
}
