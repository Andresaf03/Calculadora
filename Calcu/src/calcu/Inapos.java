/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calcu;

import java.util.ArrayList;
import pilas.PilaA;
import pilas.PilaADT;
import pilas.RevisorDeParentesis;

/**
 *
 * @author nalva
 */
public class Inapos{
    
    public String InaPos(String cadena) throws Exception{
        ArrayList <String> Caracteres= new ArrayList<String>(); //Creamos arraylist para almacenar numeros
        PilaADT<Character> Operadores = new PilaA(); //Creamos pila para almacenar operadores
        
        int i;
        String posfija="";
        for(i=0;i<cadena.length();i++){
                switch(jerarquia(charAt(i))){
                    case 0:
                        posfija = posfija + cadena.charAt(i);
                        break;
                    case 1:
                        Caracteres.add(posfija);
                        posfija="";
                        if(cadena.charAt(i)=='('){
                            Operadores.push(cadena.charAt(i));
                        }
                        else{
                            while(Operadores.peek()!='('){
                                Caracteres.add(String.valueOf(Operadores.pop()));
                            }
                            Operadores.pop();
                        }
                            
                        break;
                    case 2:
                        while(!Operadores.isEmpty() && Operadores.peek().jerarquia >= cadena.charAt(i).jerarquia){
                            Caracteres.add(String.valueOf(Operadores.pop()));
                            
                        }
                        Operadores.push(cadena.charAt(i));
                        break;
                    case 3:
                        while(!Operadores.isEmpty() && Operadores.peek().jerarquia >= cadena.charAt(i).jerarquia){
                            Caracteres.add(String.valueOf(Operadores.pop()));
                            
                        }
                        Operadores.push(cadena.charAt(i));
                        break;
                    case 4:
                        while(!Operadores.isEmpty() && Operadores.peek().jerarquia >= cadena.charAt(i).jerarquia){
                            Caracteres.add(String.valueOf(Operadores.pop()));
                            
                        }
                        Operadores.push(cadena.charAt(i));
                        break;
                }
           }
           Caracteres.add(posfija);
           while(!Operadores.isEmpty())
               Caracteres.add(String.valueOf(Operadores.pop()));
      
        }
    
    
    }
    

