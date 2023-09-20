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
 * Clase de pruebas de la Clase VistaCalculadora.
 * @author Andrés Álvarez, Nicolás Álvarez, Luis Arguelles, Andrés Sámano.
 */
public class VistaCalculadoraTest {
    
    public VistaCalculadoraTest() {
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
     * Prueba del método cambiaSigno en el caso número positivo como última entrada.
     */
    @Test
    public void testCambiaSigno1() {
        System.out.println("cambiaSigno");
        String cadena = "(3+6x4)/5";
        VistaCalculadora instance = new VistaCalculadora();
        String expResult = "(3+6x4)/(-5)";
        String result = instance.cambiaSigno(cadena);
        assertEquals(expResult, result);
    }
    /**
     * Prueba del método cambiaSigno en el caso número negativo como última entrada.
     */
    @Test
    public void testCambiaSigno2() {
        System.out.println("cambiaSigno");
        String cadena = "9x2/4-(-6)";
        VistaCalculadora instance = new VistaCalculadora();
        String expResult = "9x2/4-6";
        String result = instance.cambiaSigno(cadena);
        assertEquals(expResult, result);
    }

    /**
     * Prueba del método respuesta que utiliza los métodos inAPos y calcula ya probados.
     */
    @Test
    public void testRespuesta() {
        System.out.println("respuesta");
        String cadena = "(32+(-22))x(6/2)-1.1-(3^2)x((-4)+5)";
        String cadena1 = "(32+(-22))x(6/2)-1.1-(3^2)x((-4)+5)"; //solamente se realizará una prueba compleja
        VistaCalculadora instance = new VistaCalculadora();
        double expResult = 19.9;
        double result = instance.respuesta(cadena1);
        assertEquals(expResult, result, 0);
    }

}
