/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadoranet;

/**
 * Clase PilaA que funciona como la clase Stack y utiliza un arreglo para funcionar.
 * @author Andrés Álvarez, Nicolás Álvarez, Luis Arguelles, Andrés Sámano.
 */
public class PilaA <T> implements PilaADT<T> {
    //atributos
    private int tope;
    private T[] datos;
    private final int MAX=20;
    
    //constructores
    /**
     * Construye una pila que utiliza un arreglo para funcionar.
     */
    public PilaA() {
        datos = (T[])new Object[MAX];
        tope=-1; //indica que esta vacío, no hay ningun elemento en la Pila
    }
    
    /**
     * <pre>
     * Construye una pila que utiliza un arreglo para funcionar.
     * Una el atributo max para determinar el tamaño del arreglo.
     * </pre>
     * @param max el número de elementos que puede guardar la pila (el arreglo).
     */
    public PilaA(int max) {
        datos = (T[])new Object[max];
        tope=-1; //indica que esta vacío, no hay ningun elemento en la Pila
    }
    /**
     * <pre>
     * Agrega un dato al tope de la pila.
     * Si es que no haya espacio, llama al método de expandir para aumentar el tamaño del arreglo de la pila.
     * </pre>
     * @param nuevo el dato que queremos ingresar a la pila. 
     */
    @Override
    public void push(T nuevo) {
        if(tope==datos.length-1) { //condición de que no haya espacio
            expande();
        }
        tope++;
        datos[tope]= nuevo;
    }
    
    /**
     * Aumenta el tamaño del arreglo que funciona como pila en una cantidad determinada (multiplica por dos el tamaño del arreglo).
     */
    private void expande() {
        T[] masGrande = (T[]) new Object[datos.length*2];
        int i;
        for(i=0; i<=tope; i++) {
            masGrande[i] = datos[i];
        }
        datos = masGrande;
    }

    /**
     * <pre>
     * Elimina el tope de la pila (el último elemento del arreglo).
     * Considera que la pila no esté vacía, sino arroja un error.
     * </pre>
     * @return El elemento que se eliminó.
     */
    @Override
    public T pop() {
        if(isEmpty()) {
            throw new ExcepcionColeccionVacia("ERROR: la pila está vacía");
        }
        T resultado = datos[tope];
        datos[tope]=null;
        tope--;
        
        return resultado;
    }

    /**
     * Método que determina si una pila está o no vacía.
     * @return <ul>
     *  <li> True: si la pila está vacía.
     *  <li> False: si la pila no está vacía.
     * </ul>
     */
    @Override
    public boolean isEmpty() {
        return tope == -1;
    }

    /**
     * Método que se "asoma" a la pila y nos dice cuál es el elemento en su tope (el último elemento en el arreglo).
     * @return El elemento que está hasta arriba de la pila.
     */
    @Override
    public T peek() {
        if(isEmpty()) {
            throw new ExcepcionColeccionVacia("ERROR: la pila está vacía");
        }
        return datos[tope];
    }
    
}
