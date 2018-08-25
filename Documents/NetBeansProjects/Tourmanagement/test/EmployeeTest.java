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
public class EmployeeTest {
    
    public EmployeeTest() {
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
     * Test of getName method, of class Employee.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Employee instance = new Employee();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Employee.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Employee instance = new Employee();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmpCode method, of class Employee.
     */
    @Test
    public void testGetEmpCode() {
        System.out.println("getEmpCode");
        Employee instance = new Employee();
        String expResult = "";
        String result = instance.getEmpCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmpCode method, of class Employee.
     */
    @Test
    public void testSetEmpCode() {
        System.out.println("setEmpCode");
        String empCode = "";
        Employee instance = new Employee();
        instance.setEmpCode(empCode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAddress method, of class Employee.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        Employee instance = new Employee();
        String expResult = "";
        String result = instance.getAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAddress method, of class Employee.
     */
    @Test
    public void testSetAddress() {
        System.out.println("setAddress");
        String address = "";
        Employee instance = new Employee();
        instance.setAddress(address);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContact method, of class Employee.
     */
    @Test
    public void testGetContact() {
        System.out.println("getContact");
        Employee instance = new Employee();
        int expResult = 0;
        int result = instance.getContact();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setContact method, of class Employee.
     */
    @Test
    public void testSetContact() {
        System.out.println("setContact");
        int contact = 0;
        Employee instance = new Employee();
        instance.setContact(contact);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
