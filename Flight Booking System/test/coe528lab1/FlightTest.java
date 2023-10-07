/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528lab1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author a35choud
 */
public class FlightTest {
    
    public FlightTest() {
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
     * Test of the constructor in class Flight by passing valid arguments.
     */
    @Test
    public void testConstructor(){
        Flight instance = new Flight(1, 2, "origin", "destination", "departure time", 100);
        int expFlightNum = 1;
        int expCapacity = 2;
        String expOrigin = "origin";
        String expDestination = "destination";
        String expDepTime = "departure time";
        double expPrice = 100.0;
        
        int flightNumRes = instance.getFlightNumber();
        int capRes = instance.getCapacity();
        String originRes = instance.getOrigin();
        String destinationRes = instance.getDestination();
        String depTimeRes = instance.getDepartureTime();
        double priceRes = instance.getOriginalPrice();
        
        assertEquals(expFlightNum, flightNumRes);
        assertEquals(expCapacity, capRes);
        assertEquals(expOrigin, originRes);
        assertEquals(expDestination, destinationRes);
        assertEquals(expDepTime, depTimeRes);
        assertEquals(expPrice, priceRes, 0.01);
    }
    
    /**
     * Test of the constructor in class Flight by passing invalid arguments.
     */
    @Test
    public void testInvalidConstructor(){
        boolean check = false;
        try{
            Flight instance = new Flight(1, 2, "origin", "origin", "departure time", 100);
        }
        catch(IllegalArgumentException e){
            check = true;
        }
        assertTrue(check);
    }

    /**
     * Test of getFlightNumber method, of class Flight.
     */
    @Test
    public void testGetFlightNumber() {
        Flight instance = new Flight(1, 2, "origin", "destination", "departure time", 100);
        int expResult = 1;
        int result = instance.getFlightNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCapacity method, of class Flight.
     */
    @Test
    public void testGetCapacity() {
        Flight instance = new Flight(1, 2, "origin", "destination", "departure time", 100);
        int expResult = 2;
        int result = instance.getCapacity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNumberOfSeatsLeft method, of class Flight.
     */
    @Test
    public void testGetNumberOfSeatsLeft() {
        Flight instance = new Flight(1, 2, "origin", "destination", "departure time", 100);
        int expResult = 2;
        int result = instance.getNumberOfSeatsLeft();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getOrigin method, of class Flight.
     */
    @Test
    public void testGetOrigin() {
        Flight instance = new Flight(1, 2, "origin", "destination", "departure time", 100);
        String expResult = "origin";
        String result = instance.getOrigin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDestination method, of class Flight.
     */
    @Test
    public void testGetDestination() {
        Flight instance = new Flight(1, 2, "origin", "destination", "departure time", 100);
        String expResult = "destination";
        String result = instance.getDestination();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDepartureTime method, of class Flight.
     */
    @Test
    public void testGetDepartureTime() {
        Flight instance = new Flight(1, 2, "origin", "destination", "departure time", 100);
        String expResult = "departure time";
        String result = instance.getDepartureTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getOriginalPrice method, of class Flight.
     */
    @Test
    public void testGetOriginalPrice() {
        Flight instance = new Flight(1, 2, "origin", "destination", "departure time", 100);
        double expResult = 100;
        double result = instance.getOriginalPrice();
        assertEquals(expResult, result, 100);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setFlightNumber method, of class Flight.
     */
    @Test
    public void testSetFlightNumber() {
        System.out.println("setFlightNumber");
        int f = 2;
        Flight instance = new Flight(1, 2, "origin", "destination", "departure time", 100);
        instance.setFlightNumber(f);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCapacity method, of class Flight.
     */
    @Test
    public void testSetCapacity() {
        System.out.println("setCapacity");
        int c = 1;
        Flight instance = new Flight(1, 2, "origin", "destination", "departure time", 100);
        instance.setCapacity(c);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNumberOfSeatsLeft method, of class Flight.
     */
    @Test
    public void testSetNumberOfSeatsLeft() {
        System.out.println("setNumberOfSeatsLeft");
        int n = 1;
        Flight instance = new Flight(1, 2, "origin", "destination", "departure time", 100);
        instance.setNumberOfSeatsLeft(n);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setOrigin method, of class Flight.
     */
    @Test
    public void testSetOrigin() {
        System.out.println("setOrigin");
        String o = "new origin";
        Flight instance = new Flight(1, 2, "origin", "destination", "departure time", 100);
        instance.setOrigin(o);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDestination method, of class Flight.
     */
    @Test
    public void testSetDestination() {
        System.out.println("setDestination");
        String d = "new destination";
        Flight instance = new Flight(1, 2, "origin", "destination", "departure time", 100);
        instance.setDestination(d);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDepartureTime method, of class Flight.
     */
    @Test
    public void testSetDepartureTime() {
        System.out.println("setDepartureTime");
        String de = "departure time";
        Flight instance = new Flight(1, 2, "origin", "destination", "departure time", 100);
        instance.setDepartureTime(de);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setOriginalPrice method, of class Flight.
     */
    @Test
    public void testSetOriginalPrice() {
        System.out.println("setOriginalPrice");
        double o = 200;
        Flight instance = new Flight(1, 2, "origin", "destination", "departure time", 100);
        instance.setOriginalPrice(o);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of bookASeat method, of class Flight.
     */
    @Test
    public void testBookASeat() {
        System.out.println("bookASeat");
        Flight instance = new Flight(1, 0, "origin", "destination", "departure time", 100);
        boolean expResult = false;
        boolean result = instance.bookASeat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Flight.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Flight instance = new Flight(1, 2, "origin", "destination", "departure time", 100);
        String expResult = "Flight 1, origin to destination, departure time, original price: $100.0";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
