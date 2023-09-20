/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadoranet;

import java.util.ArrayList;

/**
 * Clase que contiene los métodos de la conversión de notación infija a postfija y el cálculo en notación postfija.
 * @author Andrés Álvarez, Nicolás Álvarez, Luis Arguelles, Andrés Sámano.
 */
public class InAPos {
    /**
     * <pre>
     * Método que convierte una expresión en notación infija a postfija.
     * Contiene un switch que actúa difererente dependiendo de la jerarquía del caractér que reciba:
     * </pre>
     * <ul>
     *  <li> Número: añade el dígito a una cadena que concatena por si son números de más de una cifra. 
     *       Si se encuentra un negativo lo multiplica por menos 1 para obtener su valor positivo y concatenar un menos.
     *  <li> Punto: concatena el punto en la cadena.
     *  <li> Paréntesis: si es un paréntesis izquierdo lo añade a una pila, si es derecho, añade los operadores hasta el paréntesis izquierdo al ArrayList.
     *  <li> Operadores: los añade a la pila o al ArrayList dependiendo de su jerarquía mayor o menor al operador que esté en la pila.
     * </ul>
     * @param cadena una expresión matemática en notación infija.
     * @return ArrayList con la expresión postfija.
     */
    public static ArrayList <String> inAPos(String cadena) {
        ArrayList <String> Caracteres= new ArrayList<String>(); //Creamos arraylist para almacenar numeros
        PilaADT<Character> Operadores = new PilaA(); //Creamos pila para almacenar operadores
        boolean bandera=false;
        int i, negativo;
        String posfija="";
        for(i=0;i<cadena.length();i++){
                switch(Metodos.jerarquia(cadena.charAt(i))){
                    case 0:
                        posfija = posfija + cadena.charAt(i);
                        if(bandera) {
                            negativo = Integer.valueOf(posfija);
                            negativo = negativo * (-1);
                            posfija=String.valueOf(negativo);
                            bandera = false;
                        }
                    break;
                    case 1:
                        if(!posfija.equals("")){
                            Caracteres.add(posfija);
                        }
                        posfija="";

                        if(cadena.charAt(i)=='(' && cadena.charAt(i+1)=='-' && i<cadena.length()-1 && !bandera) {
                            bandera = true;
                        }

                        if(cadena.charAt(i)=='('){
                            Operadores.push(cadena.charAt(i));
                        } else{
                            while(Operadores.peek()!='(') { 
                                Caracteres.add(String.valueOf(Operadores.pop()));
                            }
                            Operadores.pop();
                        }  
                    break;
                    case 2:
                        posfija = posfija + cadena.charAt(i);
                    break;
                    case 3:
                        if(!posfija.equals("")){
                            Caracteres.add(posfija);
                        }
                        if(!bandera) {
                            posfija="";
                            while(!Operadores.isEmpty() && Metodos.jerarquia(Operadores.peek()) >= Metodos.jerarquia(cadena.charAt(i))){
                                Caracteres.add(String.valueOf(Operadores.pop()));
                            }
                            Operadores.push(cadena.charAt(i));
                        }
                    break;
                    case 4:
                        if(!posfija.equals("")){
                            Caracteres.add(posfija);
                        }
                        posfija="";
                        while(!Operadores.isEmpty() && Metodos.jerarquia(Operadores.peek()) >= Metodos.jerarquia(cadena.charAt(i))) {
                            Caracteres.add(String.valueOf(Operadores.pop()));
                        }
                        Operadores.push(cadena.charAt(i));
                    break;
                    case 5:
                        if(!posfija.equals("")){
                            Caracteres.add(posfija);
                        }
                        posfija="";
                        while(!Operadores.isEmpty() && Metodos.jerarquia(Operadores.peek()) >= Metodos.jerarquia(cadena.charAt(i))){
                            Caracteres.add(String.valueOf(Operadores.pop()));
                        }
                        Operadores.push(cadena.charAt(i));
                    break;
            }
        }
        if(!posfija.equals("")){
            Caracteres.add(posfija);
        }
        while(!Operadores.isEmpty()) {
           Caracteres.add(String.valueOf(Operadores.pop()));
        }
       return Caracteres;
    }
    
    /**
     * Evalua si una cadena es un número.
     * @param cadena una expresión (cadena).
     * @return Boolean <ul> 
     *  <li> True: si la cadena es una expresión numérica.
     *  <li> False: si la cadena no es una expresión numérica.
     * </ul>
     */
    public static boolean isNumeric(String cadena){
        boolean resp;
        try{
            Double.parseDouble(cadena);
            resp=true;
        }catch(NumberFormatException excepcion){
            resp = false;
        }
        return resp;
    }
    
    /**
     * <pre>
     * Método que calcula una expresión postfija.
     * Recibe un ArrayList con la expresión postfija.
     * Igualmente, hay dos casos:
     * </pre>
     * <ul>
     *  <li> Si es un número lo guarda en una pila de tal forma que se formen parejas.
     *  <li> Si es un operador, dependiendo de cual sea, realiza la operación entre la pareja de números en la pila.
     * </ul> 
     * @param Caracteres un ArrayList de tipo String que contiene la notación postfija.
     * @return Double de la expresión evaluada.
     */
    public static double calcula(ArrayList<String> Caracteres){
        int i;
        double aux, num, resp=0, resultado=0;
        String cadena;
        PilaADT <Double> a = new PilaA();
       
        for(i=0;i<Caracteres.size();i++){
            cadena = Caracteres.get(i);
            if(isNumeric(Caracteres.get(i))){
                a.push((Double.parseDouble(Caracteres.get(i))));
            } else{
                num = a.pop();
                aux = a.pop();
                
                switch(Caracteres.get(i)){
                    case "+":
                        resp = aux + num;
                        break;
                    case "-":
                        resp = aux - num;
                        break;
                    case "x":
                        resp = aux * num;
                        break;
                    case "/":
                        resp = aux / num;
                         break;
                    case "^":
                        resp = Math.pow(aux, num);
                        break;
                }
                a.push(resp);
             }
        }
        resultado=a.pop();
        if(a.isEmpty()) { //si está vacía es porque realizó la operación con éxito
            return resultado;
        } else {
            ExcepcionColeccionVacia error = new ExcepcionColeccionVacia("ERROR"); // si no está vacía es porque tiene dos números en la pila porque no se ingresó una operación
            throw error;
        }
    }
}
