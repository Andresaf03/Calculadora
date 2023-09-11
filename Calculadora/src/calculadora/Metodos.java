/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

import pilagenerica.PilaA;

/**
 *
 * @author luisrafaelarguelles
 */
public class Metodos {
    private PilaA<Character> pil;

    public boolean revisador(String revisa) {

        int der = 0, izq = 0;
        boolean res = false;
        boolean ban = true;
        int i = 0;

        while (i < revisa.length() && ban) {
            if (revisa.charAt(i) == '(') {
                Character ch = revisa.charAt(i);
                pil.push(ch);
            } else if (revisa.charAt(i) == ')') {
                if (pil.isEmpty()) {
                    ban = false;
                } else {
                    pil.pop();
                }
            }
            i++;
        }
        if (pil.isEmpty() && ban) {
            res = true;
        }
        return res;
    }
    
    public int jerarquia(Character signo){
        int res = -1;
        switch(signo){
            case '(':
            case ')':
                res = 0;
                break;
            case '+':
            case '-':
                res = 1;
                break;
            case '*':
            case '/':
                res = 2;
                break;
            case '^':
            case '√':
                res = 3;
                break;     
        }
        
        return res;
    }
    
}
