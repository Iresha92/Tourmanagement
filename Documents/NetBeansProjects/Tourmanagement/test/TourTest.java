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
public class TourTest {
    
    public TourTest() {
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
     * Test of getTourID method, of class Tour.
     */
    @Test
    public void testGetTourID() {
        System.out.println("getTourID");
        Tour instance = null;
        int expResult = 0;
        int result = instance.getTourID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTourID method, of class Tour.
     */
    @Test
    public void testSetTourID() {
        System.out.println("setTourID");
        int tourID = 0;
        Tour instance = null;
        instance.setTourID(tourID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTourDate method, of class Tour.
     */
    @Test
    public void testGetTourDate() {
        System.out.println("getTourDate");
        Tour instance = null;
        String expResult = "";
        String result = instance.getTourDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTourDate method, of class Tour.
     */
    @Test
    public void testSetTourDate() {
        System.out.println("setTourDate");
        String tourDate = "";
        Tour instance = null;
        instance.setTourDate(tourDate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
