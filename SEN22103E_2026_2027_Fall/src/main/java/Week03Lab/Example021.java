/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week03Lab;

/**
 *
 * @author ali.nizam
 */
public class Example021 {
    public static void main(String[] args) {
        double midtermGrade=45, midtermPercentage=0.3,
                finalGrade,finalPercentage=0.50,projectGrade=74,projectPercentage=0.20;
        double passingGrade=45;
        double totalGrade=midtermGrade*midtermPercentage
                +projectGrade*projectPercentage;
        finalGrade=(passingGrade-totalGrade)/finalPercentage;
                
        System.out.println("Final Grade = "+finalGrade);
        
        
        
      
    }
}
