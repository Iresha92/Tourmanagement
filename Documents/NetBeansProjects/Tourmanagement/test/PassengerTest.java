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
public class PassengerTest {
    
    public PassengerTest() {
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
     * Test of getName method, of class Passenger.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Passenger instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Passenger.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Passenger instance = null;
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPreferences method, of class Passenger.
     */
    @Test
    public void testGetPreferences() {
        System.out.println("getPreferences");
        Passenger instance = null;
        String expResult = "";
        String result = instance.getPreferences();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPreferences method, of class Passenger.
     */
    @Test
    public void testSetPreferences() {
        System.out.println("setPreferences");
        String preferences = "";
        Passenger instance = null;
        instance.setPreferences(preferences);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAddress method, of class Passenger.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        Passenger instance = null;
        String expResult = "";
        String result = instance.getAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAddress method, of class Passenger.
     */
    @Test
    public void testSetAddress() {
        System.out.println("setAddress");
        String address = "";
        Passenger instance = null;
        instance.setAddress(address);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContact method, of class Passenger.
     */
    @Test
    public void testGetContact() {
        System.out.println("getContact");
        Passenger instance = null;
        int expResult = 0;
        int result = instance.getContact();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setContact method, of class Passenger.
     */
    @Test
    public void testSetContact() {
        System.out.println("setContact");
        int contact = 0;
        Passenger instance = null;
        instance.setContact(contact);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGender method, of class Passenger.
     */
    @Test
    public void testGetGender() {
        System.out.println("getGender");
        Passenger instance = null;
        String expResult = "";
        String result = instance.getGender();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGender method, of class Passenger.
     */
    @Test
    public void testSetGender() {
        System.out.println("setGender");
        String gender = "";
        Passenger instance = null;
        instance.setGender(gender);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateOfBirth method, of class Passenger.
     */
    @Test
    public void testGetDateOfBirth() {
        System.out.println("getDateOfBirth");
        Passenger instance = null;
        String expResult = "";
        String result = instance.getDateOfBirth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateOfBirth method, of class Passenger.
     */
    @Test
    public void testSetDateOfBirth() {
        System.out.println("setDateOfBirth");
        String dateOfBirth = "";
        Passenger instance = null;
        instance.setDateOfBirth(dateOfBirth);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerTour method, of class Passenger.
     */
    @Test
    public void testRegisterTour() {
        System.out.println("registerTour");
        int tourID = 0;
        Passenger instance = null;
        int expResult = 0;
        int result = instance.registerTour(tourID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of payment method, of class Passenger.
     */
    @Test
    public void testPayment() {
        System.out.println("payment");
        String billID = "";
        Passenger instance = null;
        boolean expResult = false;
        boolean result = instance.payment(billID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
