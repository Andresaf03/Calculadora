/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package calculadoranet;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Clase de pruebas de la clase InAPos.
 * @author Andrés Álvarez, Nicolás Álvarez, Luis Arguelles, Andrés Sámano.
 */
public class InAPosTest {
    
    public InAPosTest() {
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
     * Prueba del método Inapos en el caso operación correcta con números de más de una cifra y decimales.
     */
    @Test
    public void testInAPos1() {
        System.out.println("InaPos");
        String cadena = "21+6.2x4";
        ArrayList<String> expResult = new ArrayList<String>();
        expResult.add("21");
        expResult.add("6.2");
        expResult.add("4");
        expResult.add("x");
        expResult.add("+");
        ArrayList<String> result = InAPos.inAPos(cadena);
        assertEquals(expResult, result);
    }
    
     /**
     * Prueba del método Inapos en el caso operación con paréntesis balanceados.
     */
    @Test
    public void testInAPos2() {
        System.out.println("InaPos");
        String cadena = "(2+2)x4/4";
        ArrayList<String> expResult = new ArrayList<String>();
        expResult.add("2");
        expResult.add("2");
        expResult.add("+");
        expResult.add("4");
        expResult.add("x");
        expResult.add("4");
        expResult.add("/");
        ArrayList<String> result = InAPos.inAPos(cadena);
        assertEquals(expResult, result);
    }
    /**
     * Prueba del método Inapos en el caso de uso de todos los operadores con jerarquías en desorden.
     */
    @Test
    public void testInAPos3() {
        System.out.println("InaPos");
        String cadena = "1+2^3/4x5-6";
        ArrayList<String> expResult = new ArrayList<String>();
        expResult.add("1");
        expResult.add("2");
        expResult.add("3");
        expResult.add("^");
        expResult.add("4");
        expResult.add("/");
        expResult.add("5");
        expResult.add("x");
        expResult.add("+");
        expResult.add("6");
        expResult.add("-");
        ArrayList<String> result = InAPos.inAPos(cadena);
        assertEquals(expResult, result);
    }
    /**
     * Prueba del método Inapos en el caso de uso de números negativos.
     */
    @Test
    public void testInAPos4() {
        System.out.println("InaPos");
        String cadena = "(-6)-6+4x(-2)";
        ArrayList<String> expResult = new ArrayList<String>();
        expResult.add("-6");
        expResult.add("6");
        expResult.add("-");
        expResult.add("4");
        expResult.add("-2");
        expResult.add("x");
        expResult.add("+");
        ArrayList<String> result = InAPos.inAPos(cadena);
        assertEquals(expResult, result);
    }

    /**
     * Prueba de IsNumeric en el caso número.
     */
    @Test
    public void testIsNumeric1() {
        System.out.println("isNumeric");
        String cadena = "721.93";
        boolean expResult = true;
        boolean result = InAPos.isNumeric(cadena);
        assertEquals(expResult, result);
    }
    /**
     * Prueba de IsNumeric en el caso no número.
     */
    @Test
    public void testIsNumeric2() {
        System.out.println("isNumeric");
        String cadena = "Calculadora";
        boolean expResult = false;
        boolean result = InAPos.isNumeric(cadena);
        assertEquals(expResult, result);
    }
    /**
     * Prueba de IsNumeric en el caso combinación de números y otros caracteres.
     */
    @Test
    public void testIsNumeric3() {
        System.out.println("isNumeric");
        String cadena = "2.3ax9";
        boolean expResult = false;
        boolean result = InAPos.isNumeric(cadena);
        assertEquals(expResult, result);
    }

    /**
     * Prueba del método Calcula en el caso expresión correcta.
     */
    @Test
    public void testCalcula1() {
        System.out.println("calcula");
        ArrayList<String> Caracteres = new ArrayList<String>();
        Caracteres.add("1");
        Caracteres.add("2");
        Caracteres.add("3");
        Caracteres.add("^");
        Caracteres.add("4");
        Caracteres.add("/");
        Caracteres.add("5");
        Caracteres.add("x");
        Caracteres.add("+");
        Caracteres.add("6");
        Caracteres.add("-");
        double expResult = 5.0;
        double result = InAPos.calcula(Caracteres);
        assertEquals(expResult, result, 0);
    }
    /**
     * Prueba del método Calcula en el caso de números negativos en notación postfija.
     */
    @Test
    public void testCalcula2() {
        System.out.println("calcula");
        ArrayList<String> Caracteres = new ArrayList<String>();
        Caracteres.add("-6");
        Caracteres.add("6");
        Caracteres.add("-");
        Caracteres.add("4");
        Caracteres.add("-2");
        Caracteres.add("x");
        Caracteres.add("+");
        double expResult = -20.0;
        double result = InAPos.calcula(Caracteres);
        assertEquals(expResult, result, 0);
    }
    /**
     * Prueba del método Calcula en el caso expresión con números de más de una cifra y decimales.
     */
    @Test
    public void testCalcula3() {
        System.out.println("calcula");
        ArrayList<String> Caracteres = new ArrayList<String>();
        Caracteres.add("21");
        Caracteres.add("6.2");
        Caracteres.add("4");
        Caracteres.add("x");
        Caracteres.add("+");
        double expResult = 45.8;
        double result = InAPos.calcula(Caracteres);
        assertEquals(expResult, result, 0);
    }
    
}
