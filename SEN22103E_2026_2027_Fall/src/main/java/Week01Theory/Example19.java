/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week01Theory;

/**
 *
 * @author ali.nizam
 */
public class Example19 {
    public static void main(String[] args) {
        //if salary is more than 10000 and job is D increase salary by  %10
        //if salary is less than 10000 and job is T increase salary by  %5
        double salary=5000;
        char jobtype='T';
        double lastSalary;
        lastSalary=(salary>10000 && jobtype=='D')?(1.1*salary):salary;
        lastSalary=(salary<10000 && jobtype=='T')?(1.05*salary):lastSalary;
        
        System.out.println("Last salary= "+ lastSalary);
        
        
        
        
    }
}
