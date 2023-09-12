/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calcu;

/**
 *
 * @author nalva
 */
public class Calcu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Inapos una = new Inapos();
        String a = "(2x8)-(5^3)x(4)+(5/5)";
        System.out.println(una.InaPos(a));
        System.out.println(una.calcula(una.InaPos(a)));
        
    }
    
}
