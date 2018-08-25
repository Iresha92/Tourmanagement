/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ishk
 */
public class RouteTest {
    
    public RouteTest() {
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
     * Test of getLength method, of class Route.
     */
    @Test
    public void testGetLength() {
        System.out.println("getLength");
        Route instance = null;
        double expResult = 0.0;
        double result = instance.getLength();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLength method, of class Route.
     */
    @Test
    public void testSetLength() {
        System.out.println("setLength");
        double length = 0.0;
        Route instance = null;
        instance.setLength(length);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDuration method, of class Route.
     */
    @Test
    public void testGetDuration() {
        System.out.println("getDuration");
        Route instance = null;
        String expResult = "";
        String result = instance.getDuration();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDuration method, of class Route.
     */
    @Test
    public void testSetDuration() {
        System.out.println("setDuration");
        String duration = "";
        Route instance = null;
        instance.setDuration(duration);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTowns method, of class Route.
     */
    @Test
    public void testGetTowns() {
        System.out.println("getTowns");
        Route instance = null;
        List<Town> expResult = null;
        List<Town> result = instance.getTowns();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTowns method, of class Route.
     */
    @Test
    public void testSetTowns() {
        System.out.println("setTowns");
        List<Town> towns = null;
        Route instance = null;
        instance.setTowns(towns);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
