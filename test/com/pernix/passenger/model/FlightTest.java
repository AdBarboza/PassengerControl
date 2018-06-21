/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pernix.passenger.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Adrián
 */
public class FlightTest {
    private Flight flight;
    
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
        flight =  new Flight("FF4", "AIR", "20/11/2018", "RUSIA", "12:00:00",
                "COSTA RICA", "15:15:08",30);
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addPassenger method, of class Flight.
     */
    @Test
    public void testAddPassengerNull() {
        PassengerTicket passenger = null;
        assertFalse(flight.addPassenger(passenger));
    }
    
    @Test
    public void testAddPassengerInPassengers() {
        PassengerTicket passenger = new PassengerTicket("Juan", "123456789",
                "E12", "A22", "03:12:00");
        assertTrue(flight.addPassenger(passenger));
        passenger = new PassengerTicket("Juan", "123456789", "E12", "A22",
                "03:12:00");
        assertFalse(flight.addPassenger(passenger));
    }
    
    @Test
    public void testAddPassengerOutOfIndexNotAdd() {
        PassengerTicket passenger;
        for (int i = 0; i < 30; i++) {
            passenger = new PassengerTicket("Juan", "123456789", "E12", "A22",
                    "03:12:00");
            flight.addPassenger(passenger);   
        }
        passenger = new PassengerTicket("Juan", "123456789", "E12", "A22",
                "03:12:00");
        assertFalse(flight.addPassenger(passenger));
    }
    
        @Test
    public void testAddPassenger1() {
        PassengerTicket passenger = new PassengerTicket("Juan", "123456789",
                "E12", "A22", "03:12:00");
        assertTrue(flight.addPassenger(passenger));
    }
    @Test
    public void testAddPassenger2() {
        PassengerTicket passenger = new PassengerTicket("Juan", "123456789",
                "E12", "A22", "03:12:00");
        assertTrue(flight.addPassenger(passenger));
        
        passenger = new PassengerTicket("Juan", "12546649",
                "E12", "A23", "03:12:00");
        assertTrue(flight.addPassenger(passenger));

        passenger = new PassengerTicket("Juan", "846454648",
                "E12", "A24", "03:12:00");
        assertTrue(flight.addPassenger(passenger));        
    }

    /**
     * Test of removePassenger method, of class Flight.
     */
    @Test
    public void testRemovePassenger() {
        System.out.println("removePassenger");
        String passportCode = "";
        Flight instance = new Flight();
        boolean expResult = false;
        boolean result = instance.removePassenger(passportCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of countPassengers method, of class Flight.
     */
    @Test
    public void testCountPassengers() {
        System.out.println("countPassengers");
        Flight instance = new Flight();
        int expResult = 0;
        int result = instance.countPassengers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkInPassenger method, of class Flight.
     */
    @Test
    public void testCheckInPassenger() {
        System.out.println("checkInPassenger");
        String passportCode = "";
        Flight instance = new Flight();
        boolean expResult = false;
        boolean result = instance.checkInPassenger(passportCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
}
