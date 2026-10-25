/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05Theory.Example04;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        int i=5;
        MyMath m=new MyMath();
        m.increseValue(i);
        System.out.println(i);
        Employee e1=new Employee();
        e1.salary=1000;
        m.increaseSalary(e1);
        System.out.println(e1.salary);
    }
}
