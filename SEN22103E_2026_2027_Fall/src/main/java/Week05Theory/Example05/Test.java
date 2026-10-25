/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05Theory.Example05;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        Employee e=new Employee();
        e.name="Ahmet Ak";
        Factory f=new Factory();
        f.assignManager(e);
        System.out.println(f.manager.name);
        f.increaseManagerSalary(100000);
        System.out.println(f.manager.salary);
         f.increaseManagerSalary(100000);
        System.out.println(f.manager.salary);
        
        Employee m=f.getManager();
        
    }
}
