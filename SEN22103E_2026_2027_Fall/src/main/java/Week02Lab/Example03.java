/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week02Lab;

/**
 *
 * @author ali.nizam
 */
public class Example03 {
    public static void main(String[] args) {
        int source=5,target=10;
        
        System.out.println(source + " - "+ target);
        int temp=target;
        target=source;
        source=temp;
        System.out.println(source + " - "+ target);
    }
}
