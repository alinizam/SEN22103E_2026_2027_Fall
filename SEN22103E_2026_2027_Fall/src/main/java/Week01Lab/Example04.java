/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week01Lab;

/**
 *
 * @author ali.nizam
 */
public class Example04 {
    public static void main(String[] args) {
        // to increase salary 10%
        // display it
        double salary;
        salary=1000000;
        
      //  salary=salary*1.1;
      //  salary=salary+salary*0.1;
        salary=salary+salary*(10.0/100);
        System.out.println(salary);
    }
}
