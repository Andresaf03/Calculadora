/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

import static java.lang.Character.isDigit;
import pilagenerica.PilaA;

/**
 *
 * @author luisrafaelarguelles
 */
public class Metodos {
    private PilaA<Character> pil;

    public boolean revisor(String cadena) {
        PilaA<String> a= new PilaA();
        boolean resp = true;
        int i = 0;
        while (i < cadena.length() && resp) {
            if (cadena.charAt(i)=='(') {
                a.push("(");    
            }
            else
                if (cadena.charAt(i)==')') {
                    if(a.isEmpty())
                        resp = false;
                    else
                        a.pop();    
                }  
            i++;
        }
        if(!a.isEmpty())
            resp = false;
        
        return resp;
    }
    
    public int jerarquia(Character signo) {
    int res = -1; //Todos los valores que no sean enteros o se contengan en un caso regresan -1

    if (isDigit(signo)) { //Revisa que el valor sea o no entero
        res = 0; //Todos los enteros regresan 0
    } else if (signo instanceof Character) { 
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
    
    public boolean revisorCadena(String cadena){
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
                                   
            }
            else {
                res=false;
            }
        }
        else {
            res=false;
        }
        
        return res;
    }
    
    //Metodo para revisar que no haya operadores al final de la cadena, exceptuando el menos
    public boolean inFin(char c){
        boolean res = false;
        switch(jerarquia(c)){
            case 0:
            case 1:
                res = true;
        }
        
        return res;
    }
    
    //Metodo para revisar que no haya operadores al principio sin contar el menos para los numero negativos
    public boolean inPrin(char c){
        boolean res = false;
        switch(jerarquia(c)){
            case 0:
            case 1:
                res = true;
        }
        if(c=='-') {
            res=true;
        }
        
        return res;
    }
   
}
