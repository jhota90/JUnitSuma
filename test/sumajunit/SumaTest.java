/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sumajunit;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Male
 */
public class SumaTest {
    
    public SumaTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    /**
     * Test of setA method, of class Suma.
     */
    @Test
    public void testSetA() {
        System.out.println("setA");
        double a = 0.0;
        Suma instance = new Suma();
        instance.setA(a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setB method, of class Suma.
     */
    @Test
    public void testSetB() {
        System.out.println("setB");
        double b = 0.0;
        Suma instance = new Suma();
        instance.setB(b);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sumar method, of class Suma.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        Suma instance = new Suma();
        double expResult = 0.0;
        double result = instance.sumar();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
