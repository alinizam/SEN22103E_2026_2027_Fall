/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week03Theory;

/**
 *
 * @author ali.nizam
 */
public class Example05 {

    public static void main(String[] args) {
        //factorial
        int i;
        int start = 1, end = 5;
        i = start;
        int f = 1;
        while (i <= end) {
            int preF=f;
            f = f * i;
            System.out.print("f("+i + ")=" + i+ "*f("+(i-1)+")   ");
            System.out.println(f+"= "+preF+"*"+i);
            i++;
        }
        //f(5)=5*4*3*2*1; f(n)=n*f(n-1);
    }
}
