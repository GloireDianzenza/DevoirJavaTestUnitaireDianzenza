/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Exo2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jacqu
 */
public class ClasseExo2Test {
    
    public ClasseExo2Test() {
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
     * Test of CalculerForfait method, of class ClasseExo2.
     */
    @Test
    public void testCalculerForfait()
    {
        // Cas n°1
        double expResult = 14.0;
        double result = ClasseExo2.CalculerForfait(true, 25, true, true);
        assertEquals(expResult, result,0);
        
        
        // Cas n°2
        expResult = 30.0;
        result = ClasseExo2.CalculerForfait(false, 25, true, true);
        assertEquals(expResult, result,0);
        
        
        // Cas n°3
        expResult = 21.0;
        result = ClasseExo2.CalculerForfait(false, 8, true, true);
        assertEquals(expResult, result,0);
        
        
        // Cas n°4
        expResult = 11.0;
        result = ClasseExo2.CalculerForfait(true, 12, true, false);
        assertEquals(expResult, result,0);
        
        
    }
}
