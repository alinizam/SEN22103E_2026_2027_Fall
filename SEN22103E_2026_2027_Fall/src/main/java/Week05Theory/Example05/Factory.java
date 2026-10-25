/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05Theory.Example05;

/**
 *
 * @author ali.nizam
 */
public class Factory {
    Employee manager;
    void assignManager(Employee employee){
        manager=employee;
    }
    void increaseManagerSalary(int inc){
        manager.salary+=inc;
    }
    Employee getManager(){
        return manager;
    }
}
