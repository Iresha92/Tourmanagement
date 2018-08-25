/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class TownTest {
    
    public TownTest() {
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
     * Test of getOverNightStop method, of class Town.
     */
    @Test
    public void testGetOverNightStop() {
        System.out.println("getOverNightStop");
        Town instance = null;
        boolean expResult = false;
        boolean result = instance.getOverNightStop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOverNightStop method, of class Town.
     */
    @Test
    public void testSetOverNightStop() {
        System.out.println("setOverNightStop");
        boolean isOverNight = false;
        Town instance = null;
        instance.setOverNightStop(isOverNight);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTownName method, of class Town.
     */
    @Test
    public void testGetTownName() {
        System.out.println("getTownName");
        Town instance = null;
        String expResult = "";
        String result = instance.getTownName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTownName method, of class Town.
     */
    @Test
    public void testSetTownName() {
        System.out.println("setTownName");
        String townName = "";
        Town instance = null;
        instance.setTownName(townName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
