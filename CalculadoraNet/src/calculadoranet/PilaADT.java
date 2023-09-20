/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadoranet;

/**
 * Interfaz que obliga a cualquier clase que la implemente a incluir los métodos que se declaran.
 * @author Andrés Álvarez, Nicolás Álvarez, Luis Arguelles, Andrés Sámano.
 */
public interface PilaADT <T> {
    public void push(T dato);
    public T pop();
    public boolean isEmpty();
    public T peek();
}
