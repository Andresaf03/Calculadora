/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadoranet;

/**
 * Clase que crea una excepción particular que hereda la clase RunTimeException.
 * @author Andrés Álvarez, Nicolás Álvarez, Luis Arguelles, Andrés Sámano.
 */
public class ExcepcionColeccionVacia extends RuntimeException {
    
    public ExcepcionColeccionVacia() {
        
    }
    
    /**
     * Crea una excepción que regresa una cadena con el mensaje que se introduzca como error.
     * @param message el mensaje que se quiera arrojar como error.
     */
    public ExcepcionColeccionVacia(String message) {
        super(message);
    }
    
}
