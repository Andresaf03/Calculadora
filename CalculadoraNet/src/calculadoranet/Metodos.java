/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadoranet;

import static java.lang.Character.isDigit;

/**
 * Clase que contiene los métodos para revisar las expresiones de la calculadora y establecer la jerarquía de las operaciones
 * @author Andrés Álvarez, Nicolás Álvarez, Luis Arguelles, Andrés Sámano
 */
public class Metodos {
    //atributo de la clase
    private PilaA<Character> pil;

    /**
     * <pre>
     * Método que revisa que los paréntesis estén balanceados.
     * Recibe una cadena.
     * </pre>
     * @see PilaA.isEmpty, PilA.pop, PilaA.push.
     * @param cadena una expresión matemática en notación infija.
     * @return Boolean <ul> 
     *  <li> True: si los paréntesis están balanceados.
     *  <li> False: si los paréntesis no están balanceados.
     * </ul>
     */
    public static boolean revisor(String cadena) {
        PilaA<String> a= new PilaA();
        boolean resp = true;
        int i = 0;
        while (i < cadena.length() && resp) {
            if (cadena.charAt(i)=='(') {
                a.push("(");    
            } else {
                if (cadena.charAt(i)==')') {
                    if(a.isEmpty())
                        resp = false;
                    else
                        a.pop();    
                }  
            }
            i++;
        }
        if(!a.isEmpty()) {
            resp = false;
        }
        return resp;
    }
    
    /**
     * <pre>
     * Método que clasifica a las posibles entradas de los caracteres de la cadena según una jerarquía.
     * Recibe un caracter y hay 7 casos:
     * </pre>
     * <ul> 
     *  <li> -1 si el caracter no es admisible (i.e una letra o un caracter que no sea un operador).
     *  <li> 0 si el caracter es un número.
     *  <li> 1 si es un paréntesis.
     *  <li> 2 si es un punto decimal.
     *  <li> 3 si es suma o si es una resta.
     *  <li> 4 si es una multiplicación o una división.
     *  <li> 5 si es una operación de potencia.
     * </ul>
     * @param signo un caractér particular.
     * @return int 
     */
    public static int jerarquia(char signo) {
    int res = -1; //Todos los valores que no sean enteros o se contengan en un caso regresan -1

    if (isDigit(signo)) { //Revisa que el valor sea o no entero
        res = 0; //Todos los enteros regresan 0
    } else { 
        char operador = (char) signo;
        switch (operador) {
            case '(':
            case ')':
                res = 1;
                break;
            case '.':
                res = 2;
                break;
            case '+':
            case '-':
                res = 3;
                break;
            case 'x':
            case '/':
                res = 4;
                break;
            case '^':
                res = 5;
                break;
        }
    }
    return res;
    }
     
    /**
     * <pre>
     * Método que revisa que no haya errores de sintaxis en la entrada de la cadena ni caracteres incorrectos.
     * Recibe una cadena.
     * </pre>
     * @see inPrin, inFin, jerarquia.
     * @param cadena una expresión matemática en notación infija.
     * @return <ul> 
     *  <li> True: si la cadena es correcta.
     *  <li> False: si la cadena no es correcta.
     * </ul>
     */
    public static boolean revisorCadena(String cadena){
        boolean res = true;
        int size = cadena.length();
        int i = 0;
        if(inPrin(cadena.charAt(0)) && inFin(cadena.charAt(cadena.length()-1))){ //No puede haber operadores al inicio o final
            if(revisor(cadena)){//Revisa que los parentesis funcionen
                while(i < size-1 && res){
                    if(jerarquia(cadena.charAt(i))>1 && jerarquia(cadena.charAt(i+1))>1){//Revisa que no haya operadores juntos
                        res = false; 
                    }
                    if(jerarquia(cadena.charAt(i))==0 && cadena.charAt(i+1)=='('){//Revisa que no haya numeros y parentesis izquierdos juntos
                        res = false; 
                    }
                    i++;
                }                  
            } else {
                res=false;
            }
        } else {
            res=false;
        }
        return res;
    }
    
    /**
     * Método que evalúa si no hay operadores al final de una cadena, exceptuando paréntesis.
     * @param c, un caractér, particularmente el primero de la cadena.
     * @return <ul> 
     *  <li> True: si no hay operadores al final de la cadena/entrada.
     *  <li> False: si hay operadores al final de la cadena/entrada.
     * </ul>
     */
    public static boolean inFin(char c){
        boolean res = false;
        switch(jerarquia(c)){
            case 0:
            case 1:
                res = true;
        }
        return res;
    }
    
    /**
     * Método que evalúa si no hay operadores al inicio de una cadena.
     * @param c, un caractér, particularmente el primero de la cadena.
     * @return <ul> 
     *  <li> True: si no hay operadores al inicio de la cadena/entrada.
     *  <li> False: si hay operadores al inicio de la cadena/entrada.
     * </ul>
     */
    public static boolean inPrin(char c){
        boolean res = false;
        switch(jerarquia(c)){
            case 0:
            case 1:
                res = true;
        }
        return res;
    }
}
