/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadoranet;

/**
 *
 * @author andres
 */
public class PilaA <T> implements PilaADT<T>{
    //atributos
    private int tope;
    private T[] datos;
    private final int MAX=20;
    
    //constructores
    public PilaA() {
        datos = (T[])new Object[MAX];
        tope=-1; //indica que esta vacío, no hay ningun elemento en la Pila
    }
    
    public PilaA(int max) {
        datos = (T[])new Object[max];
        tope=-1; //indica que esta vacío, no hay ningun elemento en la Pila
    }
    
    @Override
    public void push(T nuevo) {
        if(tope==datos.length-1) { //condición de que no haya espacio
            expande();
        }
        tope++;
        datos[tope]= nuevo;
    }
    
    private void expande() {
        T[] masGrande = (T[]) new Object[datos.length*2];
        int i;
        for(i=0; i<=tope; i++) {
            masGrande[i] = datos[i];
        }
        datos = masGrande;
    }

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

    @Override
    public boolean isEmpty() {
        return tope == -1;
    }

    @Override
    public T peek() {
        if(isEmpty()) {
            throw new ExcepcionColeccionVacia("ERROR: la pila está vacía");
        }
        return datos[tope];
    }
    
    //to String para prubas
    public String toString() {
        StringBuilder sb = new StringBuilder();
        T dato;
        PilaA <T> a = new PilaA();
        while(!this.isEmpty()) { //usar arreglo en lugar de como pila
            dato = this.pop();
            a.push(dato);
            sb.append(dato).append("\n");
        }
        while(!a.isEmpty()) {
            this.push(a.pop());
        }
        return sb.toString();
    }
    
    public void multiPop(int n) {
        int i;
        try {
            if(tope+1>=n) {
                for(i=0; i<n; i++) {
                    pop();
                }
            }
        } catch (ExcepcionColeccionVacia e){
            throw new ExcepcionColeccionVacia("No hay suficientes elementos \n");
        }
    }
}
