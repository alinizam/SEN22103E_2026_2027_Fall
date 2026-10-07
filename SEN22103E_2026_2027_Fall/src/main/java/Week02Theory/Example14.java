/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week02Theory;

/**
 *
 * @author ali.nizam
 */
public class Example14 {
    public static void main(String[] args) {
            int totalACTSLimits=30;
            char previousCourseLimits='1';
            double averageGradeLimits=1.8;
            
            int studentACTS=40;
            char studenPreviousCourse='1';
            double studentAverageGrade=4;
           
            if (studentACTS>totalACTSLimits 
               && studenPreviousCourse==previousCourseLimits
               && studentAverageGrade>averageGradeLimits){
                System.out.println("registered.");
            }else{
                System.out.println("Not registered.");
            }
        }
}
