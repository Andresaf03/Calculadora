/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package calculadoranet;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Clase de pruebas de la Clase Metodos.
 * @author Andrés Álvarez, Nicolás Álvarez, Luis Arguelles, Andrés Sámano.
 */
public class MetodosTest {
    
    public MetodosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Prueba del método revisor en el caso expresión balanceada.
     */
    @Test
    public void testRevisor1() {
        System.out.println("revisor");
        String cadena = "(3+5x(2^3))";
        boolean expResult = true;
        boolean result = Metodos.revisor(cadena);
        assertEquals(expResult, result);
    }
    /**
     * Prueba del método revisor en el caso cadena vacía
     */
    @Test
    public void testRevisor2() {
        System.out.println("revisor");
        String cadena = "";
        boolean expResult = true;
        boolean result = Metodos.revisor(cadena);
        assertEquals(expResult, result);
    }
    /**
     * Prueba del método revisor en el caso más paréntesis izquierdos que derechos.
     */
    @Test
    public void testRevisor3() {
        System.out.println("revisor");
        String cadena = "((3+1)";
        boolean expResult = false;
        boolean result = Metodos.revisor(cadena);
        assertEquals(expResult, result);
    }
    /**
     * Prueba del método revisor en el caso más paréntesis derechos que izquierdos
     */
    @Test
    public void testRevisor4() {
        System.out.println("revisor");
        String cadena = "(9^2))";
        boolean expResult = false;
        boolean result = Metodos.revisor(cadena);
        assertEquals(expResult, result);
    }

    /**
     * Prueba del método de la jerarquía en el caso caractér: '#'.
     */
    @Test
    public void testJerarquia1() {
        System.out.println("jerarquia");
        char signo = '#';
        int expResult = -1;
        int result = Metodos.jerarquia(signo);
        assertEquals(expResult, result);
    }
    /**
     * Prueba del método de la jerarquía en el caso caractér: '9'.
     */
    @Test
    public void testJerarquia2() {
        System.out.println("jerarquia");
        char signo = '9';
        int expResult = 0;
        int result = Metodos.jerarquia(signo);
        assertEquals(expResult, result);
    }
    /**
     * Prueba del método de la jerarquía en el caso caractér: '('.
     */
    @Test
    public void testJerarquia3() {
        System.out.println("jerarquia");
        char signo = '(';
        int expResult = 1;
        int result = Metodos.jerarquia(signo);
        assertEquals(expResult, result);
    }
    /**
     * Prueba del método de la jerarquía en el caso caractér: ')'.
     */
    @Test
    public void testJerarquia4() {
        System.out.println("jerarquia");
        char signo = ')';
        int expResult = 1;
        int result = Metodos.jerarquia(signo);
        assertEquals(expResult, result);
    }
    /**
     * Prueba del método de la jerarquía en el caso caractér: '.'.
     */
    @Test
    public void testJerarquia5() {
        System.out.println("jerarquia");
        char signo = '.';
        int expResult = 2;
        int result = Metodos.jerarquia(signo);
        assertEquals(expResult, result);
    }
    /**
     * Prueba del método de la jerarquía en el caso caractér: '+'.
     */
    @Test
    public void testJerarquia6() {
        System.out.println("jerarquia");
        char signo = '+';
        int expResult = 3;
        int result = Metodos.jerarquia(signo);
        assertEquals(expResult, result);
    }
    /**
     * Prueba del método de la jerarquía en el caso caractér: '-'.
     */
    @Test
    public void testJerarquia7() {
        System.out.println("jerarquia");
        char signo = '-';
        int expResult = 3;
        int result = Metodos.jerarquia(signo);
        assertEquals(expResult, result);
    }
    /**
     * Prueba del método de la jerarquía en el caso caractér: 'x'.
     */
    @Test
    public void testJerarquia8() {
        System.out.println("jerarquia");
        char signo = 'x';
        int expResult = 4;
        int result = Metodos.jerarquia(signo);
        assertEquals(expResult, result);
    }
    /**
     * Prueba del método de la jerarquía en el caso caractér: '/'.
     */
    @Test
    public void testJerarquia9() {
        System.out.println("jerarquia");
        char signo = '/';
        int expResult = 4;
        int result = Metodos.jerarquia(signo);
        assertEquals(expResult, result);
    }
    /**
     * Prueba del método de la jerarquía en el caso caractér: '^'.
     */
    @Test
    public void testJerarquia0() {
        System.out.println("jerarquia");
        char signo = '^';
        int expResult = 5;
        int result = Metodos.jerarquia(signo);
        assertEquals(expResult, result);
    }

    /**
     * Prueba del método RevisorCadena en el caso expresión correcta
     */
    @Test
    public void testRevisorCadena1() {
        System.out.println("revisorCadena");
        String cadena = "(5+5x5/(2^1))-(6x(-2))";
        boolean expResult = true;
        boolean result = Metodos.revisorCadena(cadena);
        assertEquals(expResult, result);
    }
    /**
     * Prueba del método RevisorCadena en el caso cadena vacía
     */
    @Test
    public void testRevisorCadena2() {
        System.out.println("revisorCadena");
        String cadena = "";
        boolean expResult = false;
        boolean result = Metodos.revisorCadena(cadena);
        assertEquals(expResult, result);
    }
    /**
     * Prueba del método RevisorCadena en el caso dos operadores juntos
     */
    @Test
    public void testRevisorCadena3() {
        System.out.println("revisorCadena");
        String cadena = "(5+5x-2))";
        boolean expResult = false;
        boolean result = Metodos.revisorCadena(cadena);
        assertEquals(expResult, result);
    }
    /**
     * Prueba del método RevisorCadena en el caso de un número seguido de un paréntesis derecho
     */
    @Test
    public void testRevisorCadena4() {
        System.out.println("revisorCadena");
        String cadena = "999+1(2)";
        boolean expResult = false;
        boolean result = Metodos.revisorCadena(cadena);
        assertEquals(expResult, result);
    }
    /**
     * Prueba del método RevisorCadena en el caso de una cadena que comienza con algo diferente a un número
     */
    @Test
    public void testRevisorCadena5() {
        System.out.println("revisorCadena");
        String cadena = "-5+5";
        boolean expResult = false;
        boolean result = Metodos.revisorCadena(cadena);
        assertEquals(expResult, result);
    }
    /**
     * Prueba del método RevisorCadena en el caso de una cadena que termina con algo diferente a un número
     */
    @Test
    public void testRevisorCadena6() {
        System.out.println("revisorCadena");
        String cadena = "3^2x";
        boolean expResult = false;
        boolean result = Metodos.revisorCadena(cadena);
        assertEquals(expResult, result);
    }

    /**
     * Prueba del método InPrinFin en el caso caracter igual a ''.
     */
    @Test
    public void testInPrinFin1() {
        System.out.println("inFin");
        char c = '2';
        boolean expResult = true;
        boolean result = Metodos.inPrinFin(c);
        assertEquals(expResult, result);
    }
    /**
     * Prueba del método InPrinFin en el caso caracter igual a ''.
     */
    @Test
    public void testInPrinFin2() {
        System.out.println("inFin");
        char c = '(';
        boolean expResult = true;
        boolean result = Metodos.inPrinFin(c);
        assertEquals(expResult, result);
    }
    /**
     * Prueba del método InPrinFin en el caso caracter igual a 'x' (algo diferente a un número o un paréntesis).
     */
    @Test
    public void testInPrinFin3() {
        System.out.println("inFin");
        char c = 'x';
        boolean expResult = false;
        boolean result = Metodos.inPrinFin(c);
        assertEquals(expResult, result);
    }
    
}
