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
    /**
     * Obligación de método que deberá almacenar el dato recibido al tope de la pila.
     * @param dato un dato cualquiera de tipo genérico.
     */
    public void push(T dato);
    
    /**
     * Obligación de método que deberá remover y regresar el último elemento almacenado en la pila.
     * @return El dato que se removió.
     */
    public T pop();
    
    /**
     * Obligación de método que debera determinar si una pila está vacía o no.
     * @return Boolean <ul>
     *  <li> True: si la pila está vacía.
     *  <li> False: si la pila no está vacía.
     * </ul>
     */
    public boolean isEmpty();
    
    /**
     * Obligación de método que deberá "asomarse" a la pila y regresar el último elemento almacenado.
     * @return El dato al tope de la pila.
     */
    public T peek();
}
