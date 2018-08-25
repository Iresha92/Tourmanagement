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
public class ManagerTest {
    
    public ManagerTest() {
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
     * Test of assignRoute method, of class Manager.
     */
    @Test
    public void testAssignRoute() {
        System.out.println("assignRoute");
        Route route = null;
        Manager instance = new Manager();
        instance.assignRoute(route);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of assignDriver method, of class Manager.
     */
    @Test
    public void testAssignDriver() {
        System.out.println("assignDriver");
        Driver driver = null;
        Manager instance = new Manager();
        instance.assignDriver(driver);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reserveTour method, of class Manager.
     */
    @Test
    public void testReserveTour() {
        System.out.println("reserveTour");
        Tour tour = null;
        Manager instance = new Manager();
        instance.reserveTour(tour);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createBill method, of class Manager.
     */
    @Test
    public void testCreateBill() {
        System.out.println("createBill");
        Bill bill = null;
        Manager instance = new Manager();
        instance.createBill(bill);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
