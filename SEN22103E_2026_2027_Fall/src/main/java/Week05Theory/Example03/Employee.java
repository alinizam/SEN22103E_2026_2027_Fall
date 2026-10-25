/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05Theory.Example03;

/**
 *
 * @author ali.nizam
 */
public class Employee {

    String name;
    int hireYear;
    int salary;
    int minSalary;

    void setSalary(int newSalary) {   
        if (newSalary >= minSalary) {
            salary = newSalary;
        } else {
            System.out.println("Salary can not be less than min salary");
        }
    }
}
