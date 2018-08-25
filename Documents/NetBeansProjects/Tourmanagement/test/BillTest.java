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
public class BillTest {
    
    public BillTest() {
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
     * Test of getdate method, of class Bill.
     */
    @Test
    public void testGetdate() {
        System.out.println("getdate");
        Bill instance = null;
        String expResult = "";
        String result = instance.getdate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setdate method, of class Bill.
     */
    @Test
    public void testSetdate() {
        System.out.println("setdate");
        String date = "";
        Bill instance = null;
        instance.setdate(date);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCount method, of class Bill.
     */
    @Test
    public void testGetCount() {
        System.out.println("getCount");
        Bill instance = null;
        int expResult = 0;
        int result = instance.getCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCount method, of class Bill.
     */
    @Test
    public void testSetCount() {
        System.out.println("setCount");
        int count = 0;
        Bill instance = null;
        instance.setCount(count);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBillID method, of class Bill.
     */
    @Test
    public void testGetBillID() {
        System.out.println("getBillID");
        Bill instance = null;
        String expResult = "";
        String result = instance.getBillID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBillID method, of class Bill.
     */
    @Test
    public void testSetBillID() {
        System.out.println("setBillID");
        String billID = "";
        Bill instance = null;
        instance.setBillID(billID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
