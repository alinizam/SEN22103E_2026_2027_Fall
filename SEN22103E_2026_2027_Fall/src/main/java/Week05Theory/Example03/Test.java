/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05Theory.Example03;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        Employee e=new Employee();
        e.minSalary=30000;
        e.setSalary(40000);
        e.setSalary(5000);
        System.out.println(e.salary);
    }
}
