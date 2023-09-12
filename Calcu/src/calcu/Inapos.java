/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calcu;

import static java.lang.Character.isDigit;
import java.util.ArrayList;
import pilas.PilaA;
import pilas.PilaADT;
import pilas.RevisorDeParentesis;

/**
 *
 * @author nalva
 */
public class Inapos{
    
    public ArrayList <String> InaPos(String cadena) {
        ArrayList <String> Caracteres= new ArrayList<String>(); //Creamos arraylist para almacenar numeros
        PilaADT<Character> Operadores = new PilaA(); //Creamos pila para almacenar operadores
        
        int i;
        String posfija="";
        for(i=0;i<cadena.length();i++){
                switch(jerarquia(cadena.charAt(i))){
                    case 0:
                        posfija = posfija + cadena.charAt(i);
                        break;
                    case 2:
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
                    case 3:
                        Caracteres.add(posfija);
                        posfija="";
                        while(!Operadores.isEmpty() && Operadores.peek().jerarquia >= cadena.charAt(i).jerarquia){
                            Caracteres.add(String.valueOf(Operadores.pop()));
                            
                        }
                        Operadores.push(cadena.charAt(i));
                        break;
                    case 4:
                        Caracteres.add(posfija);
                        posfija="";
                        while(!Operadores.isEmpty() && Operadores.peek().jerarquia >= cadena.charAt(i).jerarquia){
                            Caracteres.add(String.valueOf(Operadores.pop()));
                            
                        }
                        Operadores.push(cadena.charAt(i));
                        break;
                    case 5:
                        Caracteres.add(posfija);
                        posfija="";
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
           return Caracteres;
      
        }
    
    public double calcula(ArrayList<String> Caracteres){
        
        int i;
        double aux;
        double resp=0;
        String cadena;
        PilaADT <Character> a = new PilaA();
        
       
        for(i=0;i<Caracteres.size();i++){
            
        }

        
    }
    
    
    
    }
    

