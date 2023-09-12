/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadoranet;

/**
 *
 * @author andres
 */
public interface PilaADT <T>{
    public void push(T dato);
    public T pop();
    public boolean isEmpty();
    public T peek();
    public void multiPop(int n);
}
