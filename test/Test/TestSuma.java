/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import org.junit.*;
import static org.junit.Assert.*;
import sumajunit.Suma;

/**
 *
 * @author Male
 */
public class TestSuma {
    
    //private Suma suma = new Suma();
    
    @Before
    public void setUp() {
       // suma.setA(2);
        //suma.setB(3);
    }
    
    @Test
    public void testSuma() {
        Suma suma1 = new Suma();
        suma1.setA(3);
        suma1.setB(3);
        double s = 6;
        assertEquals(suma1.sumar(), s,0.0);
        //fail("Fallo Suma");
        //assertEquals(suma.sumar(), 5);
    }
}
